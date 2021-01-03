<%--
  Created by IntelliJ IDEA.
  User: 赵清扬
  Date: 2020/12/28
  Time: 20:17
  To change this template use File | Settings | File Templates.

  bug:request.getContextPath()找不到

--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/main.css">
<%
    String basePath = request.getScheme()
            + "://"
            + request.getServerName()
            + ":"
            + request.getServerPort()
            + request.getContextPath()
            + "/";
%>
<base href="<%=basePath %>">
