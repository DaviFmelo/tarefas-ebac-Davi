/**
 * 
 */
package davi.dao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Davi
 *
 */
public class Factory {
	
	private static Connection connection;
	
	private Factory(Connection connection) {
	}
	
	public static Connection getConnection() throws SQLException {
		if (connection == null) {
			connection = initConnection();
			return connection;
		} else if (connection.isClosed()) {
			connection = initConnection();
			return connection;
		} else {
			return connection;
		}
	}
	
	private static Connection initConnection() {
		try {
			return DriverManager.getConnection ("jdbc:postgresql://localhost:55891/vendas_online", "davi", "966737668Franca");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
