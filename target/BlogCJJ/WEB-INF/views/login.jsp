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
    <title>登录</title>
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

    })
  </script>
</head>
<body>
<div class="row justify-content-center">
  <div class="col-md-4 col-xs-4 jumbotron col-center-block">
    <h2 class="text-center">登录</h2>
    <div>
      <form action="login" method="POST">
        <div class="form-group">
          <label for="inputUsername" class="col-form-label">用户：</label>
          <input type="text" name="username" class="form-control" id="inputUsername">
        </div>

        <div class="form-group">
          <label for="inputPassword" class="col-form-label">密码：</label>
          <input type="password" name="password" class="form-control" id="inputPassword">
        </div>

        <button type="submit" class="btn btn-primary btn-block" id="btnSignIn">登录</button>
      </form>

    </div>
  </div>
</div>
</body>
</html>
