package NewApp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import NewApp.dao.exception.DAOException;
import NewApp.model.User;

public class UserDAO {
	public Connection getConnection() throws  SQLException {
	
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:336/project", "root","123456" );
		return connection;
}
	public boolean register(User user) throws DAOException {
		String insertQuery = "Insert INTO user (email,username, password,id,mobnum,gender,dob) VALUES(?, ?,?,?,?,?,?)";
	try(
		// Get connection
		Connection connection = getConnection();
		// Prepare SQL statement
		PreparedStatement statement = connection.prepareStatement(insertQuery);){
		
	
		statement.setString(1, user.getEmail());
		statement.setString(2, user.getName());
		statement.setString(3, user.getPassword());
		statement.setInt(4, user.getId());
		statement.setString(5,user.getMobnum());
		
		statement.setInt(7, user.getDOB());
		
		// Execute the query
		int rows = statement.executeUpdate();
		// Return successful or not
		return (rows == 1);
	}catch(SQLException e) {
		throw new DAOException(e);
	}
	}

}