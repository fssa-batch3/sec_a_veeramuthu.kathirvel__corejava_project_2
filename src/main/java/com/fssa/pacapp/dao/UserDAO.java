 package com.fssa.pacapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.fssa.pacapp.model.User;
import com.fssa.pacapp.dao.exception.DAOException;

public class UserDAO {

	public boolean register(User user) throws DAOException {
		String insertQuery = "Insert INTO user (email,name, password,phone_number,gender) VALUES(?,?,?,?,?)";
		try (
				// Get connection
				Connection connection = ConnectionUtil.getConnection();
				// Prepare SQL statement
				PreparedStatement statement = connection.prepareStatement(insertQuery);) {

			statement.setString(1, user.getEmail());
			statement.setString(2, user.getName());
			statement.setString(3, user.getPassword());
			statement.setString(4, user.getMobnum());
			String genderStr = String.valueOf(user.getGender());
			statement.setString(5, genderStr);

			// Execute the query
			int rows = statement.executeUpdate();
			// Return successful or not
			return (rows == 1);
		} catch (SQLException e) {
			throw new DAOException(e);
		}
	}

	public boolean checkUserLogin(String email, String password) throws DAOException {
		try {
			// Get connection
			Connection connection = ConnectionUtil.getConnection();

			String selectQuery = "SELECT * FROM user WHERE email = ?";
			PreparedStatement statement = connection.prepareStatement(selectQuery);
			statement.setString(1, email);

			// Execute the query
			ResultSet resultSet = statement.executeQuery();

			boolean userExists = resultSet.next();

			if (userExists) {
				System.out.println("User present.");
				String storedPassword = resultSet.getString("password");
				System.out.println(storedPassword);
				if (storedPassword.equals(password)) {
					System.out.println(" User successfully logged in.");
				} else {
					System.out.println(" Incorrect password.");
				}
			} else {
				System.out.println(" User credentials not exists.");
			}

			resultSet.close();
			statement.close();
			connection.close();

			return userExists;

		} catch (SQLException e) {
			throw new DAOException(e);
		}

	}

}