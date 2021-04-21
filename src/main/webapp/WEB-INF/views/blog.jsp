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
    <script src="${pageContext.request.contextPath}/static/js/marked.min.js"></script>
    <script src="${pageContext.request.contextPath}/static/js/jquery-3.5.1.min.js"></script>
    <script type="text/javascript">
        $(function () {
            $("#show-markdown").click(function () {
                var url="markdown/ssm"
                $.ajax({
                    url:url,
                    type:'GET',
                    data:{},
                    success:function(data){
                        $("#markdown-text").html(data)
                        $("#blog-content").html(marked(data))
                    }
                });

                // const xmlHttpRequest = new XMLHttpRequest()
                // xmlHttpRequest.onreadystatechange = function () {
                //     if (xmlHttpRequest.readyState == 4 && xmlHttpRequest.status == 200) {
                //         $("#blog-content").html(marked(xmlHttpRequest.responseXML))
                //         $("#markdown-text").html(xmlHttpRequest.responseXML)
                //     }
                // }
                //
                // xmlHttpRequest.open("GET", "markdown/ssm", true)
                // xmlHttpRequest.send()
            })
        })

    </script>
</head>
<body>
    <button id="show-markdown">Show Markdown</button>
    <div id="blog-content">

    </div>

    <div id="markdown-text">

    </div>
</body>
</html>
