package com.fssa.pacapp.services;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.fssa.pacapp.model.User;
import com.fssa.pacapp.services.exceptions.ServiceException;

public class TestLoginUserFeature {
	public static void main(String[] args) {
		User user1 = new User("gowthi@gmail.com", "Veerbuy@123");
		UserService userService = new UserService();

		try {
			assertTrue(userService.logInUser(user1));
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	@Test
	public void testLoginSuccess() throws ServiceException {
		UserService userService = new UserService();
		User user1 = new User("Veeramuthu@gmail.com", "Veeramuthu@123");
		try {
			assertTrue(userService.logInUser(user1));
		} catch (ServiceException e) {
			e.printStackTrace();
		}
	}
}
