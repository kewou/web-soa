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
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Getter;
import lombok.Setter;




@Entity
@Table(name = "Etudiant")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@Getter
@Setter
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
        
    
    public List<Matiere> getMatieres() {
		return matieres;
	}

	public void setMatieres(List<Matiere> matieres) {
		this.matieres = matieres;
	}

    	    	   	   
//    public List<Comment> getComment() {
//		return comments;
//	}



		
	public EtudiantDto convertEtudiantToDto(){
		EtudiantDto EtudiantTO = new EtudiantDto();
		EtudiantTO.setDateNaissance(this.getDateNaissance());
		EtudiantTO.setId(this.getId());
		EtudiantTO.setNom(this.getNom());
		EtudiantTO.setPrenom(this.getPrenom());
		
		return EtudiantTO;
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
