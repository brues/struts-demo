<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
    <title>上传文件</title>
</head>
<body>
    <s:form action="" namespace="" enctype="multipart/form-data">
        <s:file name="upload" label="输入要上传的文件名"/>
        <s:submit value="上传"/>
    </s:form>
</body>
</html>
