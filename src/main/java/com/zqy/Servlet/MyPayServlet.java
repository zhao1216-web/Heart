package com.zqy.Servlet;

import com.zqy.Pojo.Order;
import com.zqy.Pojo.User;
import com.zqy.service.OrderService;
import com.zqy.service.impl.OrderServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(urlPatterns = "/MyPayServlet")
public class MyPayServlet extends HttpServlet {

    OrderService orderService = new OrderServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        User user = (User) request.getSession().getAttribute("user");

        List<Order> list = null;
        try {
            list = orderService.queryOrder(user.getId());
        } catch (SQLException e) {
            e.printStackTrace();
        }

        request.setAttribute("order",list);

        request.getRequestDispatcher("mypay.jsp").forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
