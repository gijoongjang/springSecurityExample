<%--
  Created by IntelliJ IDEA.
  User: gijoongjang
  Date: 2022-02-11
  Time: 오전 11:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>main</title>
</head>
<body>
<h1>환영합니다!!!</h1>
<%
    String name = (String) session.getAttribute("name");
%>
<a href="#"><%=name%>님 환영합니다!</a>
</body>
</html>
