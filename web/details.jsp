<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <html>
    <head>
        <meta charset="UTF-8">
        <title>商品详情</title>
        <link rel="stylesheet" type="text/css" href="css/public.css"/>
        <link rel="stylesheet" type="text/css" href="css/book.css"/>
    </head>
    <body>
    <jsp:include page="header.jsp"/>
    <div style="height: 500px;width: 100%">
        <div class="xi_nav">
            <div class="wrap">
                <ul class="menu-list">
                    <li class="menu"><a href="index">首页</a></li>
                    <li class="menu"><a href="allType">全部分类</a></li>
                    <li class="menu"><a href="new">新品上市</a></li>
                    <li class="menu"><a href="hot">热卖推荐</a></li>
                </ul>
            </div>
        </div>
        <div class="w">
            <div class="preview" id="preview">
                <div class="photo_xi">
                    <img src="${goods.photo}" width="350px">
                </div>
            </div>
            <div class="itemInfo-wrap">
                <div class="x-goodsname">
                    <h3>${goods.goods_name}</h3>
                </div>
                <div class="news">
                    <div class="" >
                        ${goods.details}
                    </div>
                </div>
                <div class="x-price">
                    <span>￥</span>
                    <div class="x-price_num">${goods.unitPrice}</div>
                </div>
                <div class="x-action">
                    <div class="liji">
                        <a href="buy.jsp">立即购买</a>
                    </div>
                    <div class="add_cart">
                        <a href="addCart?id=${goods.goods_id}">加入购物车</a>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <jsp:include page="footer.jsp"/>
    </body>
</html>
