<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Test Page</title>
</head>
<body>
    <h3>老胡测试页面</h3>
    <a href="userService/getUser">配置测试按钮</a>

    <a href="userService/testParam?uname=jack&pwd=1234">测试参数获取</a>

    <form action="userService/testParamToBean" method="post">
        ID:<input type="text" value="998" name="userID" />
        <br />
        姓名：<input type="text" name="userName" />
        <br />
        密码：<input type="text" name="password" />
        <br />
        手机号码：<input type="text" name="contactInfo.mobilePhone" />
        <br />
        住址：<input type="text" name="contactInfo.address" />
        <br />
        手机号码2：<input type="text" name="myList[0].mobilePhone" />
        <br />
        地址2：<input type="text" name="myList[0].address" />
        <br />
        手机号码3：<input type="text" name="myList[1].mobilePhone" />
        <br />
        地址3：<input type="text" name="myList[1].address" />
        <br />
        手机号码4：<input type="text" name="myMap['one'].mobilePhone" />
        <br />
        地址4：<input type="text" name="myMap['one'].address" />
        <br />
        手机号码5：<input type="text" name="myMap['two'].mobilePhone" />
        <br />
        地址5：<input type="text" name="myMap['two'].address" />
        <input type="submit" />
    </form>
</body>
</html>

<%--private int userID;--%>
<%--private String userName;--%>
<%--private String password;--%>
<%--private ContactInfo contactInfo;--%>
<%--private String mobilePhone;--%>
<%--private String address;--%>