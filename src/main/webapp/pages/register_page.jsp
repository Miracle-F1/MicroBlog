<%--
  Created by IntelliJ IDEA.
  User: Miracle
  Date: 2017/4/4
  Time: 下午12:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户注册</title>
</head>
<body>
<form action="/register">
    <table>

        <tr>
            <td>* 用户名：</td>
            <td><input type="text" name="username"/></td>
        </tr>

        <tr>
            <td>* 密码：</td>
            <td><input type="password" name="password"/></td>
        </tr>

        <tr>
            <td>手机号：</td>
            <td><input type="text" name="phone"/></td>
        </tr>

        <tr>
            <td>年龄：</td>
            <td><input type="text" name="age"/></td>
        </tr>

        <tr>
            <td><button type="submit">注册</button></td>
        </tr>


    </table>
</form>

</body>
</html>
