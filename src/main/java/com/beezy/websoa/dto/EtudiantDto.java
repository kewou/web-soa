                                                                                                                                            package com.beezy.websoa.dto;

import java.util.Date;
import java.util.List;

import com.beezy.websoa.entities.Etudiant;

public class EtudiantDto{
	
    private int id;
    private String nom;
    private String prenom;
    private Date dateNaissance;
    //private ModelMapper modelMapper = new ModelMapper();
    
    private List<UniteDto> listUniteChoisi;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	
	public Etudiant convertToEntitie(){
		//Etudiant etu = this.modelMapper.map(this,Etudiant.class);
		Etudiant etu = new Etudiant();
		etu.setNom(this.getNom());
		etu.setPrenom(this.getPrenom());
		etu.setDateNaissance(this.getDateNaissance());
		return etu;
	}

}
