package pacapp.validation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import pacapp.model.User;
import pacapp.validation.exceptions.InvalidUserException;

public class UserValidator {
	
	public static boolean validateUser(User user) throws InvalidUserException{
		if (user != null && ValidateName(user.getName()) && Validatemobnum(user.getMobnum()) && ValidateEmail(user.getEmail()) && Validatepassword(user.getPassword())) {
			return true;
		} else {
			throw new InvalidUserException("User details are not valid");
		}
		
		
		
		
	}
	public static boolean ValidateName(String name) {
		boolean match = false;
		if(name == null)
			return false;
		try {
			String regex = "^[A-Z a-z]{3,29}$";
			Pattern p = Pattern.compile(regex);
			Matcher m = p.matcher(name);
			match = m.matches();
			if (match) {
				System.out.println("The name is valid."); 
			} else {
				System.out.println("The name is not valid");
			}
		} catch (Exception e) { 
			System.out.println("user name is not valid");
		}
		return match; 
	}
	
	public static boolean Validatemobnum (String mobnum) {
		boolean  match = false;
		if (mobnum == null)
			return false;
		try {
			
			String regex = "/^([+]\\d{2})?\\d{10}$/";
			Pattern n = Pattern.compile(mobnum);
			Matcher m = n.matcher(mobnum);
			match = m.matches();
			if (match) {
				System.out.println("The mob number is valid");
			}else {
			System.out.println("The mob number is not valid");
			}
			
		} catch (Exception e) {
			System.out.println("user mob num is not valid");
			
		}
		return false;
		
	}
	
	public static boolean ValidateEmail (String Email) {
		boolean  match = false;
		if (Email == null)
			return false;
		try {
			
			String regex = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\\\.[A-Za-z0-9-]+)*(\\\\.[A-Za-z]{2,})$";
			Pattern n = Pattern.compile(Email);
			Matcher m = n.matcher(Email);
			match = m.matches();
			if (match) {
				System.out.println("The mob number is valid");
			}else {
			System.out.println("The mob number is not valid");
			}
			
		} catch (Exception e) {
			System.out.println("user mob num is not valid");
			
		}
		return false;
		
	}
	
	public static boolean Validatepassword (String password) {
		boolean  match = false;
		if (password == null)
			return false;
		try {
			
			String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&!+=])(?=\\S+$).{8,}$";
			Pattern n = Pattern.compile(password);
			Matcher m = n.matcher(password);
			match = m.matches();
			if (match) {
				System.out.println("The password is valid");
			}else {
			System.out.println("The password is not valid");
			}
			
		} catch (Exception e) {
			System.out.println("user password is not valid");
			
		}
		return false;
		
	}
	
	
		
	}
	
	
	
	

