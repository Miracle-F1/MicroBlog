<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" type="text/css" href="/css/page.css">
<html>
<head>
    <title>欢迎使用微博~</title>
</head>
<body>
    <c:choose>
    <c:when test="${sessionScope.user == null}">

    <div class="header">
        <div class="zuoduiqi">微博主页</div>
        <div class="youduiqi">
            <a href="/login_page">登录</a>
            <a href="/register_page">注册</a>
        </div>
    </div>
        <div class="f1">登录后可查看精彩内容哟~</div>
    </c:when>
    <c:otherwise>

    <div class="header">
        <div class="zuoduiqi">
            <a href="/home_page">微博主页</a>
            <form action="" ><input type="text" name="searchtext"/><button type="submit">搜索用户</button></form>
        </div>
        <div class="youduiqi">
        <a href="/blog/getbloglist">刷微博</a>
        ${sessionScope.user.username}
        <a href="/blog/getmybloglist">我的微博</a>
        <a href="/updateuser_page">个人中心</a>
        <a href="/user/logout">退出登录</a>
        </div>
    </div>
        <table class="q1">
            <tr>
                <td>
        <form name="blogform" action="/blog/add">
            <textarea name="blogcontent" class="ta"></textarea>
                <td><button type="submit">发送微博</button></td>
        </form>
               </td>

            </tr>

        </table>
    </c:otherwise>
    </c:choose>
</body>
</html>
