<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title></title>
        <script src="/resources/jquery/jquery.js"></script>
        <script src="/resources/jquery/jquery.form.js"></script>
        <script>
            $(document).ready(function() {
                $("#ajaxbtn").click(function(){
                    $("#ajaxform").ajaxSubmit({
                        url:"/upload/ajaxUpload.action"
                    });
                });
            });
        </script>
    </head>
    <body>
        <form action="/upload/uploadImg.action" id="form" method="post" enctype="multipart/form-data">
            <span>同步图片上传</span>
            <input name="img" type="file" /><br/>
            <input type="submit" value="提交" />
        </form>
        <br/><br/><br/><br/><br/>
        <form id="ajaxform" method="post" enctype="multipart/form-data">
            <span>异步图片上传</span>
            <input name="image" type="file" />
        </form>
        <input id="ajaxbtn" type="button" value="提交" />
    </body>
</html>
