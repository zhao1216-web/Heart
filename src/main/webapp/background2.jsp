<%--
  Created by IntelliJ IDEA.
  User: 赵清扬
  Date: 2021/1/3
  Time: 8:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <script type="text/javascript">
        alert()
    </script>

</head>
<body>
    <span>上传文件交由管理员审批，审批通过后发布</span>
    <form action="UploadServlet" method="post" enctype="multipart/form-data">
        <input type="file" name="file">
        <input type="submit" value="提交">
    </form>

</body>
</html>
