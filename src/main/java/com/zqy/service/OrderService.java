package com.zqy.service;

import com.zqy.Pojo.Order;
import com.zqy.Pojo.OrderItem;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface OrderService {
    public String createOrder(Order order) throws IOException, SQLException;

    public String saveOrder(Order order,OrderItem orderItem) throws IOException, SQLException;

    public List<Order> queryOrder(int id) throws IOException, SQLException;
}
