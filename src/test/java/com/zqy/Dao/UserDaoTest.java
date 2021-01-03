package com.zqy.Dao;

import com.zqy.Dao.impl.UserDaoImpl;
import org.junit.Test;

import java.io.IOException;
import java.sql.SQLException;

public class UserDaoTest {

    @Test
    public void queryUserByUsername() throws IOException, SQLException {
        UserDao userDao  = new UserDaoImpl();
        System.out.println(userDao.queryUserByUsername("zhao"));
    }

    @Test
    public void queryUserByUsernameAndPassword() {
    }

    @Test
    public void saveUser() {
    }
}
