'use strict';

/**
 * @ngdoc overview
 * @name frontEndApp
 * @description
 * # frontEndApp
 *
 * Main module of the application.
 */

 var app = angular.module("frontEndApp",[
    'etudiantController',
    'etudiantService',    
    'ngAnimate',
    'ngCookies',
    'ngResource',
    'ngRoute',
    'ngSanitize',
    'ngTouch'
  ]);

  app.config(function($routeProvider) {    

    $routeProvider
      .when('/lesEtudiants', {
        controller: 'etudiantController', 
        templateUrl: 'views/etudiants.html'
      })
      .otherwise({
        redirectTo: '/'
      });
  });




