package com.zqy.service;

import com.zqy.Pojo.Group;
import com.zqy.Pojo.Page;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface GroupService {

    public void addGroup(Group group) throws IOException, SQLException;

    public void deleteGroupById(Integer id) throws IOException, SQLException;

    public void updateGroup(Group group) throws IOException, SQLException;

    public Group queryGroupById(Integer id) throws IOException, SQLException;

    public List<Group> queryGroups() throws IOException, SQLException;

    Page<Group> page(int pageNo, int pageSize) throws IOException, SQLException;
}
