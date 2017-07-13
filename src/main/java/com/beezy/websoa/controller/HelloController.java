package com.beezy.websoa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.beezy.websoa.dto.EtudiantDTO;
import com.beezy.websoa.services.EtudiantServices;

@RestController
@CrossOrigin("*")
public class HelloController {
	
	@Autowired
	EtudiantServices etudiantService;
	
	@RequestMapping("/hello/{nom}")
	public EtudiantDTO afficheEtudiant(@PathVariable String nom){
		EtudiantDTO etud= new EtudiantDTO();
		etud.setNom(nom);
		return etud;
	}

}
