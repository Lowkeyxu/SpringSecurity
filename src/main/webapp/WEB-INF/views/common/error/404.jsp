<%@ include file="/WEB-INF/views/common/include/taglib.jsp" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isErrorPage="true" session="false" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>404 页面</title>
    <link rel="shortcut icon" href="${ctx}/favicon.ico">
${bootstrap_css}
${font_awesome_css}
${animate_css}
${stylemin862f_css}
</head>
<body class="gray-bg">
<div class="middle-box text-center animated fadeInDown">
    <h1>404</h1>
    <h3 class="font-bold">页面未找到！</h3>
    <div class="error-desc">
        抱歉，页面好像去火星了~
    </div>
</div>
</body>
</html>
