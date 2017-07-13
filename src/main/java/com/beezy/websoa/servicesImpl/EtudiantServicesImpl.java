package com.beezy.websoa.servicesImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.apache.commons.collections4.IteratorUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beezy.websoa.data.dao.EtudiantDao;
import com.beezy.websoa.data.entities.Etudiant;
import com.beezy.websoa.data.entities.Unite;
import com.beezy.websoa.data.repository.EtudiantRepository;
import com.beezy.websoa.services.EtudiantServices;

@Transactional
@Service
public class EtudiantServicesImpl implements EtudiantServices{
		
    @Autowired
    EtudiantDao etudiantDao;
    
    @Autowired
    EtudiantRepository etuRepo;

	public List<Etudiant> listEtudiant() {		
		return IteratorUtils.toList(etuRepo.findAll().iterator());
	}

	@Override
	public Etudiant getEtudiantById(Long id) {
		return etuRepo.findById(id);
	}

	@Override
	public void addEtudiant(Etudiant e) {
		etudiantDao.addEtudiant(e);		
	}

	@Override
	public void updateEtudiant(Etudiant e) {
		etuRepo.saveAndFlush(e);		
	}

	@Override
	public List<Unite> listUniteByIdEtudiant(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		etuRepo.delete(id);
	}


}
