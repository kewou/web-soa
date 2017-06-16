'use strict';

/**
 * @ngdoc function
 * @name frontEndApp.controller:MainCtrl
 * @description
 * # MainCtrl
 * Controller of the frontEndApp
 */


var etuController = angular.module("etuController",[])

etuController.controller('etuController', ['etuService',function(etuService) {

    var etuC= this;
    etuC.etudiant= {"nom":"","prenom":"","dateNaissance":"","username":"","pass":""};
    etuC.etudiants = [];

    etuC.listItem= function(){      
      etuService.getEtudiants().then(function(data){
      etuC.etudiants=data;
      });
    }

    etuC.listItem();

    etuC.showItem= function(id){
      etuService.getEtudiant(id).then(function(data){        
        etuC.etudiant=data;
      });
    }

    etuC.editItem= function(id){    
      etuService.updateEtudiant().then(function(data){
        etuC.etudiant=data;
      });
    }



    etuC.addItem= function() { 
        etuService.addEtudiant(etuC.etudiant).then(function(data){          
          console.log("Object saved OK");
          etuC.etudiants=etuC.listItem();          
        }, function(data,status,param) {
          console.log("There was an error saving");          
        });             
    }

    etuC.deleteItem= function(id) {        
       etuService.deleteEtudiant(id).then(function(data){
       etuC.etudiants=etuC.listItem();       
       console.log("Object deleted OK");
        }, function() {
          console.log("There was an error deleting");
        });

    }

}]);

