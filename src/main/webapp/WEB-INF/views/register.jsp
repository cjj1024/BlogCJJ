<%--
  Created by IntelliJ IDEA.
  User: CJJ
  Date: 2021/4/28
  Time: 19:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false"%>
<html>
<head>
    <title>注册</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/bootstrap.min.css">
    <script src="${pageContext.request.contextPath}/static/js/jquery-3.5.1.min.js"></script>
    <script src="${pageContext.request.contextPath}/static/js/popper.min.js"></script>
    <script src="${pageContext.request.contextPath}/static/js/bootstrap.min.js"></script>
    <style type="text/css">
        .col-center-block {
            position: absolute;
            top: 50%;
            -webkit-transform: translateY(-50%);
            -moz-transform: translateY(-50%);
            -ms-transform: translateY(-50%);
            -o-transform: translateY(-50%);
            transform: translateY(-50%);
        }
    </style>

    <script type="text/javascript">
        $(function () {
            $("#inputUsername").change(function () {
                const username = $("#inputUsername").val()
                $.ajax({
                    url: "checkUsername/" + username,
                    type: "GET",
                    success: function (message) {
                        console.log(message)
                        $("#usernameMessage").html(message.message)
                    }
                })
            })
        })
    </script>
</head>
<body>
<div class="row justify-content-center">
    <div class="col-md-4 col-xs-4 jumbotron col-center-block">
        <h2 class="text-center">注册</h2>
        <div>
            <form action="register" method="POST">
                <div class="form-group">
                    <label for="inputUsername" class="col-form-label">用户：</label>
                    <input type="text" name="username" class="form-control" id="inputUsername">
                </div>
                <p id="usernameMessage"></p>

                <div class="form-group">
                    <label for="inputPassword" class="col-form-label">密码：</label>
                    <input type="password" name="password" class="form-control" id="inputPassword">
                </div>

                <button type="submit" class="btn btn-primary btn-block" id="btnSignIn">注册</button>
            </form>

        </div>
    </div>
</div>
</body>
</html>
