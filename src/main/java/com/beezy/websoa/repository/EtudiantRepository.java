package com.beezy.websoa.repository;

import org.springframework.data.repository.CrudRepository;

import com.beezy.websoa.entities.Etudiant;


public interface EtudiantRepository extends  CrudRepository<Etudiant, Long>{
	
	Etudiant findById(Long id);
	//Etudiant findByUsername(String username);
	
	

}
