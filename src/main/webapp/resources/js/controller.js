$.noConflict();
jQuery(document).ready(function($) {
	$("#datepicker").datepicker({
		maxDate : -1,
		minDate : new Date('2002-01-01'),
		dateFormat : 'yy-mm-dd',
		changeMonth : true,
		changeYear : true
	});

	$("#datepicker").keypress(function(event) {
		event.preventDefault();
	});
});
var app = angular.module('app', []);

app.controller('getController', function($scope, $http, $location, $window) {

	$scope.histdate;
	$scope.currencyJson = {};
	$scope.histCurrencyJson = {};
	$scope.getHistoricaldata = function() {
		$http({
			url : 'http://localhost:8080/getData',
			method : 'GET'
		}).then(function successCallback(response) {
			$scope.histCurrData = response.data;
			if ($scope.histCurrData.toString().match("login")) {
				document.forms['logoutForm'].submit();
			}
			$scope.getHistDivAvailable = true;
		}, function errorCallback(response) {
			console.log(response);
		});

	}

	$scope.saveData = function(saveData) {
		$http({
			method : 'POST',
			url : 'http://localhost:8080/saveData',
			data : saveData,
			headers : {
				'Content-Type' : 'application/json; charset=utf-8'
			}
		}).then(function successCallback(response) {
			if (response.data.toString().match("login")) {
				document.forms['logoutForm'].submit();
			}
		}, function errorCallback(response) {
			console.log(response);
		});

	}

	$scope.getCurrentRates = function() {

		$http({
			method : 'GET',
			url : 'http://openexchangerates.org/api/latest.json?app_id=f1ef152621a3428e885d0ceb265fe7ba'
		}).then(function successCallback(response) {
			$scope.getDivAvailable = true;
			$scope.currencyJson = response.data;
			$scope.currencyJson.timestamp = response.data.timestamp * 1000;
			$scope.saveData($scope.currencyJson);
		}, function errorCallback(response) {
			console.log(response);
		});
	}

	$scope.getHistoricRates = function() {
		$http(
				{
					method : 'GET',
					url : 'https://openexchangerates.org/api/historical/' + $scope.histdate
							+ '.json?app_id=f1ef152621a3428e885d0ceb265fe7ba'
				}).then(function successCallback(response) {
			console.log(response.data);
			$scope.getHistDateDivAvailable = true;
			$scope.histCurrencyJson = response.data;
			$scope.histCurrencyJson.timestamp = response.data.timestamp * 1000;
			$scope.saveData($scope.histCurrencyJson);
		}, function errorCallback(response) {
			console.log(response);
		});
	}

});