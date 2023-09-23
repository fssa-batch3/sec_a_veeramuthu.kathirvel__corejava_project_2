package com.fssa.pacapp.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.fssa.pacapp.model.User;
import com.fssa.pacapp.validation.exceptions.InvalidUserException;

public class UserValidator {
	
	public static boolean validateUser(User user) throws InvalidUserException {
		if (user != null && validateName(user.getName()) && validateMobnum(user.getMobnum()) && validateEmail(user.getEmail()) && validatePassword(user.getPassword())) {
			return true;
		} else {
			throw new InvalidUserException("User details are not valid");
		}
		
		
	}
	 
	public static boolean validateLogIn(User user) throws InvalidUserException {
		if (user != null && validateEmail(user.getEmail()) && validatePassword(user.getPassword())) {
			return true;
		} else {
			throw new InvalidUserException("User details not valid");

		} 
	}
	public static boolean validateName (String Name) throws InvalidUserException {
		boolean  match = false;
		if (Name == null)
			return false;
		try {
			
			String regex = "^[A-Z a-z]{3,29}$";
			Pattern n = Pattern.compile(regex);
			Matcher m = n.matcher(Name);
			match = m.matches();
			if (match) {
				System.out.println("The Name is valid");
				match = true;
			}else {
			System.out.println("The Name is not valid"); 
			return false;
			}
			
		} catch (Exception e) {
			
			throw new InvalidUserException("user Name is not valid");
			
		}
		return match;
		
	}
	
	public static boolean validateEmail (String email) throws InvalidUserException {
		boolean  match = false;
		if (email == null)
			return false;
		try {
			
			String regex = "^[a-z0-9._%+-]+@[a-z0-9]+\\.[a-z]{2,4}$";
			Pattern n = Pattern.compile(regex);
			Matcher m = n.matcher(email);
			match = m.matches();
			if (match) {
				System.out.println("The email is valid");
				match = true;
			}else {
			System.out.println("The email is not valid");
			return false;
			}
			
		} catch (Exception e) {
		
			throw new InvalidUserException("user email is not valid");
			
		}
		return match;
		
	}
	
	public static boolean validateMobnum (String mobnum) throws InvalidUserException {
		boolean  match = false;
		if (mobnum == null)
			return false;
		try {
			
			String regex = "^[789]\\d{9}$";
			Pattern n = Pattern.compile(regex);
			Matcher m = n.matcher(mobnum);
			match = m.matches();
			if (match) {
				System.out.println("The mobnum is valid");
				match = true;
			}else {
			System.out.println("The mobnum is not valid");
			return false;
			}
			
		} catch (Exception e) {
			
			
			throw new InvalidUserException("user mobnum is not valid");
		
			
		}
		return match;
		
	}
	
	public static boolean validatePassword (String password) throws InvalidUserException {
		boolean  match = false;
		if (password == null)
			return false;
		try {
			
			String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&!+=])(?=\\S+$).{8,}$";
			Pattern n = Pattern.compile(regex);
			Matcher m = n.matcher(password);
			match = m.matches();
			if (match) {
				System.out.println("The password is valid");
				match = true;
			}else {
			System.out.println("The password is not valid");
			return false;
			}
			
		} catch (Exception e) {
			
			
			throw new InvalidUserException("user password is not valid");
			
		}
		return match;
		
	}
	
		
	}
	
	
		
	
	
	
	
	

