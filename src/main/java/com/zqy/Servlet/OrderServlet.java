package com.zqy.Servlet;

import com.zqy.Pojo.Group;
import com.zqy.Pojo.Order;
import com.zqy.Pojo.OrderItem;
import com.zqy.Pojo.User;
import com.zqy.service.GroupService;
import com.zqy.service.OrderService;
import com.zqy.service.impl.GroupServiceImpl;
import com.zqy.service.impl.OrderServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(urlPatterns = "/OrderServlet")
public class OrderServlet extends HttpServlet {

    OrderService orderService = new OrderServiceImpl();

    GroupService groupService = new GroupServiceImpl();

    Group group = new Group();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");

        response.setContentType("UTF-8");
        String value = request.getParameter("value");

        if("contribute".equals(value)){
            try {
                queryGroup(request,response);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }else if("pay".equals(value)){
            try {
                createOrder(request,response);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    public void createOrder(HttpServletRequest request,HttpServletResponse response) throws IOException, SQLException, ServletException {

        request.setCharacterEncoding("UTF-8");

        response.setContentType("UTF-8");

        User user = (User) request.getSession().getAttribute("user");


        String money = request.getParameter("money");

        Order order = new Order();


        order.setCreateTime((new Date()));
        order.setUserId(user.getId());
        order.setPrice(new BigDecimal(money));

        String orderId = orderService.createOrder(order);

        OrderItem orderItem = new OrderItem();

        //中文字符乱码bug
        orderItem.setName(request.getParameter("name"));
        orderItem.setOrderId(orderId);
        orderItem.setPrice(new BigDecimal(money));



        order.setOrderId(orderId);



        orderService.saveOrder(order,orderItem);


        request.getSession().setAttribute("orderId",orderId);
        request.getSession().setAttribute("money",money);
        //request.setAttribute();
        //request.setAttribute();

        group.setMoney(group.getMoney()+Double.parseDouble(money));

        //request.getRequestDispatcher("").forward(request,response);

        groupService.updateGroup(group);

        response.sendRedirect("group_pay_success.jsp");


    }

    public void queryGroup(HttpServletRequest request,HttpServletResponse response) throws IOException, SQLException, ServletException {
        //orderService.createOrder()
        group = groupService.queryGroupById(Integer.parseInt(request.getParameter("id")));

        request.setAttribute("Group",group);

        request.getRequestDispatcher("group_pay.jsp").forward(request,response);


    }
}
