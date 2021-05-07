<%--
  Created by IntelliJ IDEA.
  User: CJJ
  Date: 2021/4/20
  Time: 19:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false"%>
<html>
<head>
    <title>Blog</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/bootstrap.min.css">
    <script src="${pageContext.request.contextPath}/static/js/jquery-3.5.1.min.js"></script>
    <script src="${pageContext.request.contextPath}/static/js/markdown-it.min.js"></script>
    <script src="${pageContext.request.contextPath}/static/js/popper.min.js"></script>
    <script src="${pageContext.request.contextPath}/static/js/bootstrap.min.js"></script>

    <script type="text/javascript">
        const md = window.markdownit();

        $(function () {
            $("#show-markdown").click(function () {
                const url="markdown/ssm"
                $.ajax({
                    url:url,
                    type:'GET',
                    data:{},
                    success:function(data){
                        $("#blog-content p").html(md.render(data))
                    }
                });
            })
        })
    </script>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <a class="navbar-brand" href="blog">BlogCJJ</a>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item">
                <a class="nav-link" href="#">Home</a>
            </li>
        </ul>
        <form class="form-inline">
            <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
            <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
        </form>
        <ul class="navbar-nav ml-auto">
            <li class="nav-item">
                <a class="nav-link" href="login">登录</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="register#">注册</a>
            </li>
        </ul>
    </div>
</nav>
<center>
    <button id="show-markdown" type="button" class="btn btn-primary">Show Markdown</button>
</center>
<div id="blog-content" class="jumbotron col-md-6 offset-md-3">
    <h1></h1>
    <p></p>
</div>

<div id="markdown-text" class="jumbotron">

</div>
</body>
</html>
