<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<title>电影</title>
<body>
<h2>Hello World!</h2>
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
    <c:forEach items="${movieList}" var="movie">
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
            <td><a href="/movie/id=${movie.id}">购票</a> </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
