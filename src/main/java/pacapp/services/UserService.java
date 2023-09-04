package pacapp.services;

import pacapp.model.User;


import pacapp.dao.*;
import pacapp.dao.exception.DAOException;
import pacapp.validation.*;
import pacapp.validation.exceptions.InvalidUserException;
import pacapp.services.exceptions.ServiceException;

public class UserService {
	public boolean registerUser(User user) throws ServiceException{
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
}