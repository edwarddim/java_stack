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
		<h1>Create Dish</h1>
		<form:form method="POST" action="/dish/new" modelAttribute="dishObj" >
			<p>
				Name:
				<form:input type="text" path="name"/>
				<form:errors path="name" />
			</p>
			<p>
				Calories:
				<form:input type="number" path="calories"/>
				<form:errors path="calories" />
			</p>
			<p>
				Chef:
				<form:select path="creator">
					<c:forEach var="chef" items="${allChefs}">
						<form:option value="${chef.id}">
							<c:out value="${chef.fullName}" />
						</form:option>
					</c:forEach>
				</form:select>
			</p>
			<button>Create</button>
		</form:form>
		
	</div>
</body>
</html>