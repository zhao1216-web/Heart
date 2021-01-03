package com.zqy.service.impl;

import com.zqy.Dao.GroupDao;
import com.zqy.Dao.impl.GroupDaoImpl;
import com.zqy.Pojo.Group;
import com.zqy.Pojo.Page;
import com.zqy.service.GroupService;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class GroupServiceImpl implements GroupService {

    GroupDao groupDao = new GroupDaoImpl();

    @Override
    public void addGroup(Group group) throws IOException, SQLException {
        groupDao.addGroup(group);
    }

    @Override
    public void deleteGroupById(Integer id) throws IOException, SQLException {
        groupDao.deleteGroupById(id);
    }

    @Override
    public void updateGroup(Group group) throws IOException, SQLException {
        groupDao.updateGroup(group);
    }

    @Override
    public Group queryGroupById(Integer id) throws IOException, SQLException {
        return groupDao.queryGroupById(id);
    }

    @Override
    public List<Group> queryGroups() throws IOException, SQLException {
        return groupDao.queryGroups();
    }

    @Override
    public Page<Group> page(int pageNo, int pageSize) throws IOException, SQLException {
        Page<Group> page = new Page<Group>();

        page.setPageNo(pageNo);

        Integer pageTotalCount = groupDao.queryForPageTotalCount();

        page.setPageTotalCount(pageTotalCount);

        Integer pageTotal = pageTotalCount/Page.PAGE_SIZE;

        if((pageTotalCount%Page.PAGE_SIZE)>0){
            pageTotal+=1;
        }

        page.setPageTotal(pageTotal);

        int begin = (page.getPageNo()-1)*pageSize;

        List<Group> items = groupDao.queryForPageItems(begin,pageSize);

        page.setItems(items);

        return  page;
    }
}
