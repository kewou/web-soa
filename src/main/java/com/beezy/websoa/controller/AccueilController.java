package com.beezy.websoa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.beezy.websoa.entities.Etudiant;
import com.beezy.websoa.services.EtudiantServices;

@RestController
@RequestMapping("/etudiants")
@CrossOrigin(origins = "*")
public class AccueilController {

	@Autowired
	private EtudiantServices etuService;

	@RequestMapping(method = RequestMethod.GET)
	public List<Etudiant> etudiants()  {
		return etuService.listEtudiant();
	}

	@RequestMapping(method = RequestMethod.POST)
	public List<Etudiant> addEtudiant(@RequestBody Etudiant e) throws Exception{
		this.etuService.addEtudiant(e);
		return etuService.listEtudiant();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Etudiant getEtudiant(@PathVariable("id") int id) throws Exception{
		return etuService.getEtudiantById(id);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public long deleteEtudiant(@PathVariable("id") int id) throws Exception{
		etuService.delete((long) id);
		return id;
	}
}
