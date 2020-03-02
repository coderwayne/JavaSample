<%--
  Created by IntelliJ IDEA.
  User: huxiaowei
  Date: 2019/12/24
  Time: 4:34 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Test Page</title>
</head>
<body>
    <a href="book/testValidity">测试有效性</a>
    <br /><br />
    <a href="book/setRequestScopeInfo" target="_blank">设置RequestScope</a>
    <br /><br />
    <a href="book/getSessionAttributes" target="_blank">获取SessionAttributes</a>
    <br /><br />
    <a href="book/delSessionAttributes" target="_blank">删除SessionAttributes</a>
    <br /><br />
    <div style="background-color: silver;">${ requestScope }</div>
    <br /><br />
    <div style="background-color: lightgreen;">${ sessionScope }</div>
</body>
</html>
