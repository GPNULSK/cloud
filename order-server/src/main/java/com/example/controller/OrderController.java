package com.example.controller;


import com.example.domain.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/makeOrder")
    public Boolean makeOrder(){
        Order order = new Order();
        order.setUid("1");
        order.setRuuid("LSK");

        //restTemplate.getForObject()
        Boolean isBuy = restTemplate.getForObject("http://localhost:8081/product/sellProducts?id=1&account=5", Boolean.class);
        return isBuy;
    }
}
