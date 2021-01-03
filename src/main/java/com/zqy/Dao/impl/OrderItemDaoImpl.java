package com.zqy.Dao.impl;

import com.zqy.Dao.OrderItemDao;
import com.zqy.Pojo.OrderItem;

import java.io.IOException;
import java.sql.SQLException;

public class OrderItemDaoImpl extends BaseDao implements OrderItemDao {
    @Override
    public int saveOrderItem(OrderItem orderItem) throws IOException, SQLException {
        String sql = "insert into t_order_item(id,name,price,order_id)" +
                "values(null,?,?,?)";
        return update(sql,orderItem.getName(),orderItem.getPrice(),orderItem.getOrderId());
    }
}
