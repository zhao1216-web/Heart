<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>登陆</title>
    <%@include file="base.jsp" %>
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/main.css">
    <script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>

    <script type="text/javascript">
        $(function () {

        })
    </script>

    <style>
        .span_1{
            color: red;
        }
    </style>
</head>
<body>

<%@include file="header.jsp" %>

<div class="container container-small">
    <h1>登录
        <small>没有帐号？<a href="signup.jsp">注册</a></small>
    </h1>
    <form action="LoginServlet" method="post">
        <div class="form-group">
            <label>用户名/手机/邮箱</label>
            <input type="text" class="form-control" name="username">
            <span class="span_1">
                <%=request.getAttribute("msg")==null?"请输入用户名和密码":request.getAttribute("msg") %>
            </span>
        </div>
        <div class="form-group">
            <label>密码</label>
            <input type="password" class="form-control" name="password">
        </div>
        <div class="form-group">
            <button type="submit" class="btn btn-primary btn-block" id="submit">登录</button>
        </div>
        <div class="form-group">
            <a href="#">忘记密码？</a>
        </div>
    </form>
</div>

<%@include file="footer.jsp" %>

</body>
</html>