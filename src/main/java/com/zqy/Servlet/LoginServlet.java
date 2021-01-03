package com.zqy.Servlet;

import com.zqy.Pojo.User;
import com.zqy.service.UserService;
import com.zqy.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(urlPatterns = "/LoginServlet")
public class LoginServlet extends HttpServlet {

    //LoginDao loginDao = new LoginDao();

    UserService userService = new UserServiceImpl();

    public LoginServlet() throws SQLException, IOException, ClassNotFoundException {
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        System.out.println("username:"+username +"\t" +"password:"+password);

        User user = new User();

        user.setUsername(username);
        user.setPassword(password);

        try {
            //boolean flag = loginDao.select(username,password);

            User user1 = userService.login(user);

            if( user1 != null){
                System.out.println("用户登录成功");

                request.getSession().setAttribute("user",user1);

                request.getRequestDispatcher("././././login_success.jsp").forward(request,response);

            }else {
                System.out.println("用户登录失败");


                request.setAttribute("msg","用户名或密码错误");

                request.setAttribute("username",username);

                request.getRequestDispatcher("././././login.jsp").forward(request,response);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
