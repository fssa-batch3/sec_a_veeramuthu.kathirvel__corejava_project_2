package com.fssa.pacapp.validation;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.fssa.pacapp.validation.UserValidator;
import com.fssa.pacapp.validation.exceptions.InvalidUserException;

public class TestValidateMobnumber {
	
	
	@Test
	public void testValidateMobnumber()  throws InvalidUserException {
		assertTrue(UserValidator.validateMobnum("9886788965"));
		
	}
	@Test
	public void testvalidateacceptmoredigitnumber ()  throws InvalidUserException {
		assertFalse(UserValidator.validateMobnum("6789009877662344789921190976544"));
	}
	
	@Test
	public void testvalidateacceptletters () throws InvalidUserException {
		assertFalse(UserValidator.validateMobnum("AddGiolkjgf"));
	}
	
	@Test
	public void testvalidateacceptstrangcases ()  throws InvalidUserException {
		assertFalse(UserValidator.validateMobnum("@#%&^$#^*"));
	}
	
	

}
