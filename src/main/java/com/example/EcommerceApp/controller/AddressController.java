package com.example.EcommerceApp.controller;

import com.example.EcommerceApp.model.Address;
import com.example.EcommerceApp.service.AddressService;
import com.example.EcommerceApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AddressController {

    @Autowired
    AddressService addressService;

    //create addresses

    @PostMapping("address")
    public String createAddress(@RequestBody Address address){
        return addressService.createAddress(address);
    }


}
