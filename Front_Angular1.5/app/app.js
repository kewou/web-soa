'use strict';

// Declare app level module which depends on views, and components
angular.module('myApp', [
  'accueilController',
  'etuController',
  'etuService',
  'ngRoute',   
  'restangular'
]).
config(['$locationProvider', '$routeProvider', 'RestangularProvider', function($locationProvider, $routeProvider, RestangularProvider) {
    RestangularProvider.addResponseInterceptor(function(data, operation, what, url, response, deferred) {
    if(response.status===200){
      console.log("Request ok");
    }else if(response.status===200){
      console.log("Request ko");
    }
    

    return data;
  });

  $locationProvider.hashPrefix('!');

    $routeProvider
      .when('/accueil', {
        controller: 'etuController as etuCtrl', 
        templateUrl: 'index.html'
      })    
      .when('/etudiants/:id', {
        controller: 'etuController', 
        templateUrl: 'views/etu.html'
      })
      .when('/etudiants/:id', {
        controller: 'etuController', 
        templateUrl: 'views/etu.html'
      })        
      .otherwise({
        redirectTo: '/'
      });
}]);


