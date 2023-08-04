package testvalidation;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import NewApp.validation.UserValidator;

public class Validatepassword {
	
	
	@Test
	public void testValidPassword() {
		assertTrue(UserValidator.Validatepassword("Password@123"));
		
	}
	
	@Test
	public void testInvalidPasswordWithoutSpecialCharacters() {
		assertFalse(UserValidator.Validatepassword("Password123"));
	}
	
	@Test
	public void testInvalidPasswordWithoutNumbers() {
		assertFalse(UserValidator.Validatepassword("Password@"));
	}
	
	@Test
	public void testInvalidPasswordWithoutCapitalLetters() {
		assertFalse(UserValidator.Validatepassword("password@123"));
	}
	
	@Test
	public void testInvalidPasswordWithoutSmallLetters() {
		assertFalse(UserValidator.Validatepassword("PASSWORD@123"));
	}
	
	@Test
	public void testInvalidPasswordShorterLength() {
		// Length less than 8
		assertFalse(UserValidator.Validatepassword("Pas@123"));
	}

}
