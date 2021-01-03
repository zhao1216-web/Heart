package com.zqy.Pojo;

import java.math.BigDecimal;

public class OrderItem {

    private Integer id;

    private String name; //组织机构名字

    private BigDecimal price;//金额

    private String orderId;//订单号

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public OrderItem(Integer id, String name, BigDecimal price, String orderId) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.orderId = orderId;
    }

    public OrderItem() {
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", orderId='" + orderId + '\'' +
                '}';
    }
}
