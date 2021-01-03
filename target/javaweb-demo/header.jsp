<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 赵清扬
  Date: 2020/12/28
  Time: 18:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>



<div class="navbar navbar-default">
    <div class="container">
        <div class="navbar-header">
            <a href="index.jsp" class="navbar-brand"></a>
        </div>
        <!-- class="visible-xs-inline-block"：在超小屏幕上显示-->
        <label for="toggle-checkbox" id="toggle-label" class="visible-xs-inline-block">菜单</label>
        <input type="checkbox" class="hidden" id="toggle-checkbox">
        <div class="hidden-xs">
            <ul class="nav navbar-nav">
                <li class="active"><a href="#">首页</a></li>

                <c:if test="${sessionScope.user.type == 2}">
                    <li><a href="MyPayServlet">我的捐赠</a></li>
                </c:if>

                <c:if test="${sessionScope.user.type == 1}">
                    <li><a href="background_admin.jsp">公益机构后台</a></li>
                </c:if>
                <c:if test="${sessionScope.user.type == 2}">
                    <li><a href="background.jsp">公益机构后台</a></li>
                </c:if>
                <c:if test="${sessionScope.user.type == 3}">
                    <li><a href="background2.jsp">公益机构后台</a></li>
                </c:if>
            </ul>
            <c:if test="${not empty sessionScope.user}">

                <ul  class="nav navbar-nav navbar-right">
                    <h3>
                        <form action="UserServlet" method="post">
                            <input type="hidden" name="action"  value="loginOut">
                            <input type="submit" class="btn btn-warning" value="注销">
                        </form>
                    </h3>
                </ul>
                <ul class="nav navbar-nav navbar-right">
                    <h3><span class="label label-info">欢迎<span class="label_1"><font color="red">&nbsp;&nbsp;&nbsp;${sessionScope.user.username}&nbsp;&nbsp;&nbsp;</font></span>光临安民公益</span></h3>

                </ul>
            </c:if>
            <c:if test="${empty sessionScope.user}">
                <ul class="nav navbar-nav navbar-right">
                    <li><a href="login.jsp">登陆</a></li>
                    <li><a href="signup.jsp">注册</a></li>
                </ul>
            </c:if>

        </div>
    </div>
</div>