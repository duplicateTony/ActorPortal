package dataaccess;

import java.sql.Connection;

public class EmployerDao {
	private static Connection con = null;
	
	public EmployerDao() {
		con = DBConnection.getConnection();
	}
	
}