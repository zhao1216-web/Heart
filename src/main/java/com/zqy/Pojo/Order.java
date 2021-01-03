package com.zqy.Pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Order implements Serializable {

    private String orderId;    //订单号

    private Date createTime;    //捐赠时间

    private BigDecimal price;   //捐赠金额

    private Integer userId; //用户编号


    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Order(String orderId, Date createTime, BigDecimal price, Integer userId) {
        this.orderId = orderId;
        this.createTime = createTime;
        this.price = price;
        this.userId = userId;
    }

    public Order() {
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", createTime=" + createTime +
                ", price=" + price +
                ", userId=" + userId +
                '}';
    }
}
