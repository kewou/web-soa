package com.beezy.websoa.controller;

import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@ControllerAdvice
@EnableWebMvc
@RestController
public class ExceptionControllerAdvice {
	
	Logger logger=LoggerFactory.getLogger(this.getClass());
	
	// Convert a predefined exception to an HTTP Status code
	//@ResponseStatus(value=HttpStatus.CONFLICT,reason="Data integrity violation")  // 409
	@ResponseStatus(HttpStatus.CONFLICT)
	@ExceptionHandler(DataIntegrityViolationException.class)
	public void conflict(DataIntegrityViolationException e) {
		logger.error(e.getMessage());
	}	
	
	
	@ExceptionHandler(Exception.class)
	public ModelAndView defaultHandle(Exception e) throws Exception {		
		ModelAndView mav = new ModelAndView("exception");
		mav.addObject("name", e.getClass().getSimpleName());
		mav.addObject("message", e.getMessage());
		logger.error(e.getMessage());
		return mav;
	}
			
	// Specify name of a specific view that will be used to display the error:
	@ResponseStatus(HttpStatus.CONFLICT)
	@ExceptionHandler(SQLException.class)
	public String sqlException(SQLException e) {
		// Nothing to do.  Returns the logical view name of an error page, passed
		// to the view-resolver(s) in usual way.
		// Note that the exception is NOT available to this view (it is not added
		// to the model) but see "Extending ExceptionHandlerExceptionResolver"
		// below.
		return "sql Exception" + " \nNomE Exception : " + e;
	}
	
	// Specify name of a specific view that will be used to display the error:
	@ResponseStatus(HttpStatus.CONFLICT)
	@ExceptionHandler(DataAccessException.class)
	public String databaseAccessException(DataAccessException e) {
		return "dataAccess Exception" + " \nNomE Exception : " + e;
	}	

}
