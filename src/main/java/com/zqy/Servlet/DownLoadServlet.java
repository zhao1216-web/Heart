package com.zqy.Servlet;

import org.apache.commons.io.IOUtils;
import sun.misc.BASE64Encoder;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLEncoder;

@WebServlet(urlPatterns = "/DownLoadServlet")
public class DownLoadServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        ServletContext servletContext = getServletContext();

        Object name = getServletContext().getAttribute("name");

        String downloadFileName = name.toString();

        if (request.getHeader("User-Agent").contains("Firefox")) {
            response.setHeader("Content-Disposition", "attachment; filename=?UTF-8?B" + new BASE64Encoder().encode(downloadFileName.getBytes("UTF-8")) + "?=");
        } else {
            response.setHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode(downloadFileName, "UTF-8"));
        }


        String mimeType = servletContext.getMimeType("e:\\file\\" + downloadFileName);

        System.out.println("下载的文件类型" + mimeType);

        response.setContentType(mimeType);

        InputStream resourceAsStream = new FileInputStream("e:\\file\\" + downloadFileName);

        OutputStream outputStream = response.getOutputStream();

        IOUtils.copy(resourceAsStream, outputStream);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
