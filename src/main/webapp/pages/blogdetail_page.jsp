<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Miracle
  Date: 2017/4/4
  Time: 下午12:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" type="text/css" href="/css/page.css">
<html>
<head>
    <title>微博详情</title>
    <script language="JavaScript">
        function addcomment(){
            commentform.action = "/blog/addcomment/${blog.blogid}";
            commentform.submit();
        }
    </script>
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
<br/><br/><br/><br/><br/><br/>
<table>
    <tr>
        <td>${blog.username}:</td>
    </tr>
    <tr>
        <td>${blog.content}</td>
        <td>${blog.blogtime}</td>
    </tr>
    <tr>
    <tr><td><br/>微博评论：</td></tr>
        <c:forEach items="${commentlist}" var="comment">
    <tr>
        <td><a href="javascript:;" onclick="window.location='/user/showuser/${comment.username}'">${comment.username}</a></td>
        <td>${comment.content}</td>
        <td>${comment.commenttime}</td>
    </tr>
    </c:forEach>
    </tr>
    <tr>
        <form name="commentform" action="">
            <td>
                <textarea name="commentcontent"></textarea>
            </td>
            <td>
                <button onclick="addcomment()">发表评论</button>
            </td>
        </form>
    </tr>

</table>
</body>
</html>
