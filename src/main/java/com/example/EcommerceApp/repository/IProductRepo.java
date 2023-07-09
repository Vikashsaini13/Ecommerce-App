package com.example.EcommerceApp.repository;

import com.example.EcommerceApp.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProductRepo extends JpaRepository<Product,Integer> {
    List<Product> findByCategory(String category);
}
