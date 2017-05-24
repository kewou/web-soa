package com.beezy.websoa.dto;

import com.beezy.websoa.entities.Etudiant;
import com.beezy.websoa.entities.Matiere;
import com.beezy.websoa.entities.Note;

public class NoteDto {
	
	private int id;
	private int valeur;
	private Etudiant etudiant_owner;
	private Matiere matiere_owner;	
	
	
	public Note convertToEntitie(){		
		Note note = new Note();
		note.setValeur(this.valeur);
		note.setEtudiant_owner(this.etudiant_owner);
		note.setMatiere_owner(this.matiere_owner);
		return note;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getValeur() {
		return valeur;
	}
	public void setValeur(int valeur) {
		this.valeur = valeur;
	}
	public Etudiant getEtudiant_owner() {
		return etudiant_owner;
	}
	public void setEtudiant_owner(Etudiant etudiant_owner) {
		this.etudiant_owner = etudiant_owner;
	}
	public Matiere getMatiere_owner() {
		return matiere_owner;
	}
	public void setMatiere_owner(Matiere matiere_owner) {
		this.matiere_owner = matiere_owner;
	}
	
	

}
