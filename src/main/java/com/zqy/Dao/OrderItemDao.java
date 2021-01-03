package com.zqy.Dao;

import com.zqy.Pojo.OrderItem;

import java.io.IOException;
import java.sql.SQLException;

public interface OrderItemDao {

    public int saveOrderItem(OrderItem orderItem) throws IOException, SQLException;
}
