<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2018-12-01
  Time: 13:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<html>
<head>
    <title>UserHome</title>
</head>
<body>
<h1>this is userHome</h1>
<sf:form method="post" commandName="user">
    <sf:label path="username">username:</sf:label>
    <sf:input path="username"/>
    <sf:label path="name">name:</sf:label>
    <sf:input path="name"/><br/>
</sf:form>
</body>
</html>
