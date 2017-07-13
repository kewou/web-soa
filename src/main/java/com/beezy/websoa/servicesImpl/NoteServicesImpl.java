package com.beezy.websoa.servicesImpl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.beezy.websoa.data.dao.NoteDao;
import com.beezy.websoa.data.entities.Etudiant;
import com.beezy.websoa.data.entities.Matiere;
import com.beezy.websoa.dto.NoteDTO;
import com.beezy.websoa.services.NoteServices;


@Transactional
@Service
public class NoteServicesImpl implements NoteServices{

    @Autowired
    NoteDao noteDao;
    
    private File fic;
	private BufferedReader br; 	
	private final String separateur=";";
    
	@Override
	public void loadNote() throws IOException {		
		br = new BufferedReader(new FileReader(this.fic));		
		String firstLine=br.readLine();
		Matiere mat = noteDao.getMatiereById(Integer.parseInt(firstLine.split(separateur)[0]));					
		String line=br.readLine();	
		while(line!=null){						
				NoteDTO noteTO = new NoteDTO();
				Etudiant etu = noteDao.getEtudiantById(Integer.parseInt(line.split(separateur)[0]));
				noteTO.setMatiere_owner(mat);
				noteTO.setEtudiant_owner(etu);
				noteTO.setValeur(Integer.parseInt(line.split(separateur)[1]));
				//noteDao.addNote(noteTO.convertToEntitie());
				line=br.readLine();			
		}
	}
	
	public File getFic() {
		return fic;
	}
	public void setFic(File fic) {
		this.fic = fic;
	}
	
	
	public File convert(MultipartFile file) throws IOException
	{    
	    File convFile = new File(file.getOriginalFilename());
	    convFile.createNewFile(); 
	    FileOutputStream fos = new FileOutputStream(convFile); 
	    fos.write(file.getBytes());
	    fos.close(); 
	    return convFile;
	}
}
