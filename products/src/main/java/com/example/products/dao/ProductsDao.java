package com.example.products.dao;

import com.example.domain.Product;
import com.example.products.domain.Products;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface ProductsDao {

    Products findByName(String name);

    void sellProducts(Product products);

    Product findById(int id);

    List<Product> findAll();

}