'use strict';
 
var etuService= angular.module('etuService',[])

etuService.factory('etuService', ['Restangular', function(Restangular){
	Restangular.setBaseUrl('http://localhost:8090/');

	var service = {getEtudiants:getEtudiants, getEtudiant:getEtudiant, addEtudiant:addEtudiant, deleteEtudiant:deleteEtudiant, updateEtudiant:updateEtudiant};	
	var ressource = Restangular.all('etudiants');

    function updateEtudiant(id){
        return ressource.one('',id).save();
    }

    function getEtudiants(){
        return ressource.getList();
    }

    function getEtudiant(id){    	    	
    	return ressource.get(id);
    }

    function addEtudiant(etudiant){    	
    	return ressource.post(etudiant);    	
    }

    function deleteEtudiant(id){    	
    	return ressource.one('',id).remove();    	  
    }

    return service;
}]);


