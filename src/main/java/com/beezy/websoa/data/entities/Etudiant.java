package com.beezy.websoa.data.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
@Table(name = "Etudiant")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Etudiant {
	
	@Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

	@Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom;
    
    @Column(name ="datenaissance")
    private Date dateNaissance;
    
    @Column(name ="username")
    private String username;
    
    @Column(name ="pass")
    private String pass;    
	             
    @OneToMany(mappedBy = "owner", cascade = CascadeType.ALL)
    private List<Matiere> matieres;
    
    @OneToMany(mappedBy = "owner", cascade = CascadeType.ALL)
	private List<Role> roles;

}
