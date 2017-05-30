'use strict';
 
var etudiantService= angular.module('etudiantService',[])


etudiantService.service('etudiantService', function() {
    this.myFunc = function ($resource) {
        return $resource('http://localhost:8090/etudiants')
    }
});

