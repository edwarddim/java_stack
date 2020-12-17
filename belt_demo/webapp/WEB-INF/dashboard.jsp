<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
	<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<h1>Events Dashboard</h1>
		<table class="table table-dark">
			<thead>
				<tr>
					<th>Name</th>
					<th>Date</th>
					<th>Location</th>
					<th>Host</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${ events}" var="event">
					<tr>
						<td>
							<a href="/events/${event.id }">${event.name}</a>
						</td>
						<td>${event.event_date }</td>
						<td>${event.city }, ${event.state } </td>
						<td>${event.host.first_name} </td>
					    <c:choose>
					    	<c:when test="${event.host.id == user_id  }">
   	       						<td>
									<a href="/events/${event.id}/edit ">Edit</a>
									<a href="/events/${event.id }/delete">Delete</a>
								</td>
					    	</c:when>
					    	<c:otherwise>
					    		<td>
					    			You're not the host
					    		</td>
					    	</c:otherwise>
					    </c:choose>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		
		
		<hr />
		<form:form action="/events/new" method="post" modelAttribute="event">
			<form:input path="host" value="${user_id }" type="hidden" />
			<p>
				Name:			
				<form:input type="text" path="name" />
				<form:errors path="name" />
			</p>
			<p>
				Event Date:			
				<form:input type="date" path="event_date" />
				<form:errors path="event_date" />
			</p>
			<p>
				City:			
				<form:input type="text" path="city" />
				<form:errors path="city" />
			</p>
			<p>
				State:
				<form:select path="state">
	    			<form:option value="ca">CA</form:option>
	    			<form:option value="wa">WA</form:option>
	    			<form:option value="or">OR</form:option>
	    			<form:option value="id">ID</form:option>
				</form:select>
				<form:errors path="state" />
			</p>
			<button type="submit">Create Event</button>
		</form:form>
	</div>

	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</body>
</html>