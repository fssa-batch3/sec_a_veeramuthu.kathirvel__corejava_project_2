  package com.fssa.pacapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.fssa.pacapp.dao.exception.DAOException;
import com.fssa.pacapp.model.Packages;


public class PackagesDAO {

	public boolean CreatePackeges(Packages packeges) throws DAOException {
		String insertQuery = "Insert INTO packeges (image, price,duration,description) VALUES(?,?,?, ?)";
		try (
				// Get connection
				Connection connection = ConnectionUtil.getConnection();
				// Prepare SQL s1tatement
				PreparedStatement statement = connection.prepareStatement(insertQuery);) {

			statement.setString(1, packeges.getImage());
			statement.setInt(2, packeges.getPrice());
			statement.setString(3, packeges.getDuration());
			statement.setString(4, packeges.getDescription());


			// Execute the query 
			int rows = statement.executeUpdate();
			// Return successful or no
			return (rows == 1);
		} catch (SQLException e) {
			throw new DAOException("error create a package");
		}
	}

	public List<Packages> readPackage() throws DAOException {
		List<Packages> packageList = new ArrayList<>();
		String selectQuery = "SELECT * FROM packeges";
		try (Connection connection = ConnectionUtil.getConnection();
				Statement statement = connection.createStatement() ;
				ResultSet resultSet = statement.executeQuery(selectQuery)) 
			{
				while (resultSet.next()) {
						Packages packageResult = new Packages();
						packageResult.setImage(resultSet.getString("image"));
						packageResult.setDuration(resultSet.getString("duration"));
						packageResult.setPrice(resultSet.getInt("price"));
						packageResult.setDescription(resultSet.getString("description"));
					
					packageList.add(packageResult);
				} 
				return packageList;
		} catch(SQLException e) {
	throw new DAOException (e);
}

}
}