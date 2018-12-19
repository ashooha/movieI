<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<title>电影</title>
<jsp:include page="inc.jsp"/>
<script type="text/javascript">
    var index_layout;
    $(function() {
        index_layout = $('#index_layout').layout({
            fit : true
        });
    });
</script>
<body>
<jsp:include page="user/login.jsp"/>
<div id="index_layout">
    <div data-options="region:'north',href:'${pageContext.request.contextPath}/layout/north'" style="height: 70px; overflow: hidden;" class="logo"></div>
    <div data-options="region:'center'" title="电影" style="overflow: hidden">
        <div title="首页" data-options="border:false" style="overflow: hidden;">
            <iframe src="${pageContext.request.contextPath}/movie/listMovies" frameborder="0" style="border: 0; width: 100%; height: 98%;"></iframe>
        </div>
    </div>
</div>

</body>
</html>
