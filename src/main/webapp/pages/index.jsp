<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
</head>
<body>
	<h2>Report Application</h2>
	<hr>


	<form:form action="searchData" modelAttribute="search" method="POST">
		<table>


			<tr>
				<td>Plan Names</td>
				<td><form:select path="planName">
						<form:option value="">-Select-</form:option>
						<form:options items="${plans}" />
					</form:select></td>



				<td>Plan Status</td>
				<td><form:select path="planStatus">
						<form:option value="">-Select-</form:option>
						<form:options items="${status}" />

					</form:select></td>

				<td>Gender:</td>
				<td><form:select path="gender">
						<form:option value="">-Select-</form:option>
						<form:options items="${gender}" />
					</form:select></td>
			</tr>

			<tr>
				<td>Start Date:</td>
				<td><form:input path="planStartDate" /></td>


				<td>End Date:</td>
				<td><form:input path="planEndDate" /></td>
			</tr>


			<tr>
				<td></td>
				<td><input type="submit" value="Search" /></td>
			</tr>
		</table>
	</form:form>
	<hr />
	<table class="table table-striped">
		<thead>
			<tr>
				<td>ID</td>
				<td>Holder Name</td>
				<td>Plan Name</td>
				<td>Plan Status</td>
				<td>Start date</td>
				<td>End Date</td>
			</tr>

		</thead>
		<tbody>
			<c:forEach items="${plans1}" var="plan" varStatus="index">
				<tr>
					<td>${index.count}</td>
					<td>${plan.name}</td>
					<td>${plan.planName}</td>
					<td>${plan.planStatus}</td>
					<td>${plan.gender}</td>
				</tr>
			</c:forEach>
			<tr>
			<c:if test="${empty plans1}">
			<td>No record found</td>
			</c:if> 
			</tr>

		</tbody>


	</table>
	<hr>
	Export:
	<a href="excel">Excel</a>
	<a href="pdf">Pdf</a>
</body>
</html>
