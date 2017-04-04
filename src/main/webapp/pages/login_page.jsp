<%--
  Created by IntelliJ IDEA.
  User: Miracle
  Date: 2017/4/3
  Time: 下午11:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" type="text/css" href="/css/page.css">
<html>
<head>
    <title>欢迎登录~</title>
</head>
<body>
<form name = "loginform" action="/login">

    <table>

        <tr>
            <td>请输入用户名和密码</td>
        </tr>

        <tr>
            <td>用户名：</td>
            <td><input type="text" name="username"/></td>
        </tr>

        <tr>
            <td>密码：</td>
            <td><input type="password" name="password"/></td>
        </tr>

        <tr>
            <td><button type="submit">登录</button> </td>
        </tr>

    </table>

</form>
</body>
</html>
