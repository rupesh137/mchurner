/**
 * Mchurner angular app
 */

var myApp = angular.module('mchurnerApp',[]);

myApp.controller('signupController', ['$scope','$http', function($scope, $http) {
  $scope.saveUserDetails = function(user){
	  $http({
	        method : "POST",
	        url : "/mchurner/storeSignupDet",
	        dataType: "json",
			data : {		    
				userData : user,
			}
	    }).then(function mySuccess(response) {
	        $scope.message = response.data;
	    }, function myError(response) {
	    	console.log(response);
	        $scope.message = response.statusText;
	    });
  };
}]);