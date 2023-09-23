 package com.fssa.pacapp.services;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import com.fssa.pacapp.model.Packages;
import com.fssa.pacapp.services.exceptions.ServiceException;

public class TestCreatePackagesFeature {

	//@Test

//	//void testRegisterProductSuccess() {
//		
//		Packages pack = new Packages("my_picture.GIF", 4000, "5 days", "Amazing place to visit chennai.");
//		PackagesService Service = new PackagesService();
//		try {
//			assertTrue(Service.CreatePackages(pack));
//		} catch (ServiceException e) {
//			e.printStackTrace();
//			fail();
//		}
//	}
	
	@Test
    void testCreatePackagesSuccess() {
        // Create valid package data
        Packages pack = new Packages("my_picture.jpg", 50000, "5 days", "Amazing place to visit Chennai.");
        
        // Create an instance of the PackagesService
        PackagesService service = new PackagesService();
        
        try {
            // Call the CreatePackages method with the valid package data
            assertTrue(service.CreatePackages(pack));
        } catch (ServiceException e) {
            e.printStackTrace();
            fail();
        }
    }
}
  
