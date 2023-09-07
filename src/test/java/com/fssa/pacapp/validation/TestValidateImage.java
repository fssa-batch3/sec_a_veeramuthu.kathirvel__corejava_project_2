package com.fssa.pacapp.validation;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.fssa.pacapp.validation.PackagesValidator;

public class TestValidateImage {
	
	
	
	@Test
	public void testValidatevalidateImageURL() {
		assertTrue(PackagesValidator.validateImageURL("https://img.freepik.com/free-photo/beauty-portrait-ginger-woman-with-flower-hair-sitting-by-mirror-table-with-bottle-lotion-while-looking-away_171337-1068.jpg?size=626&ext=jpg&ga=GA1.2.1319163761.1690984074&semt=ais"));
		
	}
	@Test
	public void testvalidateinvalidImageURL () {
		assertFalse(PackagesValidator.validateImageURL("lll://img.freepik.com/free-photo/beauty-portrait-ginger-woman-with-flower-hair-sitting-by-mirror-table-with-bottle-lotion-while-looking-away_171337-1068.jpg?size=626&ext=jpg&ga=GA1.2.1319163761.1690984074&semt=ais"));
	}
	
	@Test 
	public void testvalidateEmptyImagespace() {
		assertFalse(PackagesValidator.validateImageURL(""));
	}
	
		

}
