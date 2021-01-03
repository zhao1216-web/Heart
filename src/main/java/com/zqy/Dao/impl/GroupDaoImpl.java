package com.zqy.Dao.impl;

import com.zqy.Dao.GroupDao;
import com.zqy.Pojo.Group;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class GroupDaoImpl extends BaseDao implements GroupDao {
    @Override
    public int addGroup(Group group) throws IOException, SQLException {
        String sql = "INSERT INTO groups(name,money,number,startTime,endTime,groupName,imgPath) VALUES(?,?,?,?,?,?,?)";

        return update(sql,group.getName(),group.getMoney(),group.getNumber(),group.getStartTime(),group.getEndTime(),group.getGroupName(),group.getImgPath());
    }

    @Override
    public int deleteGroupById(Integer id) throws IOException, SQLException {
        String sql = "delete from groups where id = ?";
        return update(sql,id);
    }

    @Override
    public int updateGroup(Group group) throws IOException, SQLException {
        String sql = "UPDATE groups SET name=?,money=?,number=?,startTime=?,endTime=?,groupName=?,imgPath=? where id=?";
        return update(sql,group.getName(),group.getMoney(),group.getNumber(),group.getStartTime(),group.getEndTime(),group.getGroupName(),group.getImgPath(),group.getId());
    }

    @Override
    public Group queryGroupById(Integer id) throws IOException, SQLException {
        String sql ="SELECT id,name,money,number,startTime,endTime,groupName,imgPath FROM groups WHERE id = ?";
        return queryForOne(Group.class,sql,id);
    }

    @Override
    public List<Group> queryGroups() throws IOException, SQLException {
        String sql ="SELECT id,name,money,number,startTime,endTime,groupName,imgPath FROM groups";
        return queryForList(Group.class,sql);
    }

    @Override
    public Integer queryForPageTotalCount() throws IOException, SQLException {
        String sql = "select count(*) from groups";

        Number count = (Number) queryForSingleValue(sql);

        return  count.intValue();
    }

    @Override
    public List<Group> queryForPageItems(int begin, int pageSize) throws IOException, SQLException {
        String sql = "select id,name,money,number,startTime,endTime,groupName from groups limit ?,?";

        return queryForList(Group.class,sql,begin,pageSize);
    }
}
