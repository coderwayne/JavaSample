<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Test Page</title>
    <script type="text/javascript" src="js/jquery-3.4.1.min.js"></script>
    <script type="text/javascript">
        // $(function() {
        //     // 初始化内容
        //     alert("胡晓伟");
        // });

        $(function () {
            $("#myBtn").click(function () {
                $.ajax({
                    url:"user/testAjax",
                    contentType:"application/json; charset=utf-8",
                    data:'{"userName":"老胡", "password":"666888", "age":23}',
                    dataType:"json",
                    type:"post",
                    success:function (data) {
                        alert(data);
                        alert(data.userName + "," + data.password + "," + data.age);
                    }
                });
            });
        });
    </script>
</head>
<body>
    <a href="user/testValidity">测试有效性</a>
    <br /><br />
    <button id="myBtn">燃烧</button>
</body>
</html>
