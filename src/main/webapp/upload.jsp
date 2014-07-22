<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title></title>
    </head>
    <body>
        <form action="/upload/uploadImg.action" id="form" method="post" enctype="multipart/form-data">
            <input type="text" value="123" name="str"/>
            <input name="img" type="file" />
            <input type="submit" value="提交" />
        </form>
    </body>
</html>
