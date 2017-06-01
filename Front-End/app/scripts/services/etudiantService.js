'use strict';
 
var etudiantService= angular.module('etudiantService',[])



etudiantService.factory('etudiantService',[
	"$resource",
	 function($resource){
	 	var URI = "http://localhost:8090/";
	 	return $resource(URI+"lesEtudiants/:id",{
	 		query:{method: "GET", isArray: true},
	 		save: {method: 'POST', url: URI+"etudiant/ajouter"},
	 		remove:{method:'DELETE'},
	 		get:{method:'GET',url:URI+"lesEtudiants/:id",params:{ id:'@id'}}
	 	});
	 }
]);

