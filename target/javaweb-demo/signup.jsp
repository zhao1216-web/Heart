<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>注册</title>
    <%@include file="base.jsp" %>
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/main.css">


    <!--bug     js未生效-->
    <script type="text/javascript">

        $(function () {

            $(".submit").click(function () {
                //获取用户名输入框内容
                var username = $(".username1").val();
                //创建正则表达式
                var usernamePatt = /^\w{5,12}$/;

                if (!usernamePatt.test(username)) {
                    $("span.span_1").text(" 用户名长度为5-12位");
                    return false;
                }

                $("span.span_1").text("");
            });

            $(".submit").click(function () {
                //获取用户名输入框内容
                var password1 = $(".password1").val();
                //创建正则表达式
                var password1Patt = /^\w{5,12}$/;

                if (!password1Patt.test(password1)) {
                    $("span.span_4").text(" 密码长度为5-12位");
                    return false;
                }

                $("span.span_4").text("");
            });

            $(".submit").click(function () {

                var email = $(".email1").val();
                var emailPatt = /^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\.[a-zA-Z0-9_-]+)+$/;


                if (!emailPatt.test(email)) {
                    $("span.span_2").text(" 邮箱格式不正确");
                    return false;
                }

                $("span.span_2").text("");
            });

            $(".submit").click(function () {

                var idCard = $(".idCard1").val();
                var idCardPatt = /^[0-9]{17}[0-9X]$/;


                if (!idCardPatt.test(idCard)) {
                    $("span.span_5").text(" 身份证格式不正确");
                    return false;
                }

                $("span.span_5").text("");
            });


            $(".submit").click(function () {

                var password1 = $(".password1").val();
                var password2 = $(".password12").val();

                if (password1 != password2) {
                    $("span.span_3").text(" 两次密码不一致，请重新输入");
                    return false;
                }
                $("span.span_3").text("");
            });


            $(".submit2").click(function () {
                //获取用户名输入框内容
                var username = $(".username2").val();
                //创建正则表达式
                var usernamePatt = /^\w{5,12}$/;

                if (!usernamePatt.test(username)) {
                    $("span.span_1").text(" 用户名长度为5-12位");
                    return false;
                }

                $("span.span_1").text("");
            });

            $(".submit2").click(function () {
                //获取用户名输入框内容
                var password1 = $(".password2").val();
                //创建正则表达式
                var password1Patt = /^\w{5,12}$/;

                if (!password1Patt.test(password1)) {
                    $("span.span_4").text(" 密码长度为5-12位");
                    return false;
                }

                $("span.span_4").text("");
            });

            $(".submit2").click(function () {

                var email = $(".email2").val();
                var emailPatt = /^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\.[a-zA-Z0-9_-]+)+$/;


                if (!emailPatt.test(email)) {
                    $("span.span_2").text(" 邮箱格式不正确");
                    return false;
                }

                $("span.span_2").text("");
            });

            $(".submit2").click(function () {

                var idCard = $(".idCard2").val();
                var idCardPatt = /^[0-9]{17}[0-9X]$/;


                if (!idCardPatt.test(idCard)) {
                    $("span.span_5").text(" 身份证格式不正确");
                    return false;
                }

                $("span.span_5").text("");
            });


            $(".submit2").click(function () {

                var password1 = $(".password2").val();
                var password2 = $(".password22").val();

                if (password1 != password2) {
                    $("span.span_3").text(" 两次密码不一致，请重新输入");
                    return false;
                }
                $("span.span_3").text("");
            });


            $("#option1").click(function () {
                document.getElementById('div_1').style.display='block';
                document.getElementById('div_2').style.display='none'
            })

            $("#option2").click(function () {
                document.getElementById('div_2').style.display='block';
                document.getElementById('div_1').style.display='none'
            })

            $(".username1").blur(function () {

                var username = this.value;

                $.getJSON("http://localhost:8080/RegisterServlet","username="+username,function (data) {
                    if(data.existsUsername){
                        alert("用户名已存在!请重新输入");
                    }else {
                        alert("用户名可用!");
                    }
                });

            });

           /* $(".username1").blur(function(){

                //使用jQuery发送一个ajax请求
                var name=$(".username1").val();


                $.ajax({

                    url:"RegisterServlet",//目标地址
                    type:"POST",//请求方式
                    data:{"username":name},//请求参数
                    success:function(obj){//obj:后台返回给我们的一个json的字符串

                        var json=JSON.parse(obj);

                        if(json.result=="0000"){
                            ///location.href="http//www.baidu.com";
                            alert(1);
                        }else if (json.result=="0001") {
                            alert(json.msg);
                        }else{
                            alert(json.msg);
                        }

                    }

                });*/


            });



    </script>


    <style>
        .span_1 {
            color: red;
        }

        .span_2 {
            color: red;
        }

        .span_3 {
            color: red;
        }

        .span_4 {
            color: red;
        }

        .span_5 {
            color: red;
        }

        #div_1 {
            display: block;
        }

        #div_2 {
            display: none;
        }

    </style>

</head>
<body>

<%@include file="header.jsp" %>

<div class="container container-small">
    <h1>注册
        <small>已有帐号，<a href="login.jsp">登录</a></small>
    </h1>

    <div class="btn-group" data-toggle="buttons">
        <label class="btn btn-primary">
            <input type="radio" name="options" id="option1" class="active"> 我是捐款人
        </label>
        <label class="btn btn-primary">
            <input type="radio" name="options" id="option2"> 我们是基金组织
        </label>
    </div>
    <div id="div_1">
        <form action="RegisterServlet" method="post">
            <div class="form-group">
                <label>用户名</label>
                <input type="hidden" name="type" id="type1" value="2">
                <input type="text" class="form-control username1" name="username" id="username1">
                <span class="span_1"></span>
            </div>
            <div class="form-group">
                <label>邮箱</label>
                <input type="text" class="form-control email1" name="email" id="email1">
                <span class="span_2"></span>
            </div>
            <div class="form-group">
                <label>身份证号</label>
                <input type="text" class="form-control idCard1" name="idCard" id="idCard1">
                <span class="span_5"></span>
            </div>
            <div class="form-group">
                <label>密码</label>
                <input type="password" class="form-control password1" name="password" id="password1">
                <span class="span_4"></span>
            </div>
            <div class="form-group">
                <label>确认密码</label>
                <input type="password" class="form-control password12" id="password12">
                <span class="span_3"></span>
            </div>
            <input type="hidden" name="start" value="start">
            <div class="form-group">
                <button type="submit" class="btn btn-primary btn-block submit" id="submit2">注册</button>
            </div>
            <div class="form-group">
                注册极客开发者头条即代表您同意<a href="#">极客开发者服务条款</a>
            </div>
        </form>
    </div>

    <div id="div_2">
        <form action="RegisterServlet" method="post">
            <div class="form-group">
                <label>基金组织名</label>
                <input type="text" class="form-control username2" name="username" id="username2">
                <input type="hidden" name="type" id="type2" value="3">
                <span class="span_1"></span>
            </div>
            <div class="form-group">
                <label>邮箱</label>
                <input type="text" class="form-control email2" name="email" id="email2">
                <span class="span_2"></span>
            </div>
            <div class="form-group">
                <label>身份证号</label>
                <input type="text" class="form-control idCard2" name="idCard" id="idCard2">
                <span class="span_5"></span>
            </div>
            <div class="form-group">
                <label>密码</label>
                <input type="password" class="form-control password2" name="password" id="password2">
                <span class="span_4"></span>
            </div>
            <div class="form-group">
                <label>确认密码</label>
                <input type="password" class="form-control password22" id="password22">
                <span class="span_3"></span>
            </div>
            <div class="form-group">
                <button type="submit" class="btn btn-primary btn-block submit2" id="submit">注册</button>
            </div>
            <div class="form-group">
                注册极客开发者头条即代表您同意<a href="#">极客开发者服务条款</a>
            </div>
        </form>
    </div>

</div>

<%@include file="footer.jsp" %>

</body>
</html>