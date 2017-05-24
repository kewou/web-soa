package com.beezy.websoa.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Note")
public class Note {
	
	@Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

	@Column(name = "valeur")
    private int valeur;
	
	@ManyToOne
	@JoinColumns({@JoinColumn(name = "etudiant_owner", referencedColumnName = "id")})		
	private Etudiant etudiant_owner;
	
	@ManyToOne
	@JoinColumns({@JoinColumn(name = "matiere_owner", referencedColumnName = "id")})		
	private Matiere matiere_owner;
	
	

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
	
	
}
