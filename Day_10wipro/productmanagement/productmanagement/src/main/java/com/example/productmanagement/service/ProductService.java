package com.example.productmanagement.service;

import com.example.productmanagement.entity.Product;

import java.util.List;

public interface ProductService {
    Product saveProduct(Product product);
    Product getProductById(int id);
    List<Product> getAllProducts();
    Product updateProduct(int id, Product product);
    void deleteProduct(int id);
}
