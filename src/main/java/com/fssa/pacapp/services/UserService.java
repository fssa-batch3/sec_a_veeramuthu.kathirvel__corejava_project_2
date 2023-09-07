package com.fssa.pacapp.services;

import com.fssa.pacapp.dao.UserDAO;
import com.fssa.pacapp.dao.exception.DAOException;
import com.fssa.pacapp.model.User;
import com.fssa.pacapp.services.exceptions.ServiceException;
import com.fssa.pacapp.validation.UserValidator;
import com.fssa.pacapp.validation.exceptions.InvalidUserException;

public class UserService {
	public boolean registerUser(User user) throws ServiceException {
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

	public boolean logInUser(User user) throws ServiceException {
		UserDAO userDAO = new UserDAO();
		try {
			UserValidator.validateLogIn(user);
			if (userDAO.checkUserLogin(user.getEmail(), user.getPassword())) {
				return true;
			} else {
				return false;
			}

		} catch (DAOException | InvalidUserException e) {
			throw new ServiceException(e.getMessage());
		}

	}
}
