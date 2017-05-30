package com.beezy.websoa.daoImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.beezy.websoa.dao.EtudiantDao;
import com.beezy.websoa.entities.Etudiant;
import com.beezy.websoa.entities.Unite;


@Repository
@Transactional
public class EtudiantDaoImpl implements EtudiantDao{

	@Autowired
	SessionFactory sessionFactory;
	
	public boolean saveOrUpdate(Etudiant etudiant){
		Session session =sessionFactory.getCurrentSession();
	    session.saveOrUpdate(etudiant);
		return true; 
	} 
	
	public List<Etudiant> list(){
		Session session=sessionFactory.getCurrentSession();
		List<Etudiant> etudiantList = session.createQuery("from Etudiant").list();
        return etudiantList;		
	}
	
	public List<Unite> listUnite(int id){
		Session session=sessionFactory.getCurrentSession();
		String sql = "from Unite where etudiant_owner=:id";	
		List<Unite> uniteList = session.createQuery(sql).setParameter("id",id).list();
		return uniteList;
	}
	
	public void delete(int id){
			Session session=sessionFactory.getCurrentSession();
			Etudiant e = (Etudiant) session.load(Etudiant.class, new Integer(id));
			session.delete(e);
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void addEtudiant(Etudiant p_etudiant) {	
        Session session=sessionFactory.getCurrentSession();
        session.persist(p_etudiant);                                                   
	}

	@Override
	public Etudiant getEtudiantById(int id) {
		Session session=sessionFactory.getCurrentSession();
		Etudiant e = (Etudiant) session.load(Etudiant.class, new Integer(id));
		return e;
	}                                                                                                                                        

}