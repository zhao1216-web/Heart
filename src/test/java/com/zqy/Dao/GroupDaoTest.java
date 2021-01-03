package com.zqy.Dao;

import com.zqy.Dao.impl.GroupDaoImpl;
import com.zqy.Pojo.Group;
import org.junit.Test;

import java.io.IOException;
import java.sql.SQLException;

import static org.junit.Assert.*;

public class GroupDaoTest {

    private GroupDao groupDao = new GroupDaoImpl();

    @Test
    public void addGroup() throws IOException, SQLException {

        Group group = new Group();

        group.setName("4324");
        group.setMoney(1270.0);
        group.setNumber(100);
        group.setStartTime(null);
        group.setEndTime(null);
        group.setGroupName("2334");
        group.setImgPath("../webapp/img/photo.png");

        groupDao.addGroup(group);
    }

    @Test
    public void deleteGroupById() {
    }

    @Test
    public void updateGroup() {
    }

    @Test
    public void queryGroupById() {
    }

    @Test
    public void queryGroups() throws IOException, SQLException {
        System.out.println(groupDao.queryGroups());
    }

    @Test
    public void testAddGroup() {
    }

    @Test
    public void testDeleteGroupById() {
    }

    @Test
    public void testUpdateGroup() {
    }

    @Test
    public void testQueryGroupById() {
    }

    @Test
    public void testQueryGroups() {
    }

    @Test
    public void queryForPageTotalCount() throws IOException, SQLException {
        System.out.println(groupDao.queryForPageTotalCount());
    }

    @Test
    public void queryForPageItems() throws IOException, SQLException {

        for(Group group:groupDao.queryForPageItems(0,4)){
            System.out.println(group);
        }

    }
}
