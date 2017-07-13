package com.beezy.websoa.data.dao;

import java.util.List;

import com.beezy.websoa.data.entities.Unite;



public interface UniteDao {
	
	public void addUnite(Unite p_Unite);	
	public Unite getUniteById(int id);	
	public List<Unite> list();	
	public void delete(int id);	

}
