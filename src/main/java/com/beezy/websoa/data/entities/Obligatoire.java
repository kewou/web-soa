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
@Table(name = "Obligatoire")
public class Obligatoire {

	@Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	
	@Column(name = "nom")
    private String nom;
	
	@Column(name = "coef")
    private int coef;
	
	@ManyToOne
	@JoinColumns({@JoinColumn(name = "unite_owner", referencedColumnName = "id")})		
	private Unite owner;

}
