<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<!-- CSS only -->
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<h1>Hello World</h1>
		<form action="/results" method="POST">
			<p>
				Full Name:
				<input type="text" name="full_name" id="" />
			</p>
			<p>
				Email:
				<input type="email" name="email" id="" />				
			</p>
			<p>
				<select name="fav_language" id="">
					<option value="py">Python</option>
					<option value="js">JavaScript</option>
					<option value="java">Java</option>
				</select>
			</p>
			<p>
				Comments:
				<textarea name="comments" id="" cols="30" rows="5"></textarea>
			</p>
			<button class="btn btn-primary">Send</button>
		</form>
	</div>
</body>
</html>