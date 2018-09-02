<%@ taglib
	prefix="spring"
	uri="http://www.springframework.org/tags"%>
<%@ taglib
	prefix="c"
	uri="http://java.sun.com/jsp/jstl/core"%>
<c:set
	var="contextPath"
	value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta
	http-equiv="X-UA-Compatible"
	content="IE=edge">
<meta
	name="viewport"
	content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<meta
	name="description"
	content="">
<meta
	name="author"
	content="">
<title>Currency Rates</title>
<link
	href="${contextPath}/resources/css/bootstrap.min.css"
	rel="stylesheet">
<script src="${contextPath}/resources/js/jquery-3.3.1.min.js"></script>
<script src="${contextPath}/resources/js/jquery-ui.js"></script>
<script src="${contextPath}/resources/js/angular.min.js"></script>
<link
	rel="stylesheet"
	href="${contextPath}/resources/css/jquery-ui.css">
<link
	href="${contextPath}/resources/css/bootstrap.min.css"
	rel="stylesheet">
<script src="${contextPath}/resources/js/bootstrap.min.js"></script>
<script src="${contextPath}/resources/js/controller.js"></script>
</head>
<body>
	<div
		class="container"
		ng-app="app">
		<c:if test="${pageContext.request.userPrincipal.name != null}">
			<form
				id="logoutForm"
				method="POST"
				action="${contextPath}/logout">
				<input
					type="hidden"
					name="${_csrf.parameterName}"
					value="${_csrf.token}" />
			</form>
			<h2>
				Welcome ${pageContext.request.userPrincipal.name} |
				<button
					type="button"
					class="btn btn-primary"
					style="margin: 10px 0px 10px 0px;"
					onclick="document.forms['logoutForm'].submit()">Logout</button>
			</h2>
		</c:if>
		<div class="row col-md-12">
			<div ng-controller="getController">
				</br> <strong>From: </strong> <select
					ng-model="from"
					ng-options="x for x in currNames"
					placeholder="From"
					required="true">
				</select> <strong>To: </strong><select
					ng-model="to"
					ng-options="x for x in currNames"
					placeholder="From"
					ng-disabled="!from"
					required="true">
				</select> <strong>Amount:</strong> <input
					type="number"
					ng-model="amt"
					ng-disabled="!to"
					required="true"> </input> <input
					id="datepicker"
					type="text"
					ng-model="histdate"
					ng-disabled="!amt"
					placeholder="Historic Date"
					required="true"></input>
				<button
					ng-click="getHistoricRates()"
					type="button"
					class="btn btn-primary"
					ng-disabled="!histdate"
					style="margin: 10px 0px 10px 0px;">Get Historical Rates</button>
				<div
					style="background-color: #67597E; color: white; padding: 20px 20px 20px 20px"
					ng-if="getHistDateDivAvailable">
					<strong>Publish Date:</strong>{{histCurrencyJson.date}} <br /> {{" From: " + histCurrencyJson.query.from + " To: "
					+ histCurrencyJson.query.to + " Amount: " +histCurrencyJson.query.amount + " Quote: "+ histCurrencyJson.info.quote
					+ " Result: " +histCurrencyJson.result}}
				</div>
				</br> </br>
				<button
					ng-click="getHistoricaldata()"
					type="button"
					class="btn btn-primary"
					style="margin: 10px 0px 10px 0px;">Get Previous Data</button>
				<div
					style="background-color: #67597E; color: white; padding: 20px 20px 20px 20px"
					ng-if="getHistDivAvailable">
					<ul>
						<li ng-repeat="curr in histCurrData"><strong>Publish Date:</strong>{{curr.date}} <br /> {{" From: " +
							curr.query.from + " To: " + curr.query.to + " Amount: " +curr.query.amount + " Quote: "+ curr.info.quote + "
							Result: " +curr.result}}
					</ul>
				</div>
			</div>
		</div>
	</div>
	<!-- /container -->
</body>
</html>
