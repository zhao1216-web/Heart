<%@ page import="java.text.SimpleDateFormat" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>安民公益</title>
    <%@include file="base.jsp" %>

    <style>
        .div_1 {
            text-align: center;
            padding-top: 30px;
            border: #999999 solid;
            margin: 5px;
        }
    </style>


</head>
<body>

<%@include file="header.jsp" %>

<div class="container">
    <div class="row">
        <%@include file="left.jsp"%>

        <div class="col-sm-7">
            <div class="news-list">

<%
    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
%>
                <c:forEach items="${requestScope.order}" var="order">
                    <div class="div_1">
                        订单号:${order.getOrderId()}<br>
                        创建时间:${order.getCreateTime()}<br>
                        金额: ${order.getPrice()}<br><br><br>
                    </div>
                </c:forEach>

            </div>
        </div>
        <div class="col-sm-3">
            <div class="search-bar">
                <input type="search" class="form-control" placeholder="搜索公益项目">
            </div>
            <div class="side-bar-card flag clearfix">
                <div class="col-xs-5">
                    <img src="img/1-1.png">
                </div>
                <div class="col-xs-7">
                    <div class="text-lg">有害信息举报专区</div>
                    <div>举报电话：12377</div>
                </div>
            </div>
            <div class="side-bar-card">
                <div class="card-title">项目反馈</div>
                <div class="card-body">
                    <div class="list">
                        <div class="item">
                            <a class="title" href="#">人工智能时代的到来，把全世界的科技巨头和汽车厂商推向了研发自动驾驶技术的浪潮中。</a>
                            <div class="desc">15k阅读　1k评论</div>
                        </div>
                        <div class="item">
                            <a class="title" href="#">人工智能时代的到来，把全世界的科技巨头和汽车厂商推向了研发自动驾驶技术的浪潮中。</a>
                            <div class="desc">15k阅读　1k评论</div>
                        </div>
                        <div class="item">
                            <a class="title" href="#">人工智能时代的到来，把全世界的科技巨头和汽车厂商推向了研发自动驾驶技术的浪潮中。</a>
                            <div class="desc">15k阅读　1k评论</div>
                        </div>
                        <div class="item">
                            <a class="title" href="#">人工智能时代的到来，把全世界的科技巨头和汽车厂商推向了研发自动驾驶技术的浪潮中。</a>
                            <div class="desc">15k阅读　1k评论</div>
                        </div>
                        <div class="item">
                            <a class="title" href="#">人工智能时代的到来，把全世界的科技巨头和汽车厂商推向了研发自动驾驶技术的浪潮中。</a>
                            <div class="desc">15k阅读　1k评论</div>
                        </div>
                        <div class="item">
                            <a class="title" href="#">人工智能时代的到来，把全世界的科技巨头和汽车厂商推向了研发自动驾驶技术的浪潮中。</a>
                            <div class="desc">15k阅读　1k评论</div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<%@include file="footer.jsp" %>
</body>
</html>