package com.fssa.pacapp.services;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.fssa.pacapp.model.Packages;
import com.fssa.pacapp.services.exceptions.ServiceException;

public class TestReadPackagesFeature {
	
	@Test
	void testReadUserProductDetails() {
		PackagesService service = new PackagesService();
		try {
			List<Packages> result = service.readPackagesDetails();
			for (Packages output : result) {
				System.out.println(output.toString());
			}
			assertNotNull(result);

		} catch (ServiceException e) {  
			e.printStackTrace(); 
  
		} 
	}
 
} 
 