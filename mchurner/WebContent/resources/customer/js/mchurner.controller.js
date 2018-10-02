/**
 * Mchurner angular app
 */

var myApp = angular.module('mchurnerApp',[]);
myApp.constant('apiBase','/mchurner');
myApp.controller('signupController', ['$scope','$http','$window', function($scope, $http,$window) {
  $scope.saveUserDetails = function(user){
	  alert("dddd");
	 /* $http({
	        method : "POST",
	        url : "/storeSignupDet",
	        dataType: "json",
			data : {		    
				userData : user,
			}
	    }).then(function mySuccess(response) {
	        $scope.message = response.data;
	    }, function myError(response) {
	    	console.log(response);
	        $scope.message = response.statusText;
	    });*/
	  
	  var ctxURL = angular.element("#ctxURL").text();
	  alert(ctxURL);
	  $window.location.href = ctxURL+"/pages/user_details";
  };
  
}]);


myApp.controller('loginController', ['$scope','$http', '$window', function($scope, $http, $window) { 
	  $scope.goLogin = function() {		  
		  var ctxURL = angular.element("#ctxURL").text();
		  $window.location.href = ctxURL+"/pages/loginHome";
	  };
}]);


myApp.controller('transactionController', ['$scope','$http', '$window','apiBase', function($scope, $http, $window,apiBase) { 
	$scope.shareData = [];
	$scope.FDData = [];
	angular.element(document).ready(function () {
		$scope.getShareDetails("1");
		$scope.getFDDetails("1");
  	}); 
	
	
	$scope.getShareDetails = function(custId) {		  
		  $http({
				url: apiBase+'/getShareDetails/'+custId,
				method:'GET',
				headers :{
					'Content-Type':'application/json'
				},
				data : {}
				}).then(function mySucces(response) {
					$("#adminMsg").removeClass().html("");
					$scope.shareData = angular.isDefined(response.data) ? response.data : [];
					
				},function myError(response){
					$("#adminMsg").removeClass().addClass("error").html("Something Went Wrong");
					$scope.allowAjaxCall = true;
					console.log(response);
				}); 
	  };
	  
		$scope.getFDDetails = function(custId) {		  
			  $http({
					url: apiBase+'/getFDDetails/'+custId,
					method:'GET',
					headers :{
						'Content-Type':'application/json'
					},
					data : {}
					}).then(function mySucces(response) {
						$("#adminMsg").removeClass().html("");
						$scope.FDData = angular.isDefined(response.data) ? response.data : [];
						
					},function myError(response){
						$("#adminMsg").removeClass().addClass("error").html("Something Went Wrong");
						$scope.allowAjaxCall = true;
						console.log(response);
					}); 
		  };
}]);
















