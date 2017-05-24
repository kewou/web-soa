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




@Entity
@Table(name = "Etudiant")
public class Etudiant {
	
	@Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

	@Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom;
    
    @Column(name ="dateNaissance")
    private Date dateNaissance;
    
    @OneToMany(mappedBy = "owner", cascade = CascadeType.ALL)
	private List<Unite> unites;
        
    
    public List<Unite> getUnites() {
		return unites;
	}

	public void setUnites(List<Unite> unites) {
		this.unites = unites;
	}

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
		EtudiantDto etuTO = new EtudiantDto();
		etuTO.setDateNaissance(this.getDateNaissance());
//		etuTO.setId(this.getId());
		etuTO.setNom(this.getNom());
		etuTO.setPrenom(this.getPrenom());
		
		return etuTO;
	}
	
//	public EtudiantDto convertEtudiantToDto(){
//		EtudiantDto etuTO = this.modelMapper.map(this,EtudiantDto.class);
//		return etuTO;
//	}
 	

}
