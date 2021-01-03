package com.zqy.service;

import com.zqy.Pojo.User;

import java.io.IOException;
import java.sql.SQLException;

public interface UserService {


    public void registerUser(User user) throws IOException, SQLException;


    public User login(User user) throws IOException, SQLException;


    public boolean existsUsername(String name) throws IOException, SQLException;
}
