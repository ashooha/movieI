<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2018-12-01
  Time: 18:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>movieDetail</title>
</head>
<body>
<table border="1" cellspacing="0">
    <tr>
        <td>电影ID</td>
        <td>影名</td>
        <td>时长</td>
        <td>国家</td>
        <td>语言</td>
        <td>导演</td>
        <td>主演</td>
        <td>简介</td>
        <td>上线时间</td>
        <td>下线时间</td>
        <td>热度</td>
    </tr>
        <tr>
            <td><c:out value="${movie.id}"/></td>
            <td><c:out value="${movie.movieName}"/></td>
            <td><c:out value="${movie.timeLength}"/></td>
            <td><c:out value="${movie.country}"/></td>
            <td><c:out value="${movie.language}"/></td>
            <td><c:out value="${movie.director}"/></td>
            <td><c:out value="${movie.actors}"/></td>
            <td><c:out value="${movie.intro}"/></td>
            <td><c:out value="${movie.showDate}"/></td>
            <td><c:out value="${movie.offTime}"/></td>
            <td><c:out value="${movie.heat}"/></td>
        </tr>
</table>
<h1>shows</h1>
<table border="1" cellspacing="0">
    <tr>
        <td>id</td>
        <td>time</td>
    </tr>
    <c:forEach items="${performanceList}" var="show">
        <tr>
            <td><c:out value="${show.id}"/></td>
            <td><c:out value="${show.time}"/></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
