package com.example.EcommerceApp.controller;

import com.example.EcommerceApp.model.Product;
import com.example.EcommerceApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    //create products

    @PostMapping("products")
    public String createProduct(@RequestBody Product product){
       return productService.createProduct(product);
    }

    //get all products based on category
    @GetMapping("products/category/{category}")
    public List<Product> getProductByCategory(@PathVariable String category){
        return productService.getProductByCategory(category);
    }

    //delete product based on product id

    @DeleteMapping("product/id/{id}")
    public String deleteProductById(@PathVariable Integer id){
        return productService.deleteProductById(id);
    }
}
