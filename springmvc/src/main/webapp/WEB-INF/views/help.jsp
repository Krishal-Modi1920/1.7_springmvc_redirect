<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.time.LocalDateTime" %>
<%-- <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> --%> <!-- Correct the JSTL taglib declaration -->

<%@page isELIgnored="false" %>		<!-- For using ${EXPRESSION} -->




<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Help Page</title>
</head>
<body>
	
	<%-- <% String name = (String)request.getAttribute("name");
		Integer rollnumber = (Integer)request.getAttribute("rollnumber");
		LocalDateTime time = (LocalDateTime)request.getAttribute("time");
	%> --%>

	<h1>Hello my name is ${name } <%-- <%= name %> --%></h1>
	<h2>This is help Page</h2>
	<h3>Roll Number is : ${rollnumber } <%-- <%= rollnumber %> --%></h3>
	<h4>Date and Time is ${time } <%-- <%= time.toString() %> --%></h4>
	
	<hr>
	
<%-- 	<c:forEach var="item" items="${marks}">
        <h1>${item}</h1> <!-- Display each item from 'marks' -->
        <c:out value="${item}"></c:out>
    </c:forEach> --%>
	
	
</body>
</html>