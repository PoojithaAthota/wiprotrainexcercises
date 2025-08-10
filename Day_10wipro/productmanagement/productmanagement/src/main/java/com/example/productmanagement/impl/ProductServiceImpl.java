package com.example.productmanagement.impl;

import com.example.productmanagement.entity.Product;
import com.example.productmanagement.repository.ProductRepository;
import com.example.productmanagement.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository repo;

    @Override
    public Product saveProduct(Product product) {
        return repo.save(product);
    }

    @Override
    public Product getProductById(int id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public List<Product> getAllProducts() {
        return repo.findAll();
    }

    @Override
    public Product updateProduct(int id, Product product) {
        Product existing = repo.findById(id).orElse(null);
        if (existing != null) {
            existing.setProductName(product.getProductName());
            existing.setProductMake(product.getProductMake());
            existing.setProductPrice(product.getProductPrice());
            return repo.save(existing);
        }
        return null;
    }

    @Override
    public void deleteProduct(int id) {
        repo.deleteById(id);
    }
}
