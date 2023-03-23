package com.revature.service;

import com.revature.models.Users;

import com.revature.repositories.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {
    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserService userService;

    Users user1 = new Users();
    Users user2 = new Users();

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
        user2.setFirst_name("Jamal");
        user2.setLast_name("Crayker");
        user2.setEmail("jcrayker3@auda.org.au");
        user2.setUsername("jcrayker3");
        user2.setPassword("X3fRr6du90");
    }

    @Test
    void save() {

        when(userRepository.save(any(Users.class))).thenReturn(user2);

        Users newUser = userService.save(user1);

        assertNotNull(newUser);
        assertThat(user2.getEmail()).isEqualTo("jcrayker3@auda.org.au");
        assertThat(user2.getUsername()).isEqualTo("jcrayker3");
        assertThat(user2.getPassword()).isEqualTo("X3fRr6du90");
    }

    @Test
    void register() {

        when(userRepository.save(any(Users.class))).thenReturn(user2);

        Users newUser = userService.save(user1);

        assertNotNull(newUser);
        assertThat(user2.getEmail()).isEqualTo("jcrayker3@auda.org.au");
        assertThat(user2.getUsername()).isEqualTo("jcrayker3");
        assertThat(user2.getPassword()).isEqualTo("X3fRr6du90");
    }

    @Test
    void loginUser() {
        when(userRepository.getByUsernameAndPassword("atruesdale2", "cITMUn")).thenReturn(Optional.of(user1));
        Users newUser = userService.getByUsernameAndPassword(user1.getUsername(), user1.getPassword());
        assertNotNull(newUser);
        assertThat(newUser).isNotEqualTo(null);
    }

    @Test
    void loginUserForExceptionUsername() {
        when(userRepository.getByUsernameAndPassword("atruesdale2", "X3fRr6du90")).thenReturn(Optional.of(user2));
        assertThrows(RuntimeException.class, () -> {
            userService.getByUsernameAndPassword(user2.getUsername(), user2.getPassword());
        });
    }

    @Test
    void loginUserForExceptionPassword() {
        when(userRepository.getByUsernameAndPassword("jcrayker3", "cITMUn")).thenReturn(Optional.of(user2));
        assertThrows(RuntimeException.class, () -> {
            userService.getByUsernameAndPassword(user2.getUsername(), user2.getPassword());
        });
    }

    @Test
    void loginUserForExceptionUsernamePassword() {
        when(userRepository.getByUsernameAndPassword("atruesdale2", "cITMUn")).thenReturn(Optional.of(user2));
        assertThrows(RuntimeException.class, () -> {
            userService.getByUsernameAndPassword(user2.getUsername(), user2.getPassword());
        });
    }

    @Test
    void loginUserEmailAndPassword() {
        when(userRepository.getByEmailAndPassword("atruesdale2@exblog.jp", "cITMUn")).thenReturn(Optional.of(user1));
        Users newUser = userService.getByEmailAndPassword(user1.getEmail(), user1.getPassword());
        assertNotNull(newUser);
        assertThat(newUser).isNotEqualTo(null);
    }

    @Test
    void loginUserForExceptionEmail() {
        when(userRepository.getByEmailAndPassword("atruesdale2", "X3fRr6du90")).thenReturn(Optional.of(user2));
        assertThrows(RuntimeException.class, () -> {
            userService.getByEmailAndPassword(user2.getEmail(), user2.getPassword());
        });
    }

    @Test
    void loginUserForExceptionWithPassword() {
        when(userRepository.getByEmailAndPassword("jcrayker3", "cITMUn")).thenReturn(Optional.of(user2));
        assertThrows(RuntimeException.class, () -> {
            userService.getByEmailAndPassword(user2.getUsername(), user2.getPassword());
        });
    }

    @Test
    void loginUserForExceptionWithUsernamePassword() {
        when(userRepository.getByEmailAndPassword("jcrayker3@auda.org.au", "cITMUn")).thenReturn(Optional.of(user2));
        assertThrows(RuntimeException.class, () -> {
            userService.getByEmailAndPassword(user2.getUsername(), user2.getPassword());
        });
    }

}