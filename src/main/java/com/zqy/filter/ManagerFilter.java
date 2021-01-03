package com.zqy.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

//禁止直接访问Servlet

//实现

public class ManagerFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

       /* //获取filter的名称 filter-name的内容
        System.out.println(filterConfig.getFilterName());

        //获取在web.xml中配置的init-param初始化参数
        System.out.println(filterConfig.getInitParameter("user"));
        System.out.println(filterConfig.getInitParameter("url"));

        //获取Servlet Context对象
        System.out.println(filterConfig.getServletContext());*/
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;

        HttpSession session = httpServletRequest.getSession();

        Object user = session.getAttribute("user");

        if(user == null){
            servletRequest.getRequestDispatcher("login.jsp").forward(servletRequest,servletResponse);
            return;
        }else {
            filterChain.doFilter(servletRequest,servletResponse);
        }
    }

    @Override
    public void destroy() {

    }
}
