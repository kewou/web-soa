package com.beezy.websoa.dao;

import java.util.List;

import com.beezy.websoa.entities.Etudiant;
import com.beezy.websoa.entities.Unite;

public interface EtudiantDao {
	
	public void addEtudiant(Etudiant p_etudiant);	
	public Etudiant getEtudiantById(int id);	
	public List<Etudiant> list();	
	public void delete(int id);	
	public boolean saveOrUpdate(Etudiant p_etudiant);	
	public List<Unite> listUnite(int id);

}
