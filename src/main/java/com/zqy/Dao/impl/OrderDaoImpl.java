package com.zqy.Dao.impl;

import com.zqy.Dao.OrderDao;
import com.zqy.Pojo.Group;
import com.zqy.Pojo.Order;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

public class OrderDaoImpl extends BaseDao implements OrderDao {
    @Override
    public int saveOrder(Order order) throws IOException, SQLException {
        String sql = "insert into t_order(order_id,create_time,price,user_id)" +
                "values(?,?,?,?)";
        return  update(sql,order.getOrderId(),order.getCreateTime(),order.getPrice(),order.getUserId());
    }

    @Override
    public List<Order> queryOrder(int id) throws SQLException, IOException {
        String sql ="SELECT order_id as orderId,create_time as createTime,price FROM t_order";
        List<Order> list = queryForList(Order.class,sql);

        Iterator<Order> it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        return list;
    }
}
