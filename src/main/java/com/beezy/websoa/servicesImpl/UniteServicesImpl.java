package com.beezy.websoa.servicesImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beezy.websoa.dao.UniteDao;
import com.beezy.websoa.entities.Unite;
import com.beezy.websoa.services.UniteServices;

@Transactional
@Service
public class UniteServicesImpl implements UniteServices{
	
    @Autowired
    UniteDao UniteDao;

	public List<Unite> listUnite() {		 
		return UniteDao.list();
	}

	public UniteDao getUniteDao() {
		return UniteDao;
	}

	public void setUniteDao(UniteDao UniteDao) {
		this.UniteDao = UniteDao;
	}

	@Override
	public void delete(int id) {
		UniteDao.delete(id);		
	}

	@Override
	public Unite getUniteById(int id) {
		return UniteDao.getUniteById(id);
	}

	@Override
	public void addUnite(Unite e) {
		UniteDao.addUnite(e);		
	}

	

}
