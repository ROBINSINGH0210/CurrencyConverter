<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Create an account</title>

<link href="${contextPath}/resources/css/bootstrap.min.css"
	rel="stylesheet">
<link href="${contextPath}/resources/css/common.css" rel="stylesheet">
<link rel="stylesheet"
	href="https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.2.32/angular.min.js"></script>
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>

<script>
$.noConflict();
jQuery(document).ready(function ($) {
    $("#datepicker").datepicker({
		maxDate : -1500,
		minDate : new Date('1947-01-01'),
		dateFormat : 'yy-mm-dd',
		changeMonth : true,
		changeYear : true
	});
});
 
</script>
</head>

<body>

	<div class="container">

		<form:form method="POST" modelAttribute="userForm" class="form-signin">
			<h2 class="form-signin-heading">Create your account</h2>
			<spring:bind path="email">
				<div class="form-group ${status.error ? 'has-error' : ''}">
					<form:input type="email" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}$" path="email" class="form-control"
						placeholder="Email" autofocus="true" required="true"></form:input>
					<form:errors path="email"></form:errors>
				</div>
			</spring:bind>

			<spring:bind path="dob">
				<div class="form-group ${status.error ? 'has-error' : ''}">
					<form:input id="datepicker" type="text" path="dob"
						class="form-control" required="true"></form:input>
					<form:errors path="dob"></form:errors>
				</div>
			</spring:bind>

			<spring:bind path="password">
				<div class="form-group ${status.error ? 'has-error' : ''}">
					<form:input type="password" id="psw" class="form-control"
						name="psw" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{3,}"
						path="password"
						title="Must contain at least one number and one uppercase and lowercase letter."
						required="true"></form:input>
					<form:errors path="password"></form:errors>
				</div>
			</spring:bind>

			<button class="btn btn-lg btn-primary btn-block" type="submit">Submit</button>
		</form:form>

	</div>
	<!-- /container -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
	<script src="${contextPath}/resources/js/bootstrap.min.js"></script>
</body>
</html>
