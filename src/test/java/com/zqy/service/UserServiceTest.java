package com.zqy.service;

import com.zqy.Pojo.User;
import com.zqy.service.impl.UserServiceImpl;

import org.junit.Test;


import java.io.IOException;
import java.sql.SQLException;

import static org.junit.Assert.*;
public class UserServiceTest {


    @Test
    public void registerUser() throws IOException, SQLException {
        UserService userService = new UserServiceImpl();

        userService.registerUser(new User());


    }

    @Test
    public void login() {
    }

    @Test
    public void existsUsername() {
    }
}
