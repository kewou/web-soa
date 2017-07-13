                                                                                                                                            package com.beezy.websoa.dto;

import java.util.Date;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EtudiantDTO{
	
    private int id;
    private String nom;
    private String prenom;
    private Date dateNaissance;
    private String username;
    private String pass;
    private List<UniteDto> listUniteChoisi;


}
