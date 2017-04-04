<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Miracle
  Date: 2017/4/4
  Time: 下午12:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" type="text/css" href="/css/page.css">
<html>
<head>
    <title></title>
</head>
<body>
<div class="header">
    <div class="zuoduiqi">微博主页</div>
    <c:choose>
        <c:when test="${sessionScope.user == null}">
            <div class="youduiqi">
                <a href="/login_page">登录</a>
                <a href="/register_page">注册</a>
            </div>
        </c:when>
        <c:otherwise>
            <div class="youduiqi">
                    ${sessionScope.user.username}
                <a href="/updateuser_page">个人中心</a>
                <a href="/user/logout">退出登录</a>
            </div>
        </c:otherwise>
    </c:choose>
</div>
${msg}
</body>
</html>
