package com.revature.controllers;

import static org.hamcrest.CoreMatchers.is;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.models.Orders;
import com.revature.repositories.OrdersRepository;
import com.revature.service.OrdersService;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;

import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;


import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@WebMvcTest(OrdersController.class)
public class OrdersControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private OrdersRepository ordersRepository;

    @MockBean
    private OrdersService ordersService;

    @Autowired
    private ObjectMapper objectMapper;

    Orders inceptionOrder = new Orders();
    Orders interstellarOrder = new Orders();

    @BeforeEach
    void init() {
        inceptionOrder = new Orders();
        inceptionOrder.setOrdersId(1);
        inceptionOrder.setOrderItems("inception");
        inceptionOrder.setOrderTotal(9.99);


        interstellarOrder = new Orders();
        interstellarOrder.setOrdersId(2);
        interstellarOrder.setOrderItems("interstellar");
        interstellarOrder.setOrderTotal(14.99);
    }

    @Test
    void shouldCreateNewOrder() throws Exception {

        when(ordersService.save(any(Orders.class))).thenReturn(inceptionOrder);


        this.mockMvc.perform(post("/orders/new")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(inceptionOrder)))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.orderItems", is(inceptionOrder.getOrderItems())))
                .andExpect(jsonPath("$.orderTotal", is(inceptionOrder.getOrderTotal())));


    }

    @Test
    void shouldFetchOneMovieById() throws Exception {

        when(ordersService.getById(anyInt())).thenReturn(interstellarOrder);

        this.mockMvc.perform(get("/orders/{ordersId}", 2))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.ordersId", is(interstellarOrder.getOrdersId())))
                .andExpect(jsonPath("$.orderItems", is(interstellarOrder.getOrderItems())))
                .andExpect(jsonPath("$.orderTotal", is(interstellarOrder.getOrderTotal())));
    }

}
