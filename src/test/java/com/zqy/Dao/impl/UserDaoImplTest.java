package com.zqy.Dao.impl;

import org.junit.Test;

import java.io.IOException;
import java.sql.SQLException;

import static org.junit.Assert.*;

public class UserDaoImplTest {

    @Test
    public void queryUserByUsername() throws IOException, SQLException {
        UserDaoImpl userDao=new UserDaoImpl();
        System.out.println(userDao.queryUserByUsername("zhao"));
    }
}