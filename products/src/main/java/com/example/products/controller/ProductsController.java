package com.example.products.controller;

import com.example.domain.Product;
import com.example.products.domain.Products;
import com.example.products.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductsController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/findProductByName")
    public Products findProductByName(String name){
        Products products = productService.findByName(name);
        System.out.println(products);
        return products;
    }

    @RequestMapping("/sellProducts")
    public Boolean sellProducts(Integer id,Integer account){
        Product products = new Product();
        products.setPid(id);
        products.setInventory(account);
        Boolean flag = productService.sellProducts(products);
        return flag;
    }

    @RequestMapping("/all")
    public List<Product> findAll(){
        return productService.findAll();
    }
}
