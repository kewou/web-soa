package com.beezy.websoa.data.daoImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.beezy.websoa.data.dao.UniteDao;
import com.beezy.websoa.data.entities.Unite;


@Repository
@Transactional
public class UniteDaoImpl implements UniteDao {
	
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public void addUnite(Unite p_Unite) {
        Session session=sessionFactory.getCurrentSession();
        session.persist(p_Unite); 
	}

	@Override
	public Unite getUniteById(int id) {
		Session session=sessionFactory.getCurrentSession();
		Unite u = (Unite) session.load(Unite.class, new Integer(id));
		return u;
	}

	@Override
	public List<Unite> list() {
		Session session=sessionFactory.getCurrentSession();
		List<Unite> UniteList = session.createQuery("from Unite").list();
        return UniteList;
	}

	@Override
	public void delete(int id) {
		Session session=sessionFactory.getCurrentSession();
		Unite u = (Unite) session.load(Unite.class, new Integer(id));
		session.delete(u);
	}

}
