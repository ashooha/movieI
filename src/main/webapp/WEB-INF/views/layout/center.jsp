
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>movies</title>
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
    <td>操作</td>
    </tr>
    <c:forEach items="${movieList}" var="Movie">
        <tr>
        <td><c:out value="${Movie.id}"/></td>
        <td><c:out value="${Movie.movieName}"/></td>
        <td><c:out value="${Movie.timeLength}"/></td>
        <td><c:out value="${Movie.country}"/></td>
        <td><c:out value="${Movie.language}"/></td>
        <td><c:out value="${Movie.director}"/></td>
        <td><c:out value="${Movie.actors}"/></td>
        <td><c:out value="${Movie.intro}"/></td>
        <td><c:out value="${Movie.showDate}"/></td>
        <td><c:out value="${Movie.offTime}"/></td>
        <td><c:out value="${Movie.heat}"/></td>
        <td><a href="/movie/id=${Movie.id}">购票</a> </td>
        </tr>
    </c:forEach>
    </table>
</body>
</html>
