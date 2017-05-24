package com.beezy.websoa.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccueilController {
	
	@RequestMapping("/")
	public String index(){
		return "Yeah Spring Boot !";
	}
	
    @RequestMapping(value="/accueil",method = RequestMethod.GET)
    public String accueil() {
        return "accueil";
    }
}
