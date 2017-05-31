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
 	$scope.etudiants = etudiantService.query(); 
	$scope.addItem = function(){
 		var etudiant = {nom:$scope.etudiant.nom,
 						prenom: $scope.etudiant.prenom};

 		etudiantService.create(etudiant,function(data) {

 		});

 	};
});

