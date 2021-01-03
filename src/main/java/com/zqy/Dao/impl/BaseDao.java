package com.zqy.Dao.impl;

import com.zqy.Jdbc.GetConnection;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public abstract class BaseDao {

    //使用jdbc操作数据库

    private QueryRunner queryRunner = new QueryRunner();

    GetConnection getConnection = new GetConnection();

    //update方法用来执行Insert、Update、Delete语句
    public int update(String sql,Object ...args) throws IOException, SQLException {
        Connection connection = getConnection.getConnection();

        try {
            return queryRunner.update(connection, sql, args);
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            getConnection.close(connection);
        }

        //执行失败
        return -1;
    }


    //查询返回一个javaBean的sql语句
    /*
    type:   返回的对象类型
    sql ：   执行的sql语句
    args：   sql对应的参数值
    <T> :    返回的类型的泛型

     */
    public <T> T queryForOne(Class<T> type ,String sql,Object ...args) throws IOException, SQLException {
        Connection connection = getConnection.getConnection();
        try{
            return queryRunner.query(connection,sql,new BeanHandler<T>(type),args);
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            getConnection.close(connection);
        }

        return null;
    }

    public <T> List<T> queryForList(Class<T> type , String sql, Object ...args) throws IOException, SQLException {
        Connection connection = getConnection.getConnection();
        try{
            return queryRunner.query(connection,sql,new BeanListHandler<T>(type),args);
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            getConnection.close(connection);
        }

        return null;
    }

    //执行返回一行一列的sql语句

    public Object queryForSingleValue(String sql, Object ...args) throws IOException, SQLException {
        Connection connection = getConnection.getConnection();
        try{
            return queryRunner.query(connection,sql,new ScalarHandler(),args);
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            getConnection.close(connection);
        }

        return null;
    }
}
