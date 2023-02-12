<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
  <title>商城首页</title>
  <link rel="stylesheet" type="text/css" href="css/public.css"/>
  <link rel="stylesheet" type="text/css" href="css/shouye.css"/>
  <script src="js/jquery-3.6.0.js" type="text/javascript" charset="utf-8"></script>
  <script src="js/front_page.js" type="text/javascript" charset="utf-8"></script>
</head>
<body>
<jsp:include page="header.jsp"/>
<div class="shop">
  <div class="lunbo" >
    <span class="right" id="right"></span>
    <span class="left" id="left"></span>
    <div id="lunbo" >
      <div>
        <a href="#"><img src="images/mi11.png" ></a>
      </div>
      <div>
        <a href="#"><img src="images/pingban5.png" ></a>
      </div>
      <div>
        <a href="#"><img src="images/450ebe4e2420eba7064b6ce08b2fc503.jpg"></a>
      </div>
      <div>
        <a href="#"><img src="images/3e34ddd6b7bcbfb90ed09e871d291593.png" ></a>
      </div>
      <div>
        <a href="#"><img src="images/f89261d8655d76f2ab2340e4a3738678.jpg"></a>
      </div>
    </div>
  </div>
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
