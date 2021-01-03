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
            text-align: right;
            float: right;
        }
    </style>

    <script type="text/javascript">
        $(function () {

            $("#deleteClass").click(function (e) {
                return confirm("你确认要删除[" + $(this).parent().parent().find("a").text() + "]?");

            });

            $("#click_a").click(function () {
                $("form").submit();
            });

            $("#searchPageBtn").click(function () {
                var pageNo = $("#pn_input").val();

                location.href = "http://localhost:8080/GroupServlet?pageNo=" + pageNo;
            });

        })
    </script>


</head>
<body>

<%@include file="header.jsp" %>

<div class="container">
    <div class="row">
        <%@include file="left.jsp"%>

        <div class="col-sm-7">
            <div class="news-list">


                <c:forEach items="${requestScope.page.items}" var="group">
                    <div class="news-list-item clearfix">
                        <div class="col-xs-5">
                            <img src="${group.imgPath}">
                        </div>
                        <div class="col-xs-7">
                            <a href="news.jsp" class="title">${group.name}</a>
                            <div class="info">
                                <span>已募善款: ${group.money}</span><br>
                                <span>参捐人数: ${group.number}</span><br>
                                <span>发布机构: ${group.groupName}</span><br>
                            </div>


                            <c:if test="${sessionScope.user.type == 1}">
                                <div class="div_1">
                                    <!--bug-->
                                    <!--<a href="GroupServlet" id="click_a">-->

                                    <form action="GroupServlet" method="post">
                                        <input type="hidden" name="name" value="action">
                                        <input type="hidden" name="value" value="delete">
                                        <input type="hidden" name="id" value=${group.id}>
                                        <script type="text/javascript">
                                            $(function () {

                                                $(".btn btn-danger btn-primary").click(function (e) {
                                                    return confirm("你确认要删除[" + $(this).parent().parent().parent().find("a").text() + "]?");

                                                });
                                            });
                                        </script>
                                        <input type="submit" class="btn btn-danger btn-primary" value="删除">
                                    </form>
                                    <!--</a>-->
                                </div>
                                <div class="div_1">
                                    <form action="GroupServlet" method="post">
                                        <input type="hidden" name="name" value="action">
                                        <input type="hidden" name="value" value="update">
                                        <input type="hidden" name="id" value=${group.id}>
                                        <input type="submit" class="btn btn-info" value="编辑">
                                    </form>
                                </div>
                            </c:if>

                            <c:if test="${sessionScope.user.type ==2}">

                                <div class="div_1">
                                    <form action="OrderServlet" method="post">
                                        <input type="hidden" name="name" value="action">
                                        <input type="hidden" name="value" value="contribute">
                                        <input type="hidden" name="id" value=${group.id}>
                                        <input type="submit" class="btn btn-info" value="捐赠">
                                    </form>
                                </div>

                            </c:if>

                        </div>
                    </div>
                </c:forEach>


                <div id="page_nav">
                    <c:if test="${requestScope.page.pageNo>1}">
                        <a href="GroupServlet?pageNo=1">首页</a>
                        <a href="GroupServlet?pageNo=${requestScope.page.pageNo-1}">上一页</a>

                        <a href="GroupServlet?pageNo=${requestScope.page.pageNo-1}">${requestScope.page.pageNo-1}</a>
                    </c:if>


                    【${requestScope.page.pageNo}】


                    <c:if test="${requestScope.page.pageNo<requestScope.page.pageTotal}">
                        <a href="GroupServlet?pageNo=${requestScope.page.pageNo+1}">${requestScope.page.pageNo+1}</a>
                        <a href="GroupServlet?pageNo=${requestScope.page.pageNo+1}">下一页</a>
                        <a href="GroupServlet?pageNo=${requestScope.page.pageTotal}">末页</a>
                    </c:if>
                    共${requestScope.page.pageTotal}页，${requestScope.page.pageTotalCount}条记录到第
                    <input value="${requestScope.page.pageNo}" name="pn" id="pn_input">页
                    <input id="searchPageBtn" type="button" value="确定">

                </div>
                <c:if test="${sessionScope.user.type == 1}">
                    <div class="div_1">
                        <a href="group_edit.jsp"><input type="button" class=" btn btn-success btn-lg" value="添加"></a>

                    </div>
                </c:if>
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