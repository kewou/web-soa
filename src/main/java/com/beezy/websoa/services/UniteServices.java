package com.beezy.websoa.services;

import java.util.List;

import com.beezy.websoa.data.entities.Unite;

public interface UniteServices {
	
	public List<Unite> listUnite();
	public void delete(int id);	
	public Unite getUniteById(int id);
	public void addUnite(Unite u);	

}
