package com.revature.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class OrdersTest {

    private Orders orders;

    @BeforeEach
    void setUp() {

        orders = Orders.builder().ordersId(1)
                .orderItems("The Lord of the Rings: The Fellowship of the Ring, The Two Towers, The Return of the King")
                .orderTotal(49.99)
                .build();
    }

    @Test
    void getOrdersId() {
        assertNotNull(orders);
        assertEquals(1, orders.getOrdersId());
    }

    @Test
    void setOrdersId() {
        assertNotNull(orders);
        orders.setOrdersId(2);
        assertEquals(2, orders.getOrdersId());
    }

    @Test
    void setOrderItems() {
        assertNotNull(orders);
        orders.setOrderItems("The Lord of the Rings: The Fellowship of the Ring, The Two Towers, The Return of the King");
        assertEquals("The Lord of the Rings: The Fellowship of the Ring, The Two Towers, The Return of the King", orders.getOrderItems());
    }
    @Test
    void getOrderItems() {
        assertNotNull(orders);
        assertEquals("The Lord of the Rings: The Fellowship of the Ring, The Two Towers, The Return of the King", orders.getOrderItems());
    }

    @Test
    void setOrderTotal() {
        assertNotNull(orders);
        orders.setOrderTotal(49.99);
        assertEquals(49.99, orders.getOrderTotal());
    }
    @Test
    void getOrderTotal() {
        assertNotNull(orders);
        assertEquals(49.99, orders.getOrderTotal());
    }

}
