<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %> <!-- Import List -->
<%@ page import="java.util.ArrayList" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>
	
	
	<% 
		String name = (String) request.getAttribute("name"); 
		Integer id = (Integer) request.getAttribute("id");
		List<String> friends = (List<String>) request.getAttribute("f");
	%>
	
	<h1>Hello <%= name %></h1>
	<h1>ID is <%= id %></h1>
	
	<% 
	for(String s: friends){
	%>
	
		<h3><%= s %></h3>
	
	<%
	} 
	%>
	
</body>
</html>


<!-- // http://localhost:8081/springmvc/about -->