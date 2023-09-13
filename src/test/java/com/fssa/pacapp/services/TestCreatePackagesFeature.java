package com.fssa.pacapp.services;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import com.fssa.pacapp.model.Packages;
import com.fssa.pacapp.services.exceptions.ServiceException;

public class TestCreatePackagesFeature {

	@Test

	void testRegisterProductSuccess() {
		
		Packages pack = new Packages("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQhHtSX-SKHZFfh1yCMerwknxuofgoyGXoWUg&usqp=CAU", 4000, "5 days", "Amazing place to visit chennai.");
		PackagesService Service = new PackagesService();
		try {
			assertTrue(Service.CreatePackages(pack));
		} catch (ServiceException e) {
			e.printStackTrace();
			fail();
		}
	}
	
	
}
 