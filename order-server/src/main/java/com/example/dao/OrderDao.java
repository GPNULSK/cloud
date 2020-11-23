package com.example.dao;

import com.example.domain.Order;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderDao {
    void makeOrder(Order order);
}