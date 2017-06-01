'use strict';

/**
 * @ngdoc function
 * @name frontEndApp.controller:MainCtrl
 * @description
 * # MainCtrl
 * Controller of the frontEndApp
 */


var etudiantController = angular.module("etudiantController",[])

etudiantController.controller('etudiantController', function($scope,$routeParams,etudiantService) {
  	$scope.name = "World";
 	$scope.etudiants = etudiantService.query();
 	$scope.etudiant = etudiantService.get({ id:$routeParams.id });
 	

 	$scope.addItem= function(nom,prenom,dateNaissance,username,pass) {
    	var etudiant= {};    
      	etudiant.nom = nom;
      	etudiant.prenom = prenom;
      	etudiant.dateNaissance = dateNaissance;
      	etudiant.username=username;
      	etudiant.pass=pass;
        etudiantService.save(etudiant);
        $scope.etudiants.push(etudiant);
    }
});
