<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Test Page</title>
</head>
<body>
    <a href="book/testValidity">测试有效性</a>
    <br /><br />
    <form action="book/uploadAction" enctype="multipart/form-data" method="post">
        <input type="file" name="hxwUpload" />
        <br /><br />
        <input type="submit" value="点击上传" />
    </form>
</body>
</html>
