package NewApp.services;

import NewApp.model.User;


import NewApp.dao.*;
import NewApp.dao.exception.DAOException;
import NewApp.validation.*;
import NewApp.validation.exceptions.InvalidUserException;
import NewApp.services.exceptions.ServiceException;

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