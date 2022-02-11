<%--
  Created by IntelliJ IDEA.
  User: gijoongjang
  Date: 2022-02-08
  Time: 오후 2:28
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<html>
<head>
    <title>회원가입</title>
    <link rel="stylesheet" type="text/css" href="/resources/css/signup_style.css">
    <script src="http://code.jquery.com/jquery-3.5.1.min.js"></script>
    <script src="/resources/js/signup.js" type="text/javascript"></script>
</head>
<body>
<div class="container">
    <h1>회원가입</h1>
    <div class="form-group">
        <label for="id">아이디</label>
        <input type="text" class="form-control" id="id" name="id", placeholder="사용자 아이디">
    </div>
    <div class="form-group">
        <label for="password">비밀번호</label>
        <input type="password" class="form-control" id="password" name="password" placeholder="사용자 비밀번호">
    </div>
    <div class="form-group">
        <label for="name">이름</label>
        <input type="text" class="form-control" id="name" name="name" placeholder="사용자 이름">
    </div>
    <button id="signUpBtn" class="btn btn-primary">가입</button>
</div>
</body>
</html>
