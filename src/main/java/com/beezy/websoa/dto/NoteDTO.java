package com.beezy.websoa.dto;

import com.beezy.websoa.data.entities.Etudiant;
import com.beezy.websoa.data.entities.Matiere;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NoteDTO {
	
	private int id;
	private int valeur;
	private Etudiant etudiant_owner;
	private Matiere matiere_owner;	
	
}
