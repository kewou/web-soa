package com.beezy.websoa.services;

import java.util.List;

import com.beezy.websoa.entities.Etudiant;
import com.beezy.websoa.entities.Unite;

public interface EtudiantServices {
	
	public List<Etudiant> listEtudiant();
	public List<Unite> listUniteByIdEtudiant(int id);
	public void delete(int id);
	public boolean saveOrUpdate(Etudiant etudiant);
	public Etudiant getEtudiantById(int id);
	public void addEtudiant(Etudiant e);
	public void updateEtudiant(Etudiant e);

}
