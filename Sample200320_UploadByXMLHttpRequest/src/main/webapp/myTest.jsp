<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Test Page</title>
    <script type="text/javascript" src="js/jquery-3.4.1.min.js"></script>
    <script type="text/javascript">
        var xhr;
        var startTime;
        var oloaded;
        function startUpload() {
            var fileObj = document.getElementById("myFile").files[0];

            if(!fileObj) {
                setNoticeText("未选择文件", "#fd7066");
                return;
            }

            if(fileObj.size > 500*1024*1024) {
                setNoticeText("选择文件超出500M", "#fd7066");
                return;
            }

            // FormData 对象
            var form = new FormData($( "#uploadForm" )[0]);

            // XMLHttpRequest 对象
            xhr = new XMLHttpRequest();
            xhr.open("post", "uploadController/uploadAction", true);

            xhr.onload = uploadComplete; //请求完成
            xhr.onerror =  uploadFailed; //请求失败
            xhr.upload.onprogress = progressFunction;//【上传进度调用方法实现】

            xhr.upload.onloadstart = function(){//上传开始执行方法

                startTime = new Date().getTime();   //设置上传开始时间
                oloaded = 0;//设置上传开始时，以上传的文件大小为0
                // alert("上传开始执行方法"+startTime+","+oloaded);
            };

            xhr.send(form);
        }

        //取消上传
        function cancleUpload(){
            xhr.abort();
        }

        //上传成功
        function uploadComplete(evt) {
            // 服务断接收完文件返回的结果
            // alert(evt.target.responseText);
            setNoticeText("上传成功!", "#008000")
        }

        //上传失败
        function uploadFailed(evt) {
            setNoticeText("上传失败！", "#fd7066")
        }

        //上传进度实现方法，上传过程中会频繁调用该方法
        function progressFunction(evt) {
            var progressBar = document.getElementById("progressBar");
            var percentageDiv = document.getElementById("percentage");
            // event.total是需要传输的总字节，event.loaded是已经传输的字节。如果event.lengthComputable不为真，则event.total等于0
            if (evt.lengthComputable) {//
                progressBar.max = evt.total;
                progressBar.value = evt.loaded;
                percentageDiv.innerHTML = Math.round(evt.loaded / evt.total * 100) + "%";
            }

            var curTime = new Date().getTime();//获取当前时间
            var pertime = (curTime-startTime)/1000; //计算出上次调用该方法时到现在的时间差，单位为s
            startTime = new Date().getTime(); //重新赋值时间，用于下次计算

            var perload = evt.loaded - oloaded; //计算该分段上传的文件大小，单位b
            oloaded = evt.loaded;//重新赋值已上传文件大小，用以下次计算

            //上传速度计算
            var speed = perload/pertime;//单位b/s
            var bspeed = speed;
            var units = 'b/s';//单位名称
            if(speed/1024>1){
                speed = speed/1024;
                units = 'k/s';
            }
            if(speed/1024>1){
                speed = speed/1024;
                units = 'M/s';
            }
            speed = speed.toFixed(1);
            //剩余时间
            var resttime = ((evt.total-evt.loaded)/bspeed).toFixed(1);
            setNoticeText("速度：" + speed + units + "，剩余时间：" + resttime + "s")
            if(bspeed==0) {
                setNoticeText("上传已取消", "#fd7066")
            }
        }

        function setNoticeText(text, hexColor) {
            document.getElementById("noticeText").style.color = hexColor;
            document.getElementById("noticeText").innerText = text;
        }
    </script>
</head>
<body>
    <form id="uploadForm" name="uploadForm" method="post" enctype="multipart/form-data">
        <input type="file" name="myFile" id="myFile" style="display:none;"
               onchange="document.uploadForm.path.value=this.value" multiple="multiple" />
        <input name="path" id="path" readonly>
        <input type="button" value="浏览..." onclick="document.uploadForm.myFile.click()">

        <input type="button" value="点击上传" onclick="startUpload()" />
        <br /><br />
        <progress id="progressBar" value="0" max="100"></progress>
        <span id="percentage"></span><br />
        <span id="noticeText" style="color: red; font-size: 16px"></span>

    </form>

<%--    <form id="uploadform" method="post" enctype="multipart/form-data">--%>
<%--        选择上传文件：<input type="file" id="file" name="file" οnchange="uploadfile()" /><br />--%>
<%--        <progress id="progressBar" value="0" max="100"></progress>--%>
<%--        <span id="percentage"></span><br />--%>
<%--        <input type="button" value="点击上传" onclick="uploadfile()" />--%>
<%--    </form>--%>







<%--<form name="form" id="form" method="post" enctype="multipart/form-data">--%>
<%--    <input type="file" name="upload" id="upload"style="display: none;"--%>
<%--           onchange="document.form.path.value=this.value" multiple="multiple" />--%>
<%--    <input name="path" id="path" readonly>--%>
<%--    <input type="button" value="浏览..." onclick="document.form.upload.click()">--%>
<%--</form>--%>

<%--<div class="file">上传图片<input type="file" name="myfiles"/></div>--%>
</body>
</html>
