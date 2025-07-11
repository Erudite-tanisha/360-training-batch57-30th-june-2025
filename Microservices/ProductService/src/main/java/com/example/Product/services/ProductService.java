package com.example.Product.services;

import com.example.Product.entities.Product;

import java.util.List;

public interface ProductService {

    Product add(Product product);

    List<Product> getAll();

    Product getProduct(int id);

    List<Product> ProductsByUser(int userId);

}