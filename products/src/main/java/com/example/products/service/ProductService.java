package com.example.products.service;

import com.example.domain.Product;
import com.example.products.domain.Products;

import java.util.List;

public interface ProductService {

    Products findByName(String name);

    Boolean sellProducts(Product products);

    List<Product> findAll();
}
