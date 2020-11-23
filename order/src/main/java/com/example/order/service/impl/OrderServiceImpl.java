package com.example.order.service.impl;

import com.example.order.dao.OrderDao;
import com.example.order.domain.Order;
import com.example.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;

    @Override
    public Boolean makeOrder(Order order) {
        boolean flag = true;

        try {
            orderDao.makeOrder(order);
        } catch (Exception e) {
            flag = false;
            e.printStackTrace();
        }

        return flag;
    }
}
