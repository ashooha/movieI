<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2018-11-25
  Time: 13:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<html>
<head>
    <title>简易设备资产管理系统</title>
    <style>
        .formeber{
            margin: auto;
        }
        .formebers{
            width: 280px;
            height: auto;
            margin-left: 50px;
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
            float: left;margin: 20px;width: 65px
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
</head>
<body style="padding-top: 50px; padding-left: 150px;">
    <h1>简易设备资产管理系统</h1>
    <div class="formebers">
        <sf:form method="post" commandName="tUser">
            <sf:label path="username" cssErrorClass="error" cssClass="formeber">用户名</sf:label><sf:input path="username" cssErrorClass="error" cssClass="formeber"/><br/>
            <sf:label path="password" cssErrorClass="error" cssClass="formeber">密码</sf:label><sf:password id="p1" path="password" cssErrorClass="error" cssClass="formeber" showPassword="输入密码"/><br/>
            <sf:label path="password" cssErrorClass="error" cssClass="formeber">密码确认</sf:label><input type="password"  name="subpassword" Class="formeber" id="p2"/><br/>
            <sf:label path="name" cssErrorClass="error" cssClass="formeber">真实姓名</sf:label><sf:input path="name" cssErrorClass="error" cssClass="formeber"/><br/>
            <sf:label path="tel" cssErrorClass="error" cssClass="formeber">联系电话</sf:label><sf:input path="tel" cssErrorClass="error" cssClass="formeber"/><br/>
            <sf:label path="email" cssErrorClass="error" cssClass="formeber">电子邮箱</sf:label><sf:input path="email" cssErrorClass="error" cssClass="formeber"/><br/>
            <input type="submit" value="注册" class="submit"/>
            <a href="/tUser/login"><input type="button" value="取消" class="submit" style="float: right"/></a>
        </sf:form>
    </div>

</body>
</html>
