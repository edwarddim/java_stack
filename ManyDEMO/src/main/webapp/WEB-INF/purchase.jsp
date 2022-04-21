<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<form action="/purchases/new" method="post">
			<select name="item_id" id="">
				<c:forEach var="item" items="${items }">
					<option value="${item.id }">
						<c:out value="${item.name }" />
					</option>
				</c:forEach>
			</select>
			<select name="user_id" id="">
				<c:forEach var="user" items="${users }">
					<option value="${user.id }">
						<c:out value="${user.first_name }" />
						<c:out value="${user.last_name }" />
					</option>
				</c:forEach>
			</select>
			<button>Create</button>
		</form>
	</div>
</body>
</html>