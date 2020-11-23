package com.example.order.dao;

import com.example.order.domain.Order;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderDao {

    void makeOrder(Order order);
}