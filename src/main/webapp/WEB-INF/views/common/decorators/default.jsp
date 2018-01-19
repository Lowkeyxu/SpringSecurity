<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%@include file="../include/head.jsp"%>
<!DOCTYPE html>
<html>
<head>
<title><sitemesh:write property='title' /> - 项目管理平台</title>
<sitemesh:write property='head' />
<style type="text/css">
/*重写select2样式*/
.select2-container--default .select2-selection--single {
	border: 1px solid #e5e6e7;
}
/*重写my97样式*/
.Wdate {
	border: 1px solid #e5e6e7;
	height:auto;
	/* max-width:240px; */
}
/*重写基础样式*/
input[type=text], textarea {
	min-width: 75px;
}
</style>
</head>
<body class="gray-bg">
	<div class="wrapper wrapper-content animated fadeInUp">
		<div class="row">
			<div class="col-sm-12">
				<sitemesh:write property='body' />
			</div>
		</div>
	</div>
	${select2_js}
	<script type="text/javascript">
		$.fn.select2.defaults.set("width", "100%");
		$("select").select2();
	</script>
</body>
</html>
