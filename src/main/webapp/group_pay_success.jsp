<%--
  Created by IntelliJ IDEA.
  User: 赵清扬
  Date: 2021/1/1
  Time: 11:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>安民公益</title>
    <%@include file="base.jsp" %>
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/main.css">


    <style type="text/css">
        .div_1{

        }

        .col-div{
            float: left;
            margin-left: 270px;
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
            <img src="./img/heart.jpg">
            <span>您已成功捐赠${sessionScope.money}元，感谢您的捐赠</span><br>
            <span>订单号:${sessionScope.orderId}</span>

            <!-- bug转链接没有值 -->
            <div>
                <a href="index.jsp">返回首页</a>
                <a href="study.jsp">更多捐赠项目</a>
                <a href="group_pay.jsp">返回捐赠页面</a>
            </div>
        </div>

    </div>
</div>
<%@include file="footer.jsp" %>
</body>
</html>