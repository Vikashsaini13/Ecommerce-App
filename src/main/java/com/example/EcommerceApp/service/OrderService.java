package com.example.EcommerceApp.service;

import com.example.EcommerceApp.model.Order;
import com.example.EcommerceApp.repository.IOrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    IOrderRepo iOrderRepo;

    public String createOrder(Order order) {
        iOrderRepo.save(order);
        return "order placed";
    }
}
