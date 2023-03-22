package com.revature.controllers;

;
import com.revature.repositories.OrdersRepository;
import com.revature.models.Orders;
import com.revature.service.OrdersService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
@CrossOrigin("*")
@AllArgsConstructor
public class OrdersController {

    private OrdersRepository ordersRepository;

    private OrdersService ordersService;


    //HTTP Requests-------------------------------

    @GetMapping(value="/{ordersId}")
    //url : localhost:5556/data/movies/{genre}
    public Orders findById(@PathVariable int ordersId){

        return ordersService.getById(ordersId);

    }


    //insert digimon - every POST request to /digimon will go here

    @PostMapping(value="/new")
    @ResponseStatus(HttpStatus.CREATED)
    //url : localhost:5556/data/orders/new
    public Orders /*ResponseEntity*/ addOrder(@RequestBody Orders o){
        return ordersService.save(o);
    }

}
