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
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery(selectQuery)) {
			while (resultSet.next()) {
				Packages packageResult = new Packages();
				packageResult.setId(Integer.parseInt(resultSet.getString("packege_id")));
				packageResult.setImage(resultSet.getString("image"));
				packageResult.setDuration(resultSet.getString("duration"));
				packageResult.setPrice(resultSet.getInt("price"));
				packageResult.setDescription(resultSet.getString("description"));

				packageList.add(packageResult);
			}

			resultSet.close();
			statement.close();
			connection.close();

			return packageList;

		} catch (SQLException e) {
			throw new DAOException(e);
		}

	}

	public boolean updatePackage(Packages updatedPackage) throws DAOException {
		String updateQuery = "UPDATE packeges SET image=?, duration=?, price=?, description=? WHERE packege_id=?";

		try (Connection connection = ConnectionUtil.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(updateQuery)) {
			preparedStatement.setString(1, updatedPackage.getImage());
			preparedStatement.setString(2, updatedPackage.getDuration());
			preparedStatement.setInt(3, updatedPackage.getPrice());
			preparedStatement.setString(4, updatedPackage.getDescription());
			preparedStatement.setInt(5, updatedPackage.getId()); // Assuming 'packages_id' is the primary key

			int rowsUpdated = preparedStatement.executeUpdate();

			return rowsUpdated == 1;
		} catch (SQLException e) {
			throw new DAOException(e);
		}
	}

	public boolean deletePackage(int packageId) throws DAOException {
		String deleteQuery = "DELETE FROM packeges WHERE packege_id = ?";

		try (Connection connection = ConnectionUtil.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery)) {
			preparedStatement.setInt(1, packageId);

			int rowsDeleted = preparedStatement.executeUpdate();

			return rowsDeleted == 1;
		} catch (SQLException e) {
			throw new DAOException(e);
		}
	}
	
	public Packages getIdByObject(int id) throws DAOException {
	    String selectQuery = "SELECT * FROM packeges WHERE packege_id = ?";
	    
	    try (Connection connection = ConnectionUtil.getConnection();
	         PreparedStatement pst = connection.prepareStatement(selectQuery)) {
	        
	        pst.setInt(1, id);
	        try (ResultSet resultSet = pst.executeQuery()) {
	            while (resultSet.next()) {
	                Packages packageResult = new Packages();
	                packageResult.setId(resultSet.getInt("packege_id"));
	                packageResult.setImage(resultSet.getString("image"));
	                packageResult.setDuration(resultSet.getString("duration"));
	                packageResult.setPrice(resultSet.getInt("price"));
	                packageResult.setDescription(resultSet.getString("description"));
	                
	                return packageResult;
	            }
	        }
	    } catch (SQLException e) {
	        throw new DAOException(e);
	    }
	    
	    // Return null or handle the case where no package was found.
	    return null;
	}


	
	
	

}