'use strict';

/**
 * @ngdoc function
 * @name frontEndApp.controller:MainCtrl
 * @description
 * # MainCtrl
 * Controller of the frontEndApp
 */


var etudiantController = angular.module("etudiantController",[])

etudiantController.controller('etudiantController', function($scope,etudiantService) {
  	$scope.name = "World";
 
});

