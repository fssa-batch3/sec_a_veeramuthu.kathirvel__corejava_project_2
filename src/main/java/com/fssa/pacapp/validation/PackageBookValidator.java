package com.fssa.pacapp.validation;

import com.fssa.pacapp.model.User;
import com.fssa.pacapp.validation.exceptions.InvalidUserException;

public class PackageBookValidator {
	
	public static boolean validatePackageBook(User PackageBook) throws InvalidPackageBookException {
		if (PackageBook != null && validatename(PackageBook.getname()) && validateMobnum(PackageBook.getMobnum()) && validatehotel(PackageBook.gethotel()) && validatefood(PackageBook.getfood())) {
			return true;
		} else {
			throw new InvalidUserException("Package details are not valid");
		}
		
		
	}
	 
	
	
	
	    



	    
	    
	

}
