package com.example.EcommerceApp.service;

import com.example.EcommerceApp.model.Product;
import com.example.EcommerceApp.repository.IProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    IProductRepo iProductRepo;

    public String createProduct(Product product) {
        iProductRepo.save(product);
        return "Added";
    }

    public List<Product> getProductByCategory(String category) {
        return iProductRepo.findByCategory(category);
    }

    public String deleteProductById(Integer id) {
        iProductRepo.deleteById(id);
        return "product deleted";
    }
}
