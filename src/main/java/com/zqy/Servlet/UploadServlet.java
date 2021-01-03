package com.zqy.Servlet;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/UploadServlet")
public class UploadServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            if(ServletFileUpload.isMultipartContent(request)){

                //创建FileItemFactory工厂实现类
                FileItemFactory fileItemFactory = new DiskFileItemFactory();

                //创建用于解析上传数据的工具类ServletFileUpload
                ServletFileUpload servletFileUpload = new ServletFileUpload(fileItemFactory);

                try {
                    List<FileItem> list = servletFileUpload.parseRequest(request);

                    for(FileItem fileItem : list){
                        if(fileItem.isFormField()){
                            System.out.println("表单项的name属性值：" + fileItem.getFieldName());
                            System.out.println("表单项的value属性值：" + fileItem.getString("UTF-8"));



                        }else{
                            System.out.println("表单项的name属性值：" + fileItem.getFieldName());
                            System.out.println("表单项的value属性值：" + fileItem.getName());

                            fileItem.write(new File("e:\\file\\"+fileItem.getName()));

                            getServletContext().setAttribute("name",fileItem.getName());
                        }


                    }

                } catch (FileUploadException e) {
                    e.printStackTrace();
                } catch (Exception e) {
                    e.printStackTrace();
                }

                request.getRequestDispatcher("index.jsp").forward(request,response);
            }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
