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
<link rel="stylesheet" href="https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<link href="${contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
<script src="${contextPath}/resources/js/bootstrap.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>

<script type="text/javascript">
	var app = angular.module('app', []);

	app.controller('getController', function($scope, $http, $location) {

		$scope.currencyJson = {
			'timestamp' : 0,
			'base' : "",
			'rates' : {
				'EUR' : 0.0,
				'USD' : 0.0,
				'GBP' : 0.0,
				'NZD' : 0.0,
				'AUD' : 0.0,
				'JPY' : 0.0,
				'HUF' : 0.0,
				'INR' : 0.0
			}
		};
		$scope.getHistoricaldata = function() {
			$http({
				url : 'http://localhost:8080/getData',
				method : 'GET'
			}).then(function successCallback(response) {
				console.log(response.data);
				$scope.histCurrData = response.data;
				$scope.getHistDivAvailable = true;
			}, function errorCallback(response) {
				console.log(response);
			});

		}

		$scope.saveData = function() {
			$http({
				method : 'POST',
				url : 'http://localhost:8080/saveData',
				data : $scope.currencyJson,
				headers : {
					'Content-Type' : 'application/json; charset=utf-8'
				}
			}).then(function successCallback(response) {
				console.log(response.data);
			}, function errorCallback(response) {
				console.log(response);
			});

		}

		$scope.getCurrentRates = function() {

			$http({
				method : 'GET',
				url : 'http://openexchangerates.org/api/latest.json?app_id=f1ef152621a3428e885d0ceb265fe7ba'
			}).then(function successCallback(response) {
				console.log(response.data);
				$scope.getDivAvailable = true;
				$scope.currencyJson = response.data;
				$scope.currencyJson.timestamp = response.data.timestamp * 1000;
				$scope.saveData();
			}, function errorCallback(response) {
				console.log(response);
			});
		}

	});
</script>
</head>
<body>
	<div class="container" ng-app="app">

		<c:if test="${pageContext.request.userPrincipal.name != null}">
			<form id="logoutForm" method="POST" action="${contextPath}/logout">
				<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
			</form>

			<h2>
				Welcome ${pageContext.request.userPrincipal.name} | <a onclick="document.forms['logoutForm'].submit()">Logout</a>
			</h2>

		</c:if>

		<div class="row col-md-12">
			<div ng-controller="getController">
				<button ng-click="getCurrentRates()" type="button" class="btn btn-primary" style="margin: 10px 0px 10px 0px;">Get
					Current Data</button>
				<div style="background-color: #67597E; color: white; padding: 20px 20px 20px 20px" ng-if="getDivAvailable">
					Publish Date:{{currencyJson.timestamp | date:'dd/MMMM/yyyy'}}, {{"Rates Base: " + currencyJson.base}} </br> <strong>Current
						Currency Rates:-</strong> {{"USD : " + currencyJson.rates.USD + ", EUR : " + currencyJson.rates.EUR + ", GBP : "+
					currencyJson.rates.GBP + ", NZD : "+ currencyJson.rates.NZD+ ", AUD : "+ currencyJson.rates.AUD+ ", JPY : "+
					currencyJson.rates.JPY+ ", HUF : "+ currencyJson.rates.HUF+ ", INR : "+ currencyJson.rates.INR}}
				</div>
				</br> </br>
				<button ng-click="getHistoricaldata()" type="button" class="btn btn-primary" style="margin: 10px 0px 10px 0px;">Get
					Previous Data</button>
				<div style="background-color: #67597E; color: white; padding: 20px 20px 20px 20px" ng-if="getHistDivAvailable">
					<ul>
						<li ng-repeat="curr in histCurrData">Publish Date:{{curr.timestamp | date:'dd/MMMM/yyyy'}}, {{"Rates Base: "
							+ curr.base}} </br> <strong>Currency Rates:-</strong> {{"USD : " + curr.rates.USD + ", EUR : " +
							curr.rates.EUR + ", GBP : "+ curr.rates.GBP + ", NZD : "+ curr.rates.NZD+ ", AUD : "+ curr.rates.AUD+ ", JPY : "+
							curr.rates.JPY+ ", HUF : "+ curr.rates.HUF+ ", INR : "+ curr.rates.INR}}
						</li>
					</ul>
				</div>
			</div>
		</div>

	</div>



	<!-- /container -->

</body>
</html>
