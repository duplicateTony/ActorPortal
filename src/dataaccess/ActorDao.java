package dataaccess;

import java.sql.Connection;

public class ActorDao {
private static Connection con = null;
	
	public ActorDao() {
		con = DBConnection.getConnection();
	}
	
}