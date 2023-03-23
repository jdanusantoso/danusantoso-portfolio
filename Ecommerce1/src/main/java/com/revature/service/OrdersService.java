package com.revature.service;

import com.revature.exceptions.OrderDoesNotExistException;
import com.revature.models.Orders;
import com.revature.repositories.OrdersRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@AllArgsConstructor
@Service
public class OrdersService {

    private final OrdersRepository ordersRepository;


    public Orders save (Orders orders) {
        return ordersRepository.save(orders);
    }


    public Orders getById(int ordersId) {
        return ordersRepository.findById(ordersId).orElseThrow(OrderDoesNotExistException::new);
   }



}
