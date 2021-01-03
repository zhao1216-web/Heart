package com.zqy.Servlet;

import com.zqy.Pojo.Group;
import com.zqy.Pojo.Page;
import com.zqy.service.GroupService;
import com.zqy.service.impl.GroupServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(urlPatterns = "/GroupServlet")
public class GroupServlet extends HttpServlet {

    private GroupService groupService = new GroupServiceImpl();


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setCharacterEncoding("UTF-8");
        request.setCharacterEncoding("UTF-8");

        String action=request.getParameter("action");
        String value=request.getParameter("value");

        if("add".equals(action)){
            try {
                String name = request.getParameter("name");
                String groupName = request.getParameter("groupName");
                add(name,groupName);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }else if("delete".equals(value)){
            String id = request.getParameter("id");
            try {
                delete(id);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }else if("update".equals(value)){
            String id = request.getParameter("id");
            Group group = update(id);
            if(group!=null) {
                request.setAttribute("edit_group", group);
            }

            request.getRequestDispatcher("group_update.jsp").forward(request,response);
        }else if("update2".equals(action)){
            Group group = new Group();
            //Integer id = group.getId();

            Integer id = Integer.parseInt(request.getParameter("id"));
            group.setId(id);
            group.setName(request.getParameter("name"));
            group.setGroupName(request.getParameter("groupName"));
            group.setMoney(Double.parseDouble(request.getParameter("money")));
            group.setNumber(Integer.parseInt(request.getParameter("number")));

            try {
                groupService.updateGroup(group);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        try {
            List<Group> list = groupService.queryGroups();

            //request.setAttribute("array",list);



            int pageNo = 1;

            if(request.getParameter("pageNo") != null){
                pageNo = Integer.parseInt(request.getParameter("pageNo"));
            }

            int pageSize = 4;//Integer.parseInt(request.getParameter("pageSize"), Page.PAGE_SIZE);

            Page<Group> page = groupService.page(pageNo,pageSize);

            request.setAttribute("page",page);


            request.getRequestDispatcher("study.jsp").forward(request,response);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }

    public void add(String name,String groupName) throws IOException, SQLException, ServletException {

        Group group = new Group();

        group.setName(name);

        group.setGroupName(groupName);

        groupService.addGroup(group);

    }

    public void delete(String id) throws IOException, SQLException {

        int i=0;

        i = Integer.parseInt(id);

        groupService.deleteGroupById(i);

        //response.sendRedirect("/GroupServlet?action=doPost");

    }

    public Group update(String id){
        Group group = new Group();
        try {
            group = groupService.queryGroupById(Integer.parseInt(id));
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }

        if(group!=null){
            return group;
        }else {
            return null;
        }
    }

    public void update2(){

    }

    public void page(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException, SQLException {
        int pageNo = Integer.parseInt(request.getParameter("pageNo"),1);
        int pageSize = Integer.parseInt(request.getParameter("pageSize"), Page.PAGE_SIZE);

        Page<Group> page = groupService.page(pageNo,pageSize);

        request.setAttribute("page",page);

        request.getRequestDispatcher("group_study.jsp").forward(request,response);
    }
}
