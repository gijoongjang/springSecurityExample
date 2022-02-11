<%--
  Created by IntelliJ IDEA.
  User: gijoongjang
  Date: 2022-02-09
  Time: 오후 4:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<html>
<head>
    <title>로그인</title>
</head>
<body>
<div class="container">
    <h1>로그인</h1>
        <form action="/login_process" method="post">
            <div class="form-group">
                <label for="id">아이디</label>
                <input type="text" name="username" id="id" class="form-control" placeholder="아이디 입력해주세요">
            </div>
            <div class="form-group">
                <label for="password">비밀번호</label>
                <input type="password" class="form-control" id="password" name="password" placeholder="비밀번호 입력해주세요">
            </div>
            <button type="submit" class="btn btn-primary">로그인</button>
            <button type="button" class="btn btn-primary" onClick="location.href='signUp'">회원가입</button>
        </form>
    <br/>
</div>
</body>
</html>
