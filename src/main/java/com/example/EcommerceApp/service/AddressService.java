package com.example.EcommerceApp.service;

import com.example.EcommerceApp.model.Address;
import com.example.EcommerceApp.repository.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    @Autowired
    IAddressRepo iAddressRepo;

    public String createAddress(Address address) {
        iAddressRepo.save(address);
        return "created";
    }
}
