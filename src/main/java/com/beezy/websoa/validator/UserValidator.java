package com.beezy.websoa.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.beezy.websoa.services.EtudiantServices;


public class UserValidator implements Validator{

	@Override
	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void validate(Object arg0, Errors arg1) {
		// TODO Auto-generated method stub
		
	}
	/*
    @Autowired   
    private EtudiantRepository etuRepo;

	@Override
	public boolean supports(Class<?> arg0) {
		return Etudiant.class.equals(arg0);
	}

    @Override
    public void validate(Object o, Errors errors) {
        Etudiant etudiant = (Etudiant) o;

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "Etudiantname", "NotEmpty");
        if (etudiant.getUsername().length() < 6 || etudiant.getUsername().length() > 32) {
            errors.rejectValue("Etudiantname", "Size.EtudiantForm.Etudiantname");
        }
        if (etuRepo.findByUsername(username)(etudiant.getUsername()) != null) {
            errors.rejectValue("Etudiantname", "Duplicate.EtudiantForm.Etudiantname");
        }

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "NotEmpty");
        if (etudiant.getPass().length() < 8 || etudiant.getPass().length() > 32) {
            errors.rejectValue("password", "Size.EtudiantForm.password");
        }

//        if (!etudiant.getPasswordConfirm().equals(etudiant.getPass())) {
//            errors.rejectValue("passwordConfirm", "Diff.EtudiantForm.passwordConfirm");
//        }
    }
*/
}
