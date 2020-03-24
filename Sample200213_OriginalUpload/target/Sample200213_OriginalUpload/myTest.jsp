<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试页面</title>
</head>
<body>
    <a href="book/testValidity">测试有效性</a>

    <form action="book/uploadAction" method="post" enctype="multipart/form-data">
        <input type="file" name="myUpload1" />
        <br />
        <input type="submit" value="点击上传" />
    </form>
</body>
</html>
