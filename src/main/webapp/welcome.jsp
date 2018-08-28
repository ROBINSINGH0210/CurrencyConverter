<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<meta name="description" content="">
<meta name="author" content="">
<title>Currency Rates</title>
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
<link rel="stylesheet" href="https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<link href="${contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
<script src="${contextPath}/resources/js/bootstrap.min.js"></script>
<script src="${contextPath}/resources/js/controller.js"></script>
</head>
<body>
	<div class="container" ng-app="app">
		<c:if test="${pageContext.request.userPrincipal.name != null}">
			<form id="logoutForm" method="POST" action="${contextPath}/logout">
				<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
			</form>
			<h2>
				Welcome ${pageContext.request.userPrincipal.name} | <button type="button" class="btn btn-primary" style="margin: 10px 0px 10px 0px;" onclick="document.forms['logoutForm'].submit()">Logout</button>
			</h2>
		</c:if>
		<div class="row col-md-12">
			<div ng-controller="getController">
				<button ng-click="getCurrentRates()" type="button" class="btn btn-primary" style="margin: 10px 0px 10px 0px;">Get
					Current Rates</button>
				<div style="background-color: #67597E; color: white; padding: 20px 20px 20px 20px" ng-if="getDivAvailable">
					<strong>Publish Date:</strong>{{currencyJson.timestamp | date:'dd/MMMM/yyyy'}}, {{"Rates Base: " +
					currencyJson.base}} </br> <strong>Current Currency Rates:-</strong> {{"USD : " + currencyJson.rates.USD + ", EUR : " +
					currencyJson.rates.EUR + ", GBP : "+ currencyJson.rates.GBP + ", NZD : "+ currencyJson.rates.NZD+ ", AUD : "+
					currencyJson.rates.AUD+ ", JPY : "+ currencyJson.rates.JPY+ ", HUF : "+ currencyJson.rates.HUF+ ", INR : "+
					currencyJson.rates.INR}}
				</div>
				</br> </br> <input id="datepicker" type="text" class="form-control" ng-model="histdate" placeholder="Historic Date"
					required="true"></input>
				<button ng-click="getHistoricRates()" type="button" class="btn btn-primary" ng-disabled="!histdate" style="margin: 10px 0px 10px 0px;">Get
					Historical Rates</button>
				<div style="background-color: #67597E; color: white; padding: 20px 20px 20px 20px" ng-if="getHistDateDivAvailable">
					<strong>Publish Date:</strong>{{histCurrencyJson.timestamp | date:'dd/MMMM/yyyy'}}, {{"Rates Base: " +
					histCurrencyJson.base}} </br> <strong>Currency Rates:-</strong> {{"USD : " + histCurrencyJson.rates.USD + ", EUR : " +
					histCurrencyJson.rates.EUR + ", GBP : "+ histCurrencyJson.rates.GBP + ", NZD : "+ histCurrencyJson.rates.NZD+ ",
					AUD : "+ histCurrencyJson.rates.AUD+ ", JPY : "+ histCurrencyJson.rates.JPY+ ", HUF : "+
					histCurrencyJson.rates.HUF+ ", INR : "+ histCurrencyJson.rates.INR}}
				</div>
				</br> </br>
				<button ng-click="getHistoricaldata()" type="button" class="btn btn-primary" style="margin: 10px 0px 10px 0px;">Get
					Previous Data</button>
				<div style="background-color: #67597E; color: white; padding: 20px 20px 20px 20px" ng-if="getHistDivAvailable">
					<ul>
						<li ng-repeat="curr in histCurrData"><strong>Publish Date:</strong> {{curr.timestamp | date:'dd/MMMM/yyyy'}},
							{{"Rates Base: " + curr.base}} </br> <strong>Currency Rates:-</strong> {{"USD : " + curr.rates.USD + ", EUR : " +
							curr.rates.EUR + ", GBP : "+ curr.rates.GBP + ", NZD : "+ curr.rates.NZD+ ", AUD : "+ curr.rates.AUD+ ", JPY : "+
							curr.rates.JPY+ ", HUF : "+ curr.rates.HUF+ ", INR : "+ curr.rates.INR}}</li>
					</ul>
				</div>
			</div>
		</div>
	</div>
	<!-- /container -->
</body>
</html>
