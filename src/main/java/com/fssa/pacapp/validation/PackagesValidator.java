 package com.fssa.pacapp.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.fssa.pacapp.model.Packages;
import com.fssa.pacapp.validation.exceptions.InvalidPackageException;

public class PackagesValidator {
	
	public static boolean validatePackage(Packages packages) throws InvalidPackageException {

		if (packages != null &&
		// validateURL(product.getUrl()) &&
				validateImageURL(packages.getImage()) && validatePrice(packages.getPrice())  && validateDescription(packages.getDescription())  && validateDuration(packages.getDuration())
				) {
			return true;
		} else {
			throw new InvalidPackageException("Package details not valid");
		}
	}
	


	public static boolean validateImageURL(String image) {
		boolean match = false;
		if (image == null)
			return false;
		try {

			String regex = "^https?://(?:www\\.)?[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}/[^\\s]*\\.(?:jpg|jpeg|png|gif)(?:\\?.*)?$";
	        
			Pattern n = Pattern.compile(regex);
			Matcher m = n.matcher(image);
			match = m.matches();
			if (match) {
				System.out.println("The Image  is valid");
				match = true;
			} else {
				System.out.println("The Image is not valid");
				return false; 
			}

		} catch (Exception e) {
			System.out.println("user Image is not valid");

		}
		return match;

	}
	
	
	
	public static boolean validatePrice(int p) {
		boolean match = false;
		String price = Integer.toString(p);

		if (price == null)
			return false;
		try {

			String regex = "[0-9]{5}";
			Pattern n = Pattern.compile(regex);
			Matcher m = n.matcher(price);
			match = m.matches();
			if (match) {
				System.out.println("The price amount  is valid");
				match = true;
			} else {
				System.out.println("The price amount is not valid");
				return false;
			}

		} catch (Exception e) {
			System.out.println("user price amount is not valid");

		}
		return match;

	}

	public static boolean validateDescription(String description) {
	    boolean match = false;
	    if (description == null)
	        return false;
	    try {
	        // Customize the regex pattern for description validation as needed
	        String regex = "^[a-zA-Z0-9 .,'-]+$"; // Example pattern allowing letters, digits, and common punctuation
	        Pattern pattern = Pattern.compile(regex);
	        Matcher matcher = pattern.matcher(description);
	        match = matcher.matches();
	        if (match) {
	            System.out.println("The description is valid");
	            match = true;
	        } else {
	            System.out.println("The description is not valid");
	            return false;
	        }
	    } catch (Exception e) {
	        System.out.println("User description is not valid");
	    }
	    return match;
	}

	public static boolean validateDuration(String duration) {
	    boolean match = false;
	    if (duration == null)
	        return false;
	    try {
	        
	        String regex = "\\d+\\s*(?:days?|hours?|minutes?)"; 
	        Pattern pattern = Pattern.compile(regex);
	        Matcher matcher = pattern.matcher(duration);
	        match = matcher.matches();
	        if (match) {
	            System.out.println("The duration is valid");
	            match = true;
	        } else {
	            System.out.println("The duration is not valid");
	            return false;
	        }
	    } catch (Exception e) {
	        System.out.println("User duration is not valid");
	    }
	    return match;
	}



	


	
	

}
