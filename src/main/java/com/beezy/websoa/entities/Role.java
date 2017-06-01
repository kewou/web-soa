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
@Table(name = "Role")
public class Role {
    
    

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    

	@Column(name = "nom")
    private String nom;
	
	@ManyToOne
	@JoinColumns({@JoinColumn(name = "etudiant_owner", referencedColumnName = "id")})		
	private Etudiant owner;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Etudiant getOwner() {
		return owner;
	}

	public void setOwner(Etudiant owner) {
		this.owner = owner;
	}
	
}
