<%--
  Created by IntelliJ IDEA.
  User: Miracle
  Date: 2017/4/4
  Time: 下午3:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>${userinfo.username}的资料</title>
</head>
<body>
<table>
    <tr>
        <td>用户名：</td>
        <td>${userinfo.username}</td>
    </tr>
    <tr>
        <td>电话：</td>
        <td>${userinfo.phone}</td>
    </tr>
    <tr>
        <td>年龄：</td>
        <td>${userinfo.age}</td>
    </tr>
    <tr>
        <td>最后登录时间：</td>
        <td>${userinfo.lastLoginTime}</td>
    </tr>
    <tr>
        <td></td>
    </tr>
</table>
</body>
</html>
