package com.fssa.pacapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.fssa.pacapp.model.Packages;
import com.fssa.pacapp.dao.ConnectionUtil;
import com.fssa.pacapp.dao.exception.DAOException;

public class PackagesDAO {


	public boolean CreatePackeges(Packages packeges) throws DAOException {
		String insertQuery = "Insert INTO packeges (image, price,duration,) VALUES(?, ?,?)";
		try (
				// Get connection
				Connection connection = ConnectionUtil.getConnection();
				// Prepare SQL s1tatement
				PreparedStatement statement = connection.prepareStatement(insertQuery);) {

			statement.setString(1, packeges.getImage());
			statement.setString(2, packeges.getDuration());
			statement.setInt(3, packeges.getPrice());
			

			// Execute the query
			int rows = statement.executeUpdate();
			// Return successful or no
			return (rows == 1);
		} catch (SQLException e) {
			throw new DAOException("error create a package");
		}
	}

	public boolean listPackages() throws DAOException {
		// TODO Auto-generated method stub
		return false;
	}

	
}