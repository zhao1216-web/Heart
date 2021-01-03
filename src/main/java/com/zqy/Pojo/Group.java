package com.zqy.Pojo;

import java.util.Date;

public class Group {

    private Integer id;

    private String name;

    private double money;

    private Integer number;

    private Date startTime;

    private Date endTime;

    private String groupName;

    private String imgPath="../img/photo.png";


    public Group() {
    }

    public Group(Integer id, String name, double money, Integer number, Date startTime, Date endTime, String groupName, String imgPath) {
        this.id = id;
        this.name = name;
        this.money = money;
        this.number = number;
        this.startTime = startTime;
        this.endTime = endTime;
        this.groupName = groupName;

        if(imgPath!=null&&!"".equals(imgPath))
        {
            this.imgPath = imgPath;
        }

    }

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

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        if(imgPath!=null&&!"".equals(imgPath))
        {
            this.imgPath = imgPath;
        }
    }


    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", money=" + money +
                ", number=" + number +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", groupName='" + groupName + '\'' +
                ", imgPath='" + imgPath + '\'' +
                '}';
    }
}
