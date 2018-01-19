<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!--[if lt IE 7 ]><html xmlns:th="http://www.thymeleaf.org" lang="en" class="no-js ie6"> <![endif]-->
<!--[if IE 7 ]><html xmlns:th="http://www.thymeleaf.org" lang="en" class="no-js ie7"> <![endif]-->
<!--[if IE 8 ]><html xmlns:th="http://www.thymeleaf.org" lang="en" class="no-js ie8"> <![endif]-->
<!--[if IE 9 ]><html xmlns:th="http://www.thymeleaf.org" lang="en" class="no-js ie9"> <![endif]-->
<!--[if (gt IE 9)|!(IE)]><!--><html xmlns:th="http://www.thymeleaf.org" lang="en" class="no-js" > <!--<![endif]-->
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="author" content="xuwc" />
    <meta name="keywords" content="spring boot" />
    <meta name="viewport" content="width=device-width,initial-scale=1" />
    <title></title>

    <!-- main JS libs -->
    <script src="../../../static/vanilla-cream-css/js/libs/modernizr.min.js" th:src="@{/vanilla-cream-css/js/libs/modernizr.min.js}"></script>
    <script src="../static/vanilla-cream-css/js/libs/jquery-1.10.0.js" th:src="@{/vanilla-cream-css/js/libs/jquery-1.10.0.js}"></script>
    <script src="../static/vanilla-cream-css/js/libs/jquery-ui.min.js" th:src="@{/vanilla-cream-css/js/libs/jquery-ui.min.js}"></script>
    <script src="../static/vanilla-cream-css/js/libs/bootstrap.min.js" th:src="@{/vanilla-cream-css/js/libs/bootstrap.min.js}"></script>

    <!-- Style CSS -->
    <link rel="stylesheet" href="../static/vanilla-cream-css/css/bootstrap.css" th:href="@{/vanilla-cream-css/css/bootstrap.css}" />
    <link rel="stylesheet" href="../static/vanilla-cream-css/style.css"  th:href="@{/vanilla-cream-css/style.css}"  />
    <!-- scripts -->
    <script src="../static/vanilla-cream-css/js/general.js" th:src="@{/vanilla-cream-css/js/general.js}"></script>

    <!-- Include all needed stylesheets and scripts here -->

    <!--[if lt IE 9]><script src="../static/vanilla-cream-css/js/respond.min.js" th:src="@{/vanilla-cream-css/js/respond.min.js}"></script><![endif]-->
    <!--[if gte IE 9]>
    <style type="text/css">
        .gradient {filter: none !important;}
    </style>
    <![endif]-->
</head>

<body style="background-image: none;">
<div class="body_wrap">
    <div class="container">
        <div class="alert alert-success text-center" role="alert">Sptring Boot学习</div>
        <table class="table table-striped table-bordered">
            <tr>
                <td>标题</td>
                <td>内容</td>
                <td>操作</td>
            </tr>
            <!--/*@thymesVar id="learnList" type=""*/-->
            <tr th:each="article : ${articleList}" class="text-info">
                <td th:text="${article.title}">文章标题</td>
                <td th:text="${article.content}">文章内容</td>
                <td>
                    <a href="#" th:href="@{http://www.baidu.com}" class="btn btn-search btn-green" target="_blank"><span>点我</span></a>
                    <a href="#" th:href="@{http://www.baidu.com}" class="btn btn-search btn-acute" target="_blank"><span>添加</span></a>
                    <a href="#" th:href="@{http://www.baidu.com}" class="btn btn-search btn-green" target="_blank"><span>编辑</span></a>
                    <a href="#" th:href="@{http://www.baidu.com}" class="btn btn-search btn-acute" target="_blank"><span>删除</span></a>
                </td>
            </tr>
        </table>
    </div>
    <!--/ container -->
</div>
</body>
</html>