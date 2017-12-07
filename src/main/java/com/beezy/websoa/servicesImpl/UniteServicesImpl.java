package com.beezy.websoa.servicesImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.beezy.websoa.data.entities.Unite;
import com.beezy.websoa.services.UniteServices;

@Transactional
@Service
public class UniteServicesImpl implements UniteServices {

	@Override
	public List<Unite> listUnite() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Unite getUniteById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addUnite(Unite u) {
		// TODO Auto-generated method stub

	}

}
