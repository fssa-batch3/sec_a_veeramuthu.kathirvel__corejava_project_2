package com.fssa.pacapp.services;

import com.fssa.pacapp.dao.UserDAO;
import com.fssa.pacapp.dao.exception.DAOException;
import com.fssa.pacapp.model.User;
import com.fssa.pacapp.services.exceptions.ServiceException;
import com.fssa.pacapp.validation.UserValidator;
import com.fssa.pacapp.validation.exceptions.InvalidUserException;

public class PackageBookService {
	
	public boolean PackageBook(User PackageBook) throws ServiceException {
		UserDAO userDAO = new UserDAO();
		try {
		 	UserValidator.validateUser(user);
			if (userDAO.register(user)) {
				System.out.println(user.getEmail() + " Successfully addded");
				return true; 
			} else {
				System.out.println("not valid");
				return false;
			}

		} catch (DAOException | InvalidUserException e) {
			throw new ServiceException(e);
		}

}
