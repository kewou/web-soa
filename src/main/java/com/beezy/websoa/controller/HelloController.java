package com.beezy.websoa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.beezy.websoa.entities.Etudiant;
import com.beezy.websoa.services.EtudiantServices;

@RestController
public class HelloController {
	
	@Autowired
	EtudiantServices etudiantService;
	
	@RequestMapping("/hello/{nom}")
	public Etudiant afficheEtudiant(@PathVariable String nom){
		Etudiant etud= new Etudiant();
		etud.setNom(nom);
		return etud;
	}
	
	
    @RequestMapping(value = "/etudiants", method = RequestMethod.GET)
    public String listetudiants(Model model) {
        model.addAttribute("etudiant", new Etudiant());
        model.addAttribute("listetudiants", this.etudiantService.listEtudiant());        
        return "etudiants";
    }	
	
}
