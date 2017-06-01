package com.beezy.websoa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.beezy.websoa.entities.Etudiant;
import com.beezy.websoa.services.EtudiantServices;

@RestController
@CrossOrigin(origins = "*")
public class AccueilController {
	
	@Autowired
	EtudiantServices etuService;
	
	@RequestMapping("/")
	public String index(){
		return "Yeah Spring Boot !";
	}
	
    @RequestMapping(value="/accueil",method = RequestMethod.GET)
    public String accueil() {
        return "accueil";
    }
    
    @RequestMapping(value="/lesEtudiants",method = RequestMethod.GET)
    public List<Etudiant> etudiants() {
        return etuService.listEtudiant();
    }
    
    @RequestMapping(value="/lesEtudiants/{id}",method = RequestMethod.GET)
    public Etudiant getEtudiant(@PathVariable("id") int id) {
        return etuService.getEtudiantById(id);
    }
    
    @RequestMapping(value="/etudiants/delete/{id}",method = RequestMethod.GET)
    public void deleteEtudiant(@PathVariable("id") int id) {
        etuService.delete( (long) id);
    }
    
    @RequestMapping(value = "/etudiant/ajouter", method = RequestMethod.POST)
    public String addEtudiant(@ModelAttribute("etudiant") Etudiant e) {
    	this.etuService.addEtudiant(e);
        return "redirect:/etudiants";

    }
    
}
