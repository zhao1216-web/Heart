package com.zqy.Dao;

import com.zqy.Pojo.Group;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface GroupDao {


    public int addGroup(Group group) throws IOException, SQLException;

    public int deleteGroupById(Integer id) throws IOException, SQLException;

    public int updateGroup(Group group) throws IOException, SQLException;

    public Group queryGroupById(Integer id) throws IOException, SQLException;

    public List<Group> queryGroups() throws IOException, SQLException;

    Integer queryForPageTotalCount() throws IOException, SQLException;

    List<Group> queryForPageItems(int begin, int pageSize) throws IOException, SQLException;
}
