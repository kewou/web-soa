package com.beezy.websoa.services;

import java.util.List;

import com.beezy.websoa.data.entities.Etudiant;
import com.beezy.websoa.data.entities.Unite;
import com.beezy.websoa.dto.EtudiantDTO;

public interface EtudiantServices {
	
	public List<EtudiantDTO> listEtudiant();
	public List<Unite> listUniteByIdEtudiant(Long id);
	public void delete(int id);	
	public EtudiantDTO getEtudiantById(int id);
	public void addEtudiant(Etudiant e);
	public void updateEtudiant(Etudiant e);

}
