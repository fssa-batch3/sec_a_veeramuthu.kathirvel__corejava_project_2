package com.fssa.pacapp.services;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.sql.Date;

import org.junit.jupiter.api.Test;

import com.fssa.pacapp.model.User;
import com.fssa.pacapp.services.exceptions.ServiceException;

public class TestRegisterationUserFeature {

	@Test
	public void testRegistrationSuccess() {
		Date.valueOf("2001-08-01");

		UserService userService = new UserService();
		User user1 = new User("Gowtham", "gowtham@gmail.com", "9551552316", "Veerboy@123", "12-12-2343", 'M');
		try {
			assertTrue(userService.registerUser(user1));
		} catch (ServiceException e) {
			e.printStackTrace();

		}
	}

	@Test
	public void testInvalidPassword() {
		Date.valueOf("2001-08-01");

		UserService userService = new UserService();
		User user1 = new User("Veeramuthu", "gowthi@gmail.com", "9233223121", "Veerbuy@123", "12-12-2343", 'M');
		try {
			assertFalse(userService.registerUser(user1));
		} catch (ServiceException e) {
			e.printStackTrace();

		}
	}

	@Test
	void testUserNull() {

		UserService userService = new UserService();
		User user1 = null;
		try {
			assertFalse(userService.registerUser(user1));
		} catch (ServiceException e) {
			e.printStackTrace();

		}

	}

}
