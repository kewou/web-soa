package com.beezy.websoa.dao;

import com.beezy.websoa.entities.Etudiant;
import com.beezy.websoa.entities.Matiere;
import com.beezy.websoa.entities.Note;

public interface NoteDao {

	public void addNote(Note p_note);
	
	public Matiere getMatiereById(int id);
	
	public Etudiant getEtudiantById(int id);
}
