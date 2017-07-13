package com.beezy.websoa.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.beezy.websoa.data.entities.Etudiant;

@Repository
public interface EtudiantRepository extends  JpaRepository<Etudiant, Long>{
	
	Etudiant findById(Long id);
}
