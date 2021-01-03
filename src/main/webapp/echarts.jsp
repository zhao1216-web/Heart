<%@ page import="com.zqy.Dao.UserDao" %>
<%@ page import="com.zqy.Dao.impl.UserDaoImpl" %><%--
  Created by IntelliJ IDEA.
  User: 赵清扬
  Date: 2021/1/3
  Time: 18:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="textml;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Document</title>
        <meta charset="utf-8">
        <%
            UserDao userDao = new UserDaoImpl();

            
        %>
        <!-- 引入 ECharts 文件 -->
        <script src="https://cdn.staticfile.org/echarts/4.3.0/echarts.min.js"></script>
    </head>
    <body>
        <!-- 为ECharts准备一个具备大小（宽高）的Dom -->
        <div id="main" style="width: 600px;height:400px;"></div>
        <script type="text/javascript">
            // 基于准备好的dom，初始化echarts实例
            var myChart = echarts.init(document.getElementById('main'));

            // 指定图表的配置项和数据
            var option = {
            title: {
            text: '数据展示表'
            },
            tooltip: {},
            legend: {
            data:['数量']
            },
            xAxis: {
            data: ["车辆数量","司机数量","用户数量","在线人数","信息数量"]
            },
            yAxis: {},
            series: [{
            name: '数量',
            type: 'bar',
            data: [<%=carNumber%>, <%=driverNumber%>, <%=userNumber%>,<%=((int) session.getServletContext().getAttribute("onlineNumber")-1)%>, <%=messageNumber%>]
            }]
            };
            // 使用刚指定的配置项和数据显示图表。
            myChart.setOption(option);
        </script>
    </body>
    <ml>

