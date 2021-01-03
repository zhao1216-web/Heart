<%--
  Created by IntelliJ IDEA.
  User: 赵清扬
  Date: 2021/1/1
  Time: 11:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>安民公益</title>
    <%@include file="base.jsp" %>
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/main.css">


    <style type="text/css">

        .col-div{
            float: left;
            margin-left: 300px;
            border: 1px solid #999999;
            padding: 30px;
        }

    </style>
</head>
<body>

<%@include file="header.jsp" %>

<div class="container">
    <div class="row">
        <div class="col-sm-2">
            <div class="list-group side-bar hidden-xs">
                <a href="index.jsp" class="list-group-item">综合</a>
                <a href="study.jsp" class="list-group-item active">教育助学</a>
                <a href="poor.jsp" class="list-group-item">扶贫救灾</a>
                <a href="hospital.jsp" class="list-group-item">医疗救助</a>
                <a href="#" class="list-group-item">其他</a>
            </div>
        </div>
        <div class="col-div">
                    <input name="id" type="hidden" value="${requestScope.Group.id}">
                    <table>
                        <tr>
                            <td><h3>捐助对象：   </h3></td>
                            <td>
                                <h3><span class="label label-info">${requestScope.Group.name}</span></h3>
                            </td>
                        </tr>
                        <tr>
                            <td><h3>组织机构：   </h3></td>
                            <td>
                                <h3><span class="label label-info">${requestScope.Group.groupName}</span></h3>
                            </td>
                        </tr>
                        <tr>
                            <td><h3>已募善款：   </h3></td>
                            <td>
                                <h3><span class="label label-info">${requestScope.Group.money}</span></h3>
                            </td>
                        </tr>
                        <tr>
                            <td><h3>参捐人数：   </h3></td>
                            <td>
                                <h3><span class="label label-info">${requestScope.Group.number}</span></h3>
                            </td>
                        </tr>
                    </table>
                    <div class="div_1">
                        <h4><span>捐款金额</span>
                            <form action="OrderServlet" method="post">
                                <input type="hidden" name="name" value="${requestScope.Group.name}">
                                <input type="hidden" name="value" value="pay">
                                <input type="text" placeholder="安民公益感谢您的捐赠" name="money">
                                <input type="submit" value="捐赠">
                            </form>
                        </h4>
                    </div>
        </div>
    </div>
</div>
<%@include file="footer.jsp" %>
</body>
</html>