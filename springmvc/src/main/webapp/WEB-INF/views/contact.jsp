<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page isELIgnored = "false" %>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" 
    integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
  </head>
  <body>
	
		<div class="container mt-5">
		
		<h3 class="text-center">${Header } </h3>
		<p> ${Desc } </p>
		
	<form action="/springmvc/processform" method="post">


		  <div class="mb-3">
		    <label for="exampleInputEmail1" class="form-label">Email address</label>
		    <input 
		    type="email" 
		    class="form-control" 
		    id="exampleInputEmail1" 
		    aria-describedby="emailHelp"
		    name = "email">
		  </div>
		  
		  <div class="mb-3">
		    <label for="userName" class="form-label">User Name </label>
		    <input 
		    type="text" 
		    class="form-control" 
		    id="userName"
		    aria-describedby="emailHelp"
		    name="userName">
		    
		  </div>
		  
		  <div class="mb-3">
		    <label for="userPassword" class="form-label">User Password</label>
		    <input 
		    type="password" 
		    class="form-control" 
		    id="userPassword" 
		    aria-describedby="emailHelp"
		    name="password">
		  </div>
		  	
		  	
		  	<div class="container text-center">
		  	
		  		<button type="submit">Sign Up</button>
		  	</div>
		  
			</form>
		</div>
	
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" 
    integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
  </body>
</html>