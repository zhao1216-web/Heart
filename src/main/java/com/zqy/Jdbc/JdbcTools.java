package com.zqy.Jdbc;

import com.zqy.Jdbc.GetConnection;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTools {


    GetConnection getConnection = new GetConnection();
    Connection connection;



    public JdbcTools() throws SQLException, IOException, ClassNotFoundException {
    }

    public  boolean  select(String ServletUserName,String ServletPassWord) throws SQLException, IOException, ClassNotFoundException {

        connection = getConnection.getConnection();

        if(!connection.isClosed()){

            Statement statement = connection.createStatement();

            String sql = "select * from users";

            ResultSet rs = statement.executeQuery(sql);

            String username = null;

            String password = null;

            while(rs.next()){
                username = rs.getString("username");
                password = rs.getString("passwords");

                if(username.equals(ServletUserName) && password.equals(ServletPassWord)){
                    return true;
                }
            }


        }
        return false;

    }
}
