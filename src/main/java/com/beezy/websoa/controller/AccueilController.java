package com.beezy.websoa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.beezy.websoa.data.entities.Etudiant;
import com.beezy.websoa.services.EtudiantServices;

@RestController
@RequestMapping("/etudiants")
@CrossOrigin(origins = "*")
public class AccueilController {

	@Autowired
	private EtudiantServices etuService;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Etudiant>> etudiants()  throws Exception{
		return new ResponseEntity<List<Etudiant>>(etuService.listEtudiant(), HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.POST)
	public Etudiant addEtudiant(@RequestBody Etudiant e) throws Exception{
		this.etuService.addEtudiant(e);
		return e;
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public Etudiant updateEtudiant(@RequestBody Etudiant e) throws Exception{
		this.etuService.updateEtudiant(e);
		return e;
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Etudiant> getEtudiant(@PathVariable("id") int id) throws Exception{
		return new ResponseEntity<Etudiant>(etuService.getEtudiantById((long) id), HttpStatus.OK);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public long deleteEtudiant(@PathVariable("id") int id) throws Exception{
		etuService.delete((long) id);
		return id;
	}
}
