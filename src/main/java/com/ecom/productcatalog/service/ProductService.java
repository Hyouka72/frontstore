package com.ecom.productcatalog.service;

import com.ecom.productcatalog.model.Product;
import com.ecom.productcatalog.repository.productRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final productRepository repository;

    public ProductService(productRepository repository) {
        this.repository = repository;
    }

    public List<Product> getAllProducts() {
        return repository.findAll();
    }

    public List<Product> getProductsByCategory(Long categoryId) {
        return repository.findByCategoryId(categoryId);
    }
}
