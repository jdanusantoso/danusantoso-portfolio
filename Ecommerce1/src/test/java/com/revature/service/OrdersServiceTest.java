package com.revature.service;

import com.revature.models.Orders;
import com.revature.repositories.OrdersRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
public class OrdersServiceTest {

    @Mock
    private OrdersRepository ordersRepository;

    @InjectMocks
    private OrdersService orderService;

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
    void saveTest() {

        when(ordersRepository.save(any(Orders.class))).thenReturn(inceptionOrder);

        Orders newOrder = orderService.save(inceptionOrder);

        assertNotNull(newOrder);
        assertThat(newOrder.getOrdersId()).isEqualTo(1);
        assertThat(newOrder.getOrderItems()).isEqualTo("inception");
        assertThat(newOrder.getOrderTotal()).isEqualTo(9.99);
    }

    @Test
    void findByIdTest() {
        when(ordersRepository.findById(2)).thenReturn(Optional.of(interstellarOrder));
        Orders existingOrder = orderService.getById(interstellarOrder.getOrdersId());
        assertNotNull(existingOrder);
        assertThat(existingOrder.getOrdersId()).isNotEqualTo(null);
    }

    @Test
    void findByIdTestException() {
        when(ordersRepository.findById(2)).thenReturn(Optional.of(inceptionOrder));
        assertThrows(RuntimeException.class, () -> {
            orderService.getById(inceptionOrder.getOrdersId());
        });
    }


}
