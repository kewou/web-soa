package com.beezy.websoa.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Unite")	
public class Unite {	
	
	@Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	
    @Column(name = "nom")
    private String nom;

	@Column(name = "credit")
    private int credit;

	@ManyToOne
	@JoinColumns({@JoinColumn(name = "etudiant_owner", referencedColumnName = "id")})		
	private Etudiant owner;	
	
    @OneToMany(mappedBy = "owner", cascade = CascadeType.ALL)
	private List<Matiere> matieres;
	
	
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
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	public Etudiant getOwner() {
		return owner;
	}
	public void setOwner(Etudiant owner) {
		this.owner = owner;
	}
	
	
	
	



}
