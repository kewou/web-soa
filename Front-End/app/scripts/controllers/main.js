'use strict';

/**
 * @ngdoc function
 * @name frontEndApp.controller:MainCtrl
 * @description
 * # MainCtrl
 * Controller of the frontEndApp
 */


var etudiantController = angular.module("etudiantController",[])

app.controller('MainCtrl', function($scope) {
  	$scope.name = "World";
    this.awesomeThings = [
      'HTML5 Boilerplate',
      'AngularJS',
      'Karma'
    ];   
  });


app.controller('etudiantCtrl', ['', function($scope,$resource){
	$scope.etudiants = Etudiant.query();
}])


