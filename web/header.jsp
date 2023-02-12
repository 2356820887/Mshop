<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path;
%>
<html>
<head>
    <meta charset="UTF-8">
    <title>商品详情</title>
    <link rel="stylesheet" type="text/css" href="css/public.css"/>
    <link rel="stylesheet" type="text/css" href="css/book.css"/>
</head>
<body>
<div class="head">
    <div class="head_zi">
        <div class="huan">
            <c:choose>
                <c:when test="${!empty user && user.power == 1}"><a href="manage.jsp">${user.username}</a>,欢迎您</c:when>
                <c:when test="${!empty user && user.power == 0}"><span>${user.username},欢迎您</span></c:when>
                <c:otherwise><span style="color:white;">未登录，请</span><a href="register.jsp" style="color: #0c63e4">登录</a></c:otherwise>
            </c:choose>
        </div>
        <div class="car">
            <a href="car.jsp"><img src="images/购物车.png" height="28px">
                <span>购物车</span>
            </a>
        </div>
        <div class="login">
            <%--<c:if test="${empty user}"><div><a href="register.jsp">登录</a></div></c:if>--%>
            <%--<div><a href="register.jsp">注册</a></div>--%>
            <c:if test="${!empty user}"><div><a href="Logout">退出</a></div></c:if>
        </div>
    </div>
</div>
</body>
</html>
