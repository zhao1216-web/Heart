package com.zqy.Dao.impl;

import com.zqy.Dao.UserDao;
import com.zqy.Pojo.User;

import java.io.IOException;
import java.sql.SQLException;

public class UserDaoImpl extends BaseDao implements UserDao {
    @Override
    public User queryUserByUsername(String username) throws IOException, SQLException {
        String sql = "select id,username," +
                "email from users where username = ?";

        return queryForOne(User.class,sql,username);

    }

    @Override
    public User queryUserByUsernameAndPassword(String username, String password) throws IOException, SQLException {
        String sql = "select id,username,email,type from users where username = ? and passwords = ?";

        User  user = queryForOne(User.class,sql,username,password);

        return user;
    }

    @Override
    public int saveUser(User user) throws IOException, SQLException {
        String sql = "insert into users(username,passwords,email,idCard,type) values (?,?,?,?,?)";
        return update(sql,user.getUsername(),user.getPassword(),user.getEmail(),user.getIdCard(),user.getType());

    }
}
