<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Miracle
  Date: 2017/4/4
  Time: 下午12:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" type="text/css" href="/css/page.css">
<html>
<head>
    <title>微博列表</title>
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
<br/><br/><br/><br/><br/>
<table>
    <c:forEach items="${bloglist}" var="blog">
        <tr><td><a href="javascript:;" onclick="window.location='/user/showuser/${blog.username}'">${blog.username}</a></td></tr>
        <tr><td><a href="javascript:;" onclick="window.location='/blog/getblogdetail/${blog.blogid}'">${blog.content}</a></td></tr>
        <tr><td>回复数[${blog.commentnum}]</td></tr>
        <tr><td>${blog.blogtime}</td></tr>
        <tr><td><br/></td></tr>
        </c:forEach>
</table>
</body>
</html>
