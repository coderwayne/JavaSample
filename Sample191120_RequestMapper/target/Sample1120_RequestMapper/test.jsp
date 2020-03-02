<%--
  Created by IntelliJ IDEA.
  User: huxiaowei
  Date: 2019-11-20
  Time: 11:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试页面</title>
</head>
<body>
    <h3>测试页面</h3>
    <a href="bookService/getOne">获取一本书</a>
    <br /><br />
    <a href="bookService/testMethod">测试Method</a>
    <br /><br />
    <a href="bookService/testParams?bookName=JaneEyre1&author=Charlotte">测试params</a>
    <br /><br />
    <a href="bookService/testHeaders">测试headers</a>
</body>
</html>
