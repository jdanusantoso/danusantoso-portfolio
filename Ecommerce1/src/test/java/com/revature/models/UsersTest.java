package com.revature.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class UsersTest {
    private Users users;

    @BeforeEach
    void setUp() {

        users = Users.builder().user_id(1)
                .first_name("Reuben")
                .last_name("Falconer")
                .email("rfalconer1@netlog.com")
                .username("rfalconer1")
                .password("eB2Vt3hP")
                .build();
    }

    @Test
    void getUserId() {
        assertNotNull(users);
        assertEquals(1, users.getUser_id());
    }

    @Test
    void setId() {
        assertNotNull(users);
        users.setUser_id(2);
        assertEquals(2, users.getUser_id());
    }

    @Test
    void setFirstName() {
        assertNotNull(users);
        users.setFirst_name("Reuben");
        assertEquals("Reuben", users.getFirst_name());
    }
    @Test
    void getFirstName() {
        assertNotNull(users);
        assertEquals("Reuben", users.getFirst_name());
    }

    @Test
    void setLastName() {
        assertNotNull(users);
        users.setFirst_name("Falconer");
        assertEquals("Falconer", users.getLast_name());
    }
    @Test
    void getLastName() {
        assertNotNull(users);
        assertEquals("Falconer", users.getLast_name());
    }

    @Test
    void setEmail() {
        assertNotNull(users);
        users.setFirst_name("rfalconer1@netlog.com");
        assertEquals("rfalconer1@netlog.com", users.getEmail());
    }
    @Test
    void getEmail() {
        assertNotNull(users);
        assertEquals("rfalconer1@netlog.com", users.getEmail());
    }

    @Test
    void setUsername() {
        assertNotNull(users);
        users.setFirst_name("rfalconer1");
        assertEquals("rfalconer1", users.getUsername());
    }
    @Test
    void getUsername() {
        assertNotNull(users);
        assertEquals("rfalconer1", users.getUsername());
    }

    @Test
    void setPassword() {
        assertNotNull(users);
        users.setPassword("eB2Vt3hP");
        assertEquals("eB2Vt3hP", users.getPassword());
    }
    @Test
    void getPassword() {
        assertNotNull(users);
        assertEquals("eB2Vt3hP", users.getPassword());
    }



}
