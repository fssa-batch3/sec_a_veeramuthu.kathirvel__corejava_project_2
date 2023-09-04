package com.fssa.pacapp.validation;

import static org.junit.jupiter.api.Assertions.assertFalse;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.fssa.pacapp.validation.UserValidator;
import com.fssa.pacapp.validation.exceptions.InvalidUserException;

public class TestValidateEmail {
	
	
	
	@Test
	public void testValidateEmail()  throws InvalidUserException {
		assertTrue(UserValidator.validateEmail("johndoe@example.com"));
		
	}
	@Test
	public void testvalidateuppercaseletters ()  throws InvalidUserException {
		assertFalse(UserValidator.validateEmail("WERTYYU@eer.com"));
	}
	
	@Test
	public void testvalidatewithoutspeicel ()  throws InvalidUserException {
		assertFalse(UserValidator.validateEmail("veer.com"));
	}
	
	@Test
	public void testvalidatewithoutpoint ()  throws InvalidUserException {
		assertFalse(UserValidator.validateEmail("veer@com"));
	}
	
	 
	
	
	

}
