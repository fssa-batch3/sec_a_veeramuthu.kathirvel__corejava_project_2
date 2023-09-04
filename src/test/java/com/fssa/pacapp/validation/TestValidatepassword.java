package com.fssa.pacapp.validation;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.fssa.pacapp.validation.UserValidator;
import com.fssa.pacapp.validation.exceptions.InvalidUserException;

public class TestValidatepassword {
	
	
	@Test
	public void testValidPassword()  throws InvalidUserException {
		assertTrue(UserValidator.validatePassword("Password@123"));
		
	}
	
	@Test
	public void testInvalidPasswordWithoutSpecialCharacters() throws InvalidUserException  {
		assertFalse(UserValidator.validatePassword("Password123"));
	}
	
	@Test
	public void testInvalidPasswordWithoutNumbers()  throws InvalidUserException {
		assertFalse(UserValidator.validatePassword("Password@"));
	}
	
	@Test
	public void testInvalidPasswordWithoutCapitalLetters()  throws InvalidUserException {
		assertFalse(UserValidator.validatePassword("password@123"));
	}
	
	@Test
	public void testInvalidPasswordWithoutSmallLetters()  throws InvalidUserException {
		assertFalse(UserValidator.validatePassword("PASSWORD@123"));
	}
	
	@Test
	public void testInvalidPasswordShorterLength()  throws InvalidUserException {
		// Length less than 8
		assertFalse(UserValidator.validatePassword("Pas@123"));
	}

}
