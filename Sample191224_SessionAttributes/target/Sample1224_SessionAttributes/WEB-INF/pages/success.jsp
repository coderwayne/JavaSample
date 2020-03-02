<%--
  Created by IntelliJ IDEA.
  User: huxiaowei
  Date: 2019/12/24
  Time: 5:00 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Success</title>
</head>
<body>
    <h2>恭喜你成功了！</h2>
    <div style="background-color: silver;">${ requestScope }</div>
    <br /><br />
    <div style="background-color: lightgreen;">${ sessionScope }</div>

</body>
</html>
