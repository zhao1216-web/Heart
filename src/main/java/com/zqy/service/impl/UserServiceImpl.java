package com.zqy.service.impl;

import com.zqy.Dao.UserDao;
import com.zqy.Dao.impl.UserDaoImpl;
import com.zqy.Pojo.User;
import com.zqy.service.UserService;

import java.io.IOException;
import java.sql.SQLException;

public class UserServiceImpl implements UserService {


    private UserDao userDao = new UserDaoImpl();

    @Override
    public void registerUser(User user) throws IOException, SQLException {
        userDao.saveUser(user);
    }

    @Override
    public User login(User user) throws IOException, SQLException {

        return userDao.queryUserByUsernameAndPassword(user.getUsername(),user.getPassword());
    }

    @Override
    public boolean existsUsername(String username) throws IOException, SQLException {

        if(userDao.queryUserByUsername(username) == null){
            return  false;
        }
        return true;
    }
}
