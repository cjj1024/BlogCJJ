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
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/bootstrap-4.5.3-dist/css/bootstrap.min.css">
<%--    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/highlight.js-10.7.2/src/styles/default.css">--%>
    <script src="${pageContext.request.contextPath}/static/js/jquery-3.5.1.min.js"></script>
<%--    <script src="${pageContext.request.contextPath}/static/js/marked.min.js"></script>--%>
    <script src="${pageContext.request.contextPath}/static/markdown-it-12.0.6/dist/markdown-it.min.js"></script>
<%--    <script src="${pageContext.request.contextPath}/static/highlight.js-10.7.2/src/highlight.js"></script>--%>
    <script src="${pageContext.request.contextPath}/static/js/popper.min.js"></script>
    <script src="${pageContext.request.contextPath}/static/bootstrap-4.5.3-dist/js/bootstrap.min.js"></script>

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
<center>
    <button id="show-markdown" type="button" class="btn btn-primary">Show Markdown</button>
</center>
<div id="blog-content" class="jumbotron">
    <h1></h1>
    <p></p>
</div>

<div id="markdown-text" class="jumbotron">

</div>
</body>
</html>
