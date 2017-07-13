package com.beezy.websoa.data.entities;

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
	
}
