<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2018-11-19
  Time: 10:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>--%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<html>
<head>
    <style>
        .login{
            width: 350px;
            height: auto;
            padding: auto;
        }
        .Title{
            margin-left: auto;
            margin-right: auto;
        }
        .formebers{
            width: 280px;
            height: auto;
            margin-right: auto;
            margin-left: auto;
            padding: auto;
        }
        label.formeber{
            width: 80px;
            height: auto;
            text-align: center;
            float: left;
            margin-top: 20px;
        }
        input.formeber{
            width: 200px;
            height: 2em;
            margin-top: 20px;
        }
       .submit{
            float: left;
            margin: 30px;
            width: 60px;
        }
        label.error{
            width: 80px;
            height: auto;
            text-align: center;
            float: left;
            margin-top: 20px;
            color: red;
        }
        password,input.error{
            width: 200px;
            height: 2em;
            margin-top: 20px;
            background-color: #ffcccc;
        }
    </style>

    <title>Login</title>
</head>
<body style="padding-top: 50px; padding-left: 150px;">
    <div class="login">
        <div class="Title">
        <h1>简易设备资产管理系统</h1>
        </div>
        <div class="formebers" >
        <sf:form method="post" commandName="tUser">
            <sf:label path="username" cssErrorClass="error" cssClass="formeber">用户名</sf:label>
            <sf:input path="username" cssErrorClass="error" cssClass="formeber"/><br/>
            <sf:label path="password" cssErrorClass="error" cssClass="formeber">密码</sf:label>
            <sf:password path="password" cssErrorClass="error" cssClass="formeber"/><br/>
            <input type="submit" value="登录" class="submit" />
            <a href="/tUser/register"><input type="button" value="注册" class="submit" style="float: right"/></a>
        </sf:form>

        </div>
    </div>
</body>
</html>
