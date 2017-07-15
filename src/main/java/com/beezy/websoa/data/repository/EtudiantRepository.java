package com.beezy.websoa.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.beezy.websoa.data.entities.Etudiant;

@Repository
public interface EtudiantRepository extends  CrudRepository<Etudiant, Long>{
	
}
