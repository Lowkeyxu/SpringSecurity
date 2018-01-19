<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--<%@ taglib prefix="fns" uri="/WEB-INF/tlds/simpo.tld" %>--%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="ckfinder" uri="http://ckfinder.com" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--<!--获取项目名称(路径)-->--%>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<%--<!-- jquery js -->--%>
<c:set var="jquery_js" value="<script type='text/javascript' src='${ctx}/static/common/plugins/jquery/jquery-1.12.4.js?version=20160829001'></script>"/>
<%--<!--辛普自定义常用方法js -->--%>
<c:set var="simpo_js" value="<script type='text/javascript' src='${ctx}/static/common/js/simpo.js?version=20160829001'></script>"/>
<%--<!-- bootstrap js-->--%>
<c:set var="bootstrap_js" value="<script type='text/javascript' src='${ctx}/static/common/plugins/bootstrap/js/bootstrap.min.js?v=3.3.0'></script>"/>
<%--<!-- bootstrap css-->--%>
<c:set var="bootstrap_css" value="<link href='${ctx}/static/common/plugins/bootstrap/css/bootstrap.min.css?v=3.3.0' rel='stylesheet'>"/>
<%--<!--动画效果css -->--%>
<c:set var="animate_css" value="<link href='${ctx}/static/common/css/animate.min.css?version=20160829001' rel='stylesheet'>"/>
<%--<!-- 字体样式css -->--%>
<c:set var="font_awesome_css" value="<link href='${ctx}/static/common/plugins/font-awesome/css/font-awesome.min.css?v=4.6.3' rel='stylesheet'>"/>
<%--<!-- 样式，此样式子请勿乱引用-->--%>
<c:set var="stylemin862f_css" value="<link href='${ctx}/static/common/css/style.css?v=1.0.0' rel='stylesheet'>"/>
<%--<!-- tab标签控件-->--%>
<c:set var="contabs_js" value="<script type='text/javascript' src='${ctx}/static/common/js/contabs.min.js?version=20160829001'></script>"/>
<%--<!--jquery菜单插件 -->--%>
<c:set var="metisMen_js" value="<script type='text/javascript' src='${ctx}/static/common/plugins/metisMenu/jquery.metisMenu.js?version=20160829001'></script>"/>
<%--<!--jquery滚动条插件slimScroll -->--%>
<c:set var="slimscroll_js" value="<script type='text/javascript' src='${ctx}/static/common/plugins/slimscroll/jquery.slimscroll.min.js?version=20160829001'></script>"/>
<%--<!-- query弹出层插件-->--%>
<c:set var="layer_js" value="<script type='text/javascript' src='${ctx}/static/common/plugins/layer/layer.min.js?version=20160829001'></script>"/>
<%--<!--query网页自动加载进度条插件 -->--%>
<c:set var="pace_js" value="<script type='text/javascript' src='${ctx}/static/common/plugins/pace/pace.min.js?version=20160829001'></script>"/>
<%--<!-- 辛普自定义js 勿动！！！-->--%>
<c:set var="frame_js" value="<script type='text/javascript' src='${ctx}/static/common/js/frame.js?version=20160829001'></script>"/>

<%--<!--validate验证-->--%>
<c:set var="validate_css" value="<link href='${ctx}/static/common/plugins/jquery-validation/1.11.0/jquery.validate.min.css' rel='stylesheet'>"/>
<%--<!--validateCss-->--%>
<c:set var="validate_js" value="<script type='text/javascript' src='${ctx}/static/common/plugins/jquery-validation/1.11.0/jquery.validate.min.js'></script>"/>

<c:set var="my97_js" value="<script type='text/javascript' src='${ctx}/static/common/plugins/My97DatePicker/WdatePicker.js'></script>"/>
<c:set var="my97_css" value="<link href='${ctx}/static/common/plugins/My97DatePicker/skin/WdatePicker.css'rel='stylesheet'>"/>

<%--<!-- zTree树型插件 -->--%>
<c:set var="ztree_css" value="<link rel='stylesheet' href='${ctx}/static/common/plugins/zTree_v3-master/css/zTreeStyle/zTreeStyle.css'>"/>
<c:set var="ztree_js" value="<script style='javascript' src='${ctx}/static/common/plugins/zTree_v3-master/js/jquery.ztree.all.min.js'></script>"/>

<%--<!-- bootstrap table 基于bootstrap的表格组件 -->--%>
<c:set var="bootstrap_table_cs" value="<link rel='stylesheet' href='${ctx}/static/common/plugins/bootstrap-table-master/dist/bootstrap-table.css'>"/>
<c:set var="bootstrap_table_js" value="<script style='javascript' src='${ctx}/static/common/plugins/bootstrap-table-master/dist/bootstrap-table.js'></script>"/>
<c:set var="bootstrap_table_local_js" value="<script style='javascript' src='${ctx}/static/common/plugins/bootstrap-table-master/dist/locale/bootstrap-table-zh-CN.js'></script>" />

<%--<!--fullcalendar日历插件-->--%>
<c:set var="fullcalendar_css" value="<link rel='stylesheet' href='${ctx}/static/common/plugins/fullcalendar/css/fullcalendar.css'>"/>
<c:set var="fullcalendar_js" value="<script style='javascript' src='${ctx}/static/common/plugins/fullcalendar/js/fullcalendar.min.js'></script>"/>
<c:set var="fullcalendar_print_css" value="<link rel='stylesheet' href='${ctx}/static/common/plugins/fullcalendar/css/fullcalendar.print.css'>"/>
<c:set var="custom_min_js" value="<script style='javascript' src='${ctx}/static/common/plugins/fullcalendar/js/jquery-ui-1.10.2.custom.min.js'></script>"/>

<%--select2插件--%>
<c:set var="select2_css" value="<link rel='stylesheet' href='${ctx}/static/common/plugins/select2/css/select2.min.css'>"/>
<c:set var="select2_js" value="<script style='javascript' src='${ctx}/static/common/plugins/select2/js/select2.min.js'></script>"/>
