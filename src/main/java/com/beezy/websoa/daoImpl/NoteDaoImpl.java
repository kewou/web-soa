package com.beezy.websoa.daoImpl;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.beezy.websoa.dao.NoteDao;
import com.beezy.websoa.entities.Etudiant;
import com.beezy.websoa.entities.Matiere;
import com.beezy.websoa.entities.Note;

@Repository
@Transactional
public class NoteDaoImpl implements NoteDao{
	
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public void addNote(Note p_note) {
        Session session=sessionFactory.getCurrentSession();
        session.persist(p_note);  		
	}

	@Override
	public Matiere getMatiereById(int id) {
		Session session=sessionFactory.getCurrentSession();
		Matiere mat= (Matiere) session.load(Matiere.class, new Integer(id));
		return mat;
	}

	@Override
	public Etudiant getEtudiantById(int id) {
		Session session=sessionFactory.getCurrentSession();
		Etudiant etu = (Etudiant) session.load(Etudiant.class, new Integer(id));
		return etu;
	}
	


}
