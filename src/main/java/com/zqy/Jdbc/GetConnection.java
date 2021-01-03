package com.zqy.Jdbc;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class GetConnection {
    Connection con;
    public Connection getConnection() throws IOException {


        try {
            Reader reader = new FileReader("C:\\Users\\赵清扬\\IdeaProjects\\Heart\\src\\main\\java\\com\\zqy\\Jdbc\\db.properties");

            Properties pro = new Properties();
            pro.load(reader);


            String driver = pro.getProperty("driver");

            String url = pro.getProperty("url");

            String user = pro.getProperty("user");

            String password = pro.getProperty("password");

            Class.forName(driver);

            con = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }

    public void close(Connection con) throws SQLException {
        if(con != null){
            con.close();
        }

    }
}