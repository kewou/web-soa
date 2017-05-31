'use strict';
 
var etudiantService= angular.module('etudiantService',[])


etudiantService.factory('etudiantService',[
	"$resource",
	 function($resource){
	 	return $resource("http://localhost:8090/etudiants", {},{
	 		query:{method: "GET", isArray: true},
	 		save: {method:'POST'},
	 		remove: {method:'DELETE'},
	 		get:    {method:'GET'}

	 	});
	 }
 
]);

