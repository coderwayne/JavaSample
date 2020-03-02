<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<html>
<head>
    <title>测试页面</title>
    <meta charset="UTF-8">
</head>
<body>
    <a href="user/test">有效性测试</a>
    <br /><br />
    <a href="user/testRequestParams?title=老人与海">测试RequestParams</a>
    <br /><br />
    <a href="user/testRequestParams?title=老人与海&author=海明威">测试RequestParams</a>
    <br /><br />
    <form action="user/testRequestBody" method="post" accept-charset="UTF-8">
        <input type="text" name="title" />
        <br /><br />
        <input type="text" name="author" />
        <br /><br />
        <input type="submit" value="提交吧" />
    </form>
</body>
</html>
