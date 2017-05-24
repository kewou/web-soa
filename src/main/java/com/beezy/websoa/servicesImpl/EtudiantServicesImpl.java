package com.beezy.websoa.servicesImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beezy.websoa.dao.EtudiantDao;
import com.beezy.websoa.entities.Etudiant;
import com.beezy.websoa.entities.Unite;
import com.beezy.websoa.services.EtudiantServices;

@Transactional
@Service
public class EtudiantServicesImpl implements EtudiantServices{
		
    @Autowired
    EtudiantDao etudiantDao;

	public List<Etudiant> listEtudiant() {		
		return etudiantDao.list();
	}

	public boolean saveOrUpdate(Etudiant etudiant) {		
		return etudiantDao.saveOrUpdate(etudiant);
	}

	@Override
	public void delete(int id) {
		etudiantDao.delete(id);		
	}

	@Override
	public Etudiant getEtudiantById(int id) {
		return etudiantDao.getEtudiantById(id);
	}

	@Override
	public void addEtudiant(Etudiant e) {
		etudiantDao.addEtudiant(e);		
	}

	@Override
	public void updateEtudiant(Etudiant e) {
		etudiantDao.saveOrUpdate(e);		
	}

	@Override
	public List<Unite> listUniteByIdEtudiant(int id) {		
		return etudiantDao.listUnite(id);
	}

}
