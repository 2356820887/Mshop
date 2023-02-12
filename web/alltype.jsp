<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>商城首页</title>
    <link rel="stylesheet" type="text/css" href="css/public.css"/>
    <link rel="stylesheet" type="text/css" href="css/shouye.css"/>
    <link rel="stylesheet" type="text/css" href="css/book.css"/>
    <script src="js/jquery-3.6.0.js" type="text/javascript" charset="utf-8"></script>
    <script src="js/front_page.js" type="text/javascript" charset="utf-8"></script>
</head>
<body>
<jsp:include page="header.jsp"/>
<div class="xi_nav">
    <div class="wrap">
        <ul class="menu-list">
            <li class="menu"><a href="index">首页</a></li>
            <li class="menu"><a href="allType">全部分类</a></li>
            <li class="menu"><a href="#">新品上市</a></li>
            <li class="menu"><a href="#">热卖推荐</a></li>
        </ul>
    </div>
</div>
<div class="shop">
    <div class="nei">
        <div class="box_tit w">
            <h2 class="title">手机</h2>
            <div class="nei_pohot">
                <ul>
                    <c:forEach items="${phonelist}" var="goods">
                        <li class="phone_tu">
                            <a href="./detail?id=${goods.goods_id}">
                                <div class="ph">
                                    <img src=${goods.photo} >
                                </div>
                                <div class="na">${goods.goods_name}</div>
                                <p>￥${goods.unitPrice}</p>
                            </a>
                        </li>
                    </c:forEach>

                </ul>
            </div>
        </div>
        <div class="box_tit w">
            <h2 class="title">电脑</h2>
            <div class="nei_pohot">
                <ul>

                    <c:forEach items="${computerlist}" var="goods">
                        <li class="phone_tu">
                            <a href="./detail?id=${goods.goods_id}">
                                <div class="ph">
                                    <img src=${goods.photo} >
                                </div>
                                <div class="na">${goods.goods_name}</div>
                                <p>￥${goods.unitPrice}</p>
                            </a>
                        </li>
                    </c:forEach>

                </ul>
            </div>
        </div>
        <div class="box_tit w">
            <h2 class="title">外设</h2>
            <div class="nei_pohot">
                <ul>
                    <c:forEach items="${peripherallist}" var="goods">
                        <li class="phone_tu">
                            <a href="./detail?id=${goods.goods_id}">
                                <div class="ph">
                                    <img src=${goods.photo} >
                                </div>
                                <div class="na">${goods.goods_name}</div>
                                <p>￥${goods.unitPrice}</p>
                            </a>
                        </li>
                    </c:forEach>
                </ul>
            </div>
        </div>
        <div class="box_tit w">
            <h2 class="title">配件</h2>
            <div class="nei_pohot">
                <ul>
                    <c:forEach items="${partslist}" var="goods">
                        <li class="phone_tu">
                            <a href="./detail?id=${goods.goods_id}">
                                <div class="ph">
                                    <img src=${goods.photo} >
                                </div>
                                <div class="na">${goods.goods_name}</div>
                                <p>￥${goods.unitPrice}</p>
                            </a>
                        </li>
                    </c:forEach>
                </ul>
            </div>
        </div>
    </div>
</div>
<div class="nav">
    <ul>
        <%--<c:forEach items="${typename}" var="type">
        <li>${type.name}</li>
        </c:forEach>--%>
        <li class="current">手机</li>
        <li>电脑</li>
        <li>外设</li>
        <li>配件</li>
        <div class="back">返回顶部</div>
    </ul>
</div>

<jsp:include page="footer.jsp"/>
</body>
</html>
