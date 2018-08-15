/**
 * Mchurner angular app
 */

var myApp = angular.module('mchurnerApp',[]);

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