package com.beezy.websoa.servicesImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.apache.commons.collections4.IteratorUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beezy.websoa.data.entities.Etudiant;
import com.beezy.websoa.data.entities.Unite;
import com.beezy.websoa.data.repository.EtudiantRepository;
import com.beezy.websoa.dto.EtudiantDTO;
import com.beezy.websoa.services.EtudiantServices;

import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;

@Transactional
@Service
public class EtudiantServicesImpl implements EtudiantServices{		
    
    @Autowired
    EtudiantRepository etuRepo;
    
    private MapperFactory mapperFactory;
    private MapperFacade mapper;
    
    public EtudiantServicesImpl(){
    	mapperFactory = new DefaultMapperFactory.Builder().build();
    	mapper=mapperFactory.getMapperFacade();
    }
    

	public List<EtudiantDTO> listEtudiant() {
		List<Etudiant> etuList=IteratorUtils.toList(etuRepo.findAll().iterator());		
		return mapper.mapAsList(etuList, EtudiantDTO.class);
	}

	@Override
	public EtudiantDTO getEtudiantById(int id) {
		return mapper.map(etuRepo.findOne(id), EtudiantDTO.class) ;
	}

	@Override
	public void addEtudiant(Etudiant e) {
		etuRepo.save(e);		
	}

	@Override
	public void updateEtudiant(Etudiant e) {
		etuRepo.save(e);		
	}

	@Override
	public List<Unite> listUniteByIdEtudiant(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int id) {
		etuRepo.delete(id);
	}


}
