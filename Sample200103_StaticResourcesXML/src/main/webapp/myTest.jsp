<%--
  Created by IntelliJ IDEA.
  User: huxiaowei
  Date: 2020/1/6
  Time: 9:46 上午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试页面</title>
    <script type="text/javascript" src="js/jquery-3.4.1.min.js"></script>
    <script type="text/javascript">
        $(function() {
            // 初始化内容
            alert("胡晓伟");
        });

        $(function () {
            $("#myBtn").click(function () {
                alert("hello my button");
            });
        });
    </script>
</head>
<body>
    <a href="book/testValidity">有效性测试</a>
    <br /><br />
    <button id="myBtn">测试按钮</button>
</body>
</html>
