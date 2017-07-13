package com.beezy.websoa.data.dao;

import com.beezy.websoa.data.entities.Etudiant;
import com.beezy.websoa.data.entities.Matiere;
import com.beezy.websoa.data.entities.Note;

public interface NoteDao {

	public void addNote(Note p_note);
	
	public Matiere getMatiereById(int id);
	
	public Etudiant getEtudiantById(int id);
}
