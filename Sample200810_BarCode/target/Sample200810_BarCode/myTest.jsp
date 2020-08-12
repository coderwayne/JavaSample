<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>老胡条形码</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <script src="https://cdn.jsdelivr.net/npm/vue/dist/vue.js"></script>
    <script src="https://unpkg.com/vue-router/dist/vue-router.js"></script>
    <script type="text/javascript" src="js/jquery-3.4.1.min.js"></script>
    <script type="text/javascript">


        $(function () {
            $("#myBtn").click(function () {
                $.ajax({
                    url:"barCode/testAjax",
                    contentType:"application/json; charset=utf-8",
                    data:'{"barCodeID":'+Math.floor(Math.random() * 100000)+', "color":"'+document.getElementById("txtColor").value+'", "size":"'+document.getElementById("txtSize").value+'"}',
                    dataType:"json",
                    type:"post",
                    success:function (data) {
                        alert("生成条形码成功，保存路径："+data.imageUrl);
                        // alert(data.userName + "," + data.password + "," + data.age);


                        document.getElementById("myPic").src = data.imageUrl;
                    }
                });
            });
        });
    </script>
</head>
<body>

    <h3>老胡条形码生成测试</h3>

    <div style="background-color: bisque;">
        输入颜色：<input id="txtColor" type="text" value="red" maxlength="6">
    </div>

    <div style="background-color: bisque; margin-top:20px;">
        输入尺码：<input id="txtSize" type="text" value="XXL" maxlength="5">
    </div>

    <div style="background-color: bisque; margin-top:20px;">
        <img id="myPic" src="/image/default.jpeg" style="width: 158px; height: 110px;"></img>
    </div>

    <br><br><br>
    <button id="myBtn">生成条形码</button>

    <div style="display: none;">
        <div><a href="barCode/testValidity">测试有效性</a></div>
        <br><br><br>
        <div><a href="barCode/testBuildBarCode">Test</a></div>
    </div>


</body>
</html>
