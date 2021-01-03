package com.zqy.Pojo;


import java.io.Serializable;
import java.util.Date;

public class User {

    private String username;

    private String password;

    private Date registerTime;

    private String idCard;

    private int type;

    private double money;

    private int id;

    private String email;

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", registerTime=" + registerTime +
                ", idCard='" + idCard + '\'' +
                ", type=" + type +
                ", money=" + money +
                ", id=" + id +
                ", email='" + email + '\'' +
                '}';
    }

    public User(String username, String password, Date registerTime, String idCard, int type, double money, String email, int id) {
        this.username = username;
        this.password = password;
        this.registerTime = registerTime;
        this.idCard = idCard;
        this.type = type;
        this.money = money;
        this.email = email;
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
