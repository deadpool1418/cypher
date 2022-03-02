package cypher;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerDao {
	public static Connection getConnection() throws SQLException {
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","cypher","Arunrv26@1999");
		return connection;
	}
	
	public static void getCustomer(int id) throws SQLException {
		Connection connection = getConnection();
		PreparedStatement ps = connection.prepareStatement("select * from customer where id=?");
		ps.setInt(1, id);
		ResultSet rSet = ps.executeQuery();
		System.out.println(rSet.getInt(1) + " " + rSet.getString(2) + " " + rSet.getString(2));
	}
}
