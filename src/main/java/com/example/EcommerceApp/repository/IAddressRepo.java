package com.example.EcommerceApp.repository;

import com.example.EcommerceApp.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddressRepo extends JpaRepository<Address, Integer> {
}
