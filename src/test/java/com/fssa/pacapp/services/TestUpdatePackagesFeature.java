package com.fssa.pacapp.services;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import com.fssa.pacapp.model.Packages;
import com.fssa.pacapp.services.exceptions.ServiceException;

public class TestUpdatePackagesFeature {
	
	@Test
	void testUpdatePackageSuccess() {
	    
	    Packages updatedPackage = new Packages( "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQhHtSX-SKHZFfh1yCMerwknxuofgoyGXoWUg&usqp=CAU" , 40000, "3 days", "Amazing place" ,7);
	    
	    PackagesService service = new PackagesService();
	    
	    System.out.println(updatedPackage);
	    
	    try {  
	        assertTrue(service.updatePackageDetails(updatedPackage));
	    } catch (ServiceException e) {
	       e.printStackTrace();
	       fail();
	    }
	}
	

}
