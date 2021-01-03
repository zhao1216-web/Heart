package com.zqy.Dao;

import com.zqy.Pojo.User;

import java.io.IOException;
import java.sql.SQLException;



public interface UserDao {
    public User queryUserByUsername(String username) throws IOException, SQLException;

    public User queryUserByUsernameAndPassword(String username,String password) throws IOException, SQLException;

    public int saveUser(User user) throws IOException, SQLException;







}
