
var crudEtu = crudEtu || {};


// Création de l'application : [ Les différents modules à charger ]
crudEtu.app = angular.module("monAppli",["ngRoute","jenevamodule"]);

crudEtu.app.config(function ($routeProvider){
	$routeProvider
		.when("/etudiant/list",{
			templateUrl: "etudiant/list",
			controller: "etudiantListController"				
		})
		.otherwise({
			templateUrl: "home/notfound"
		});
});

$jeneva.baseUrl = "/api";