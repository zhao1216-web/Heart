package com.zqy.Dao;

import com.zqy.Pojo.Order;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface OrderDao {

    public int saveOrder(Order order) throws IOException, SQLException;

    public List<Order> queryOrder(int id) throws IOException, SQLException;

}
