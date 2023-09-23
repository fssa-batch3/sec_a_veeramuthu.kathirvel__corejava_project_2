package com.fssa.pacapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.fssa.pacapp.dao.exception.DAOException;
import com.fssa.pacapp.model.PackageBook;
import com.fssa.pacapp.model.User;

public class PackageBookDAO {
	
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
