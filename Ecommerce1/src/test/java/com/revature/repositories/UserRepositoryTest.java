package com.revature.repositories;

import com.revature.models.Users;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


@SpringBootTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    Users user1 = new Users();
    Users user2 = new Users();

    Users user4 = new Users();

    @BeforeEach
    void init() {
        user1 = new Users();
        user1.setUser_id(1);
        user1.setFirst_name("Adara");
        user1.setLast_name("Truesdale");
        user1.setEmail("atruesdale2@exblog.jp");
        user1.setUsername("atruesdale2");
        user1.setPassword("cITMUn");

        user2 = new Users();
        user2.setUser_id(2);
        user2.setFirst_name("Innis");
        user2.setLast_name("Derx");
        user2.setEmail("iderx1@live.com");
        user2.setUsername("iderx1");
        user2.setPassword("De7gJ8i");

        user4 = new Users();
        user4.setUser_id(4);
        user4.setFirst_name("Jamal");
        user4.setLast_name("Crayker");
        user4.setEmail("jcrayker3@auda.org.au");
        user4.setUsername("jcrayker3");
        user4.setPassword("X3fRr6du90");
    }

    @Test
    @DisplayName("It should save the movie to the database")
    void save() {
        Users newUser = userRepository.save(user4);
        assertNotNull(user4);
        assertThat(newUser.getUser_id()).isNotEqualTo(null);
    }

    @Test
    @DisplayName("It should return the user list with size of 2")
    void getAllUsers() {
        userRepository.save(user1);
       userRepository.save(user2);


        List<Users> list = userRepository.findAll();

        assertNotNull(list);
        assertThat(list).isNotNull();
        assertEquals(11, list.size());
    }

    @Test
    @DisplayName("It should return the user by username")
    void getUserByUsername() {
//        userRepository.save(user2);

       Users newUser = userRepository.getByUsername(user4.getUsername());

        assertNotNull(newUser);
        assertEquals(4, newUser.getUser_id());
        assertEquals("Jamal", newUser.getFirst_name());
        assertEquals("Crayker", newUser.getLast_name());
        assertEquals("jcrayker3@auda.org.au", newUser.getEmail());
        assertEquals("X3fRr6du90", newUser.getPassword());
    }

    @Test
    @DisplayName("It should return the correct user with username and password")
    void getUsersByUsernameAndPassword() {

//        userRepository.save(user2);

        Optional<Users> newUser = userRepository.getByUsernameAndPassword(user2.getUsername(), user2.getPassword());

        assertEquals("iderx1", newUser.get().getUsername());
        assertEquals("De7gJ8i", newUser.get().getPassword());
    }

    @Test
    @DisplayName("It should return the user login info and password")
    void getUsersByEmailAndPassword() {

//        userRepository.save(user2);

        Optional<Users> newUser = userRepository.getByEmailAndPassword(user4.getEmail(), user4.getPassword());


        assertEquals("jcrayker3@auda.org.au", newUser.get().getEmail());
        assertEquals("X3fRr6du90", newUser.get().getPassword());
    }


}