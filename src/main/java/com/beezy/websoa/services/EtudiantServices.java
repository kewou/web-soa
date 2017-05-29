package com.beezy.websoa.services;

import java.util.List;

import com.beezy.websoa.entities.Etudiant;
import com.beezy.websoa.entities.Unite;

public interface EtudiantServices {
	
	public List<Etudiant> listEtudiant();
	public List<Unite> listUniteByIdEtudiant(Long id);
	public void delete(Long id);
	public boolean saveOrUpdate(Etudiant etudiant);
	public Etudiant getEtudiantById(Long id);
	public void addEtudiant(Etudiant e);
	public void updateEtudiant(Etudiant e);

}
