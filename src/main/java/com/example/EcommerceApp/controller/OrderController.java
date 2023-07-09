package com.example.EcommerceApp.controller;

import com.example.EcommerceApp.model.Order;
import com.example.EcommerceApp.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    OrderService orderService;

    //create order

    @PostMapping("order")
    public String createOrder(@RequestBody Order order){
        return orderService.createOrder(order);
    }
}
