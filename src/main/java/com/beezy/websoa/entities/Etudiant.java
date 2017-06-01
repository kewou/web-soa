package com.beezy.websoa.entities;

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

import com.beezy.websoa.dto.EtudiantDto;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
        
    
//    public List<Matiere> getMatieres() {
//		return matieres;
//	}
//
//	public void setMatieres(List<Matiere> matieres) {
//		this.matieres = matieres;
//	}

    	    	   	   
//    public List<Comment> getComment() {
//		return comments;
//	}

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

	@Override
	public String toString() {
		return "Etudiant [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", dateNaissance=" + dateNaissance + "]";
	}
		
	public EtudiantDto convertEtudiantToDto(){
		EtudiantDto EtudiantTO = new EtudiantDto();
		EtudiantTO.setDateNaissance(this.getDateNaissance());
		EtudiantTO.setId(this.getId());
		EtudiantTO.setNom(this.getNom());
		EtudiantTO.setPrenom(this.getPrenom());
		
		return EtudiantTO;
	}

	public String getUsername() {
		return username;
	}

	public void setEtudiantname(String username) {
		this.username = username;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

//	public List<Comment> getComments() {
//		return comments;
//	}		
//
////	public List<Role> getRoles() {
////		return roles;
////	}
////
////	public void setRoles(List<Role> roles) {
////		this.roles = roles;
////	}
//
//	public void setComments(List<Comment> comments) {
//		this.comments = comments;
//	}
	

}
