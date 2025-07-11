package com.example.Product.controller;

import com.example.Product.entities.Product;
import com.example.Product.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping
    public Product create(@RequestBody Product product) {
        return productService.add(product);
    }

    @GetMapping
    public List<Product> getAll() {
        return productService.getAll();
    }

//    @GetMapping("/{id}")
//    public Product getOne(@PathVariable int id) {
//        return productService.getProduct(id);
//    }

    @GetMapping("/{userId}")
    public List<Product> ProductsByUser(@PathVariable int userId){
        return productService.ProductsByUser(userId);
    }

}