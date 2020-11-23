package com.example.products.service.impl;

import com.example.domain.Product;
import com.example.products.dao.ProductsDao;
import com.example.products.domain.Products;
import com.example.products.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductsDao productsDao;

    @Override
    public Products findByName(String name) {
        return productsDao.findByName(name);
    }

    @Override
    public Boolean sellProducts(Product products) {
        System.out.println(products.getPid());
        Product curProduct = productsDao.findById(products.getPid());

        Boolean flag = true;
        int afterSellInventory = curProduct.getInventory() - products.getInventory();

        if(afterSellInventory >= 0){
            Product products1 = new Product();
            products1.setInventory(afterSellInventory);
            products1.setPid(products.getPid());
            try {
                productsDao.sellProducts(products1);
            } catch (Exception e) {
                e.printStackTrace();
                flag = false;
            }
        }

        return flag;
    }

    @Override
    public List<Product> findAll() {
        return productsDao.findAll();
    }
}
