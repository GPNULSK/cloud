package com.example.order.controller;

import com.example.domain.Product;
import com.example.order.domain.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/makeOrder")
    public Boolean makeOrder(String name,int account){
        Order order = new Order();
        order.setUid("1");
        order.setRuuid("LSK");

        //restTemplate.getForObject()
        Boolean isBuy = restTemplate.getForObject("http://PRODUCTS-SERVER/sellProducts?id=1&acccount=5", Boolean.class);
        return isBuy;
    }
}
