package com.zqy.Servlet;

import com.google.gson.Gson;
import com.zqy.Pojo.User;
import com.zqy.service.UserService;
import com.zqy.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(urlPatterns = "/RegisterServlet")
public class RegisterServlet extends HttpServlet {

    UserService userService = new UserServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

            String username = request.getParameter("username");
            String email = request.getParameter("email");
            String idCard = request.getParameter("idCard");
            String password = request.getParameter("password");
            String type = request.getParameter("type");

            User user = new User();

            user.setUsername(username);
            user.setEmail(email);
            user.setIdCard(idCard);
            user.setPassword(password);
            user.setType(Integer.parseInt(type));

            try {
                userService.registerUser(user);
            } catch (SQLException e) {
                e.printStackTrace();
            }

/*

        if (flag) {
            System.out.println("用户注册成功");
        } else {
            System.out.println("用户注册失败");

            request.setAttribute("msg","");

            request.getRequestDispatcher("././././signup.jsp").forward(request,response);

        }

*/
        /*String username1 = request.getParameter("username");

        boolean existsUsername = false;
        try {
            existsUsername = userService.existsUsername(username1);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        Map<String,Object> resultMap = new HashMap<>();

        resultMap.put("existsUsername",existsUsername);

        Gson gson = new Gson();

        String json = gson.toJson(resultMap);

        response.getWriter().write(json);

        request.getRequestDispatcher("login.jsp").forward(request,response);

*/



                 //form表单 a标签;  转发或者重定向
                //ajax的请求; out.println(json对象);

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            this.ajaxExistsUsername(request,response);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void ajaxExistsUsername(HttpServletRequest request,HttpServletResponse response) throws IOException, SQLException {
        String username = request.getParameter("username");

        boolean existsUsername = userService.existsUsername(username);

        Map<String,Object> resultMap = new HashMap<>();

        resultMap.put("existsUsername",existsUsername);

        Gson gson = new Gson();

        String json = gson.toJson(resultMap);

        response.getWriter().write(json);

    }
}
