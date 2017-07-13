package com.beezy.websoa.data.entities;

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
@Table(name = "Matiere")
public class Matiere {
	
	@Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	
	@Column(name = "nom")
    private String nom;
	
	@Column(name = "coef")
    private int coef;
	
    @OneToMany(mappedBy = "matiere_owner", cascade = CascadeType.ALL)
	private List<Note> notes;
    
	@ManyToOne
	@JoinColumns({@JoinColumn(name = "user_owner", referencedColumnName = "id")})		
	private Etudiant owner;
}
