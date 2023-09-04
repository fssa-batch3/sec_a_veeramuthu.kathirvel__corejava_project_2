package com.fssa.pacapp.validation;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.fssa.pacapp.validation.UserValidator;
import com.fssa.pacapp.validation.exceptions.InvalidUserException;

public class TestValidateName {
	
	
	@Test
	public void testValidateName()  throws InvalidUserException {
		assertTrue(UserValidator.validateName("Veeramuthu"));
		
	}
	@Test
	public void testvalidateminumumcaseletters () throws InvalidUserException  {
		assertFalse(UserValidator.validateName("ve"));
	}
	
	@Test
	public void testvalidatemaximumletters ()  throws InvalidUserException {
		assertFalse(UserValidator.validateName("antidisestablishmentarianism"));
	}
	
	@Test
	public void testvalidateaddnumbers ()  throws InvalidUserException {
		assertFalse(UserValidator.validateName("12334498"));
	}

}
