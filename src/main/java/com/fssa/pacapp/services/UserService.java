package com.fssa.pacapp.services;

import java.util.function.BooleanSupplier;

import com.fssa.pacapp.model.User;
import com.fssa.pacapp.services.exceptions.ServiceException;
import com.fssa.pacapp.validation.UserValidator;
import com.fssa.pacapp.validation.exceptions.InvalidUserException;
import newapp.dao.UserDAO;
import newapp.dao.exception.DAOException;

public class UserService {
	public boolean registerUser(User user) throws ServiceException {
		UserDAO userDAO = new UserDAO();
		try {
			UserValidator.validateUser(user);
			if (userDAO.register(user)) {
				System.out.println(user.getEmail()+" Successfully addded");
				return true;
			} else {
				System.out.println("not valid");
				return false;
			}
			
		}catch (DAOException | InvalidUserException e) {
			throw new ServiceException(e);
		}
		
		
		
	}

	public boolean logInUser(User user1) throws ServiceException {
		UserDAO userDAO = new UserDAO();
		try {
			UserValidator.validateUser(user1);
			if (userDAO.register(user1)) {
				System.out.println(user1.getEmail()+" Successfully addded");
				return true;
			} else {
				System.out.println("not valid");
				return false;
			}
			
		}catch (DAOException | InvalidUserException e) {
			throw new ServiceException(e);
		}
		
		
	}

	
	}
