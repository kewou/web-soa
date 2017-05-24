package com.beezy.websoa.services;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

public interface NoteServices {
	
	public void loadNote() throws IOException;
	
	public void setFic(File file);
	
	public File convert(MultipartFile file) throws IOException;

}
