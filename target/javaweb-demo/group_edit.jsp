<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>安民公益</title>
    <%@include file="base.jsp" %>
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/main.css">
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
        <div class="col-sm-7">
            <div class="news-list">
                <form action="GroupServlet" method="post">
                    <input type="hidden" name="action" value="add">
                    <table>
                        <tr>
                            <td><h3>捐助对象</h3></td>
                            <td>
                                <div class="input-group input-group-lg">
                                    <input name="name" type="text" value="高龄老人" class="form-control">
                                </div>
                            </td>
                        </tr>
                        <tr>
                            <td><h3>组织机构</h3></td>
                            <td>
                                <div class="input-group input-group-lg">
                                    <input name="groupName" type="text" value="老年人基金会" class="form-control">
                                </div>
                            </td>
                        </tr>
                        <tr>
                            <td><h3>项目开始时间</h3></td>
                            <td>
                                <div class="input-group input-group-lg">
                                    <input name="startTime" type="text" value="" class="form-control">
                                </div>
                            </td>
                        </tr>
                        <tr>
                            <td><h3>捐助对象</h3></td>
                            <td>
                                <div class="input-group input-group-lg">
                                    <input name="name" type="text" value="高龄老人" class="form-control">
                                </div>
                            </td>
                            <td>
                                <input type="submit" value="提交" class="btn btn-success btn-lg">
                            </td>
                        </tr>
                        <%--<tr>
                            <td><h4>展示图片上传</h4></td>
                            <td>
                                <div class="">
                                    <input type="file" name="photo" class="btn btn-lg">
                                </div>
                            </td>
                        </tr>--%>
                    </table>
                </form>
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