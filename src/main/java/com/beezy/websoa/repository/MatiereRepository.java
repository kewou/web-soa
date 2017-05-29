package com.beezy.websoa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.beezy.websoa.entities.Matiere;

public interface MatiereRepository {
	
	Matiere findById(Long id);	

}
