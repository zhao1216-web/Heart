package com.zqy.service.impl;

import com.zqy.Dao.OrderDao;
import com.zqy.Dao.OrderItemDao;
import com.zqy.Dao.impl.OrderDaoImpl;
import com.zqy.Dao.impl.OrderItemDaoImpl;
import com.zqy.Pojo.Order;
import com.zqy.Pojo.OrderItem;
import com.zqy.service.OrderService;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class OrderServiceImpl implements OrderService {

    OrderDao orderDao = new OrderDaoImpl();

    OrderItemDao orderItemDao = new OrderItemDaoImpl();

    @Override
    public String createOrder(Order order) throws IOException, SQLException {
        //订单号
        String orderId = System.currentTimeMillis()+""+order.getUserId();


        //orerItemDao.saveorerItemDao()

        //id,name,price,orderId

        return orderId;
    }

    @Override
    public String saveOrder(Order order,OrderItem orderItem) throws IOException, SQLException {
        orderDao.saveOrder(order);

        orderItemDao.saveOrderItem(orderItem);

        return null;
    }

    @Override
    public List<Order> queryOrder(int id) throws IOException, SQLException {
        return orderDao.queryOrder(id);
    }


}
