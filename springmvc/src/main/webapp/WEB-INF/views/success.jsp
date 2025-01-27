<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page isELIgnored ="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <h1>${Header }</h1>
    <h1>${Desc }</h1>
    <hr>
    <h1 style="color : green">${msg } </h1>
    <h1>Email ${user.email }</h1>
    <h1>Welcome, ${user.userName }</h1>  <!-- Corrected property name -->
    <h1>Password ${user.password } </h1>
    
    
</body>
</html>
