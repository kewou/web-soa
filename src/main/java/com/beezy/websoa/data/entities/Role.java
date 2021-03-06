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

	
}
