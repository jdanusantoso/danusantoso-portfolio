package com.revature.controllers;


import static org.hamcrest.CoreMatchers.is;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.models.Users;
import com.revature.repositories.UserRepository;
import com.revature.service.UserService;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import java.util.*;


import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@WebMvcTest(UserController.class)
public class UserControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UserRepository usersRepository;

    @MockBean
    private UserService userService;

    @Autowired
    private ObjectMapper objectMapper;

    private Users user1;

    private Users user2;


    @BeforeEach
    void setUp() throws Exception {

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
    //HTTP Requests-------------------------------

        @Test
        void shouldCreateNewUser() throws Exception {

            when(userService.save(any(Users.class))).thenReturn(user2);


            this.mockMvc.perform(post("/users/registerUser")
                            .contentType(MediaType.APPLICATION_JSON)
                            .content(objectMapper.writeValueAsString(user2)))
                    .andExpect(status().isCreated())
                    .andExpect(jsonPath("$.first_name", is(user2.getFirst_name())))
                    .andExpect(jsonPath("$.last_name", is(user2.getLast_name())))
                    .andExpect(jsonPath("$.email", is(user2.getEmail())))
                    .andExpect(jsonPath("$.username", is(user2.getUsername())))
                    .andExpect(jsonPath("$.password", is(user2.getPassword())));

                    //Original
//                    .andExpect(status().isCreated())
//                    .andDo(print())
//                    .andReturn();



        }

    @Test
    void shouldFetchAllUsers() throws Exception {

        List<Users> list = new ArrayList<>();
        list.add(user1);
        list.add(user2);

        when(userService.getAllUsers()).thenReturn(list);

        this.mockMvc.perform(get("/users/getAllUsers"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.size()", is(list.size())));
    }

    @Test
    void login() throws Exception {

        when(userService.getByUsernameAndPassword(anyString(), anyString())).thenReturn(user2);

        this.mockMvc.perform(get("/users/login/{username}/{password}", "jcrayker3", "X3fRr6du90"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.username", is(user2.getUsername())))
                .andExpect(jsonPath("$.password", is(user2.getPassword())));

    }

//    @Test
//    void loginEmailPassword() throws Exception {
//
//        when(userService.getByEmailAndPassword(anyString(), anyString())).thenReturn(user2);
//
//        this.mockMvc.perform(get("/users/login/email/{email}/{password}", "jcrayker3@auda.org.au", "X3fRr6du90"))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$.email", is(user2.getEmail())))
//                .andExpect(jsonPath("$.password", is(user2.getPassword())));
//
//    }
}
