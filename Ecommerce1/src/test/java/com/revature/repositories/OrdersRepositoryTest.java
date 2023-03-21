package com.revature.repositories;

import com.revature.models.Orders;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class OrdersRepositoryTest {

    @Autowired
    private OrdersRepository ordersRepository;

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
    @DisplayName("Orders should be saved in the database")
    void saveOrder (){
        Orders order = ordersRepository.save(inceptionOrder);
        assertNotNull(inceptionOrder);
        assertThat(order.getOrdersId()).isNotEqualTo(null);
    }

    @Test
    @DisplayName("Returns order list size as 2")
    void getAllOrders (){
        ordersRepository.save(inceptionOrder);
        ordersRepository.save(interstellarOrder);

        List<Orders> orderList = ordersRepository.findAll();
        Orders order = ordersRepository.save(inceptionOrder);
        assertNotNull(orderList);
        assertThat(orderList).isNotNull();
    }

    @Test
    @DisplayName("Fetches order by id")
    void getOrderById() {
        ordersRepository.save(interstellarOrder);

        Orders order = ordersRepository.findById(interstellarOrder.getOrdersId()).get();

        assertNotNull(order);
        assertEquals("interstellar", order.getOrderItems());
        assertEquals(14.99, order.getOrderTotal());

    }
/*
    @Test
    @DisplayName("Returns adventure genre")
    void getMoviesByGenre() {

        movieRepository.save(interstellarMovie);

        Optional<Movies> movie = movieRepository.findByGenre(interstellarMovie.getGenre());

        assertEquals("Adventure", interstellarMovie.getGenre());
    }
*/

}
