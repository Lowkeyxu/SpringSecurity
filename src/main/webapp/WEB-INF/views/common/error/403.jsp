<%@ include file="/WEB-INF/views/common/include/taglib.jsp" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isErrorPage="true" session="false" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>403 页面</title>
    <link rel="shortcut icon" href="${ctx}/favicon.ico">
${bootstrap_css}
${font_awesome_css}
${animate_css}
${stylemin862f_css}
</head>
<body class="gray-bg">
<div class="middle-box text-center animated fadeInDown">
    <h1>403</h1>
    <h3 class="font-bold">页面未授权！</h3>
    <div class="error-desc">
        抱歉，操作权限不足~
    </div>
</div>
</body>
</html>
