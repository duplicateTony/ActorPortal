package dataaccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnection {
	private static String dbType = "mysql";
	private static String mysql_driver = "com.mysql.cj.jdbc.Driver";
	private static String mysql_url = "jdbc:mysql://localhost:3306/actor?useSSL=false&&allowPublicKeyRetrieval=true";
	private static String mysql_user = "rdiamond_admin";
	private static String mysql_pass = "user@123";
	
	private static String url;
	private static Connection conn;
	private static PreparedStatement stmt;
	private static ResultSet rs;

	public static Connection getConnection() {
		try { 
			if(dbType.equalsIgnoreCase("mysql")) {
				Class.forName(mysql_driver);
				url = mysql_url;
			}
			
			conn = DriverManager.getConnection(url, mysql_user, mysql_pass);
		}catch(ClassNotFoundException e1) {
			e1.printStackTrace();
		}catch(SQLException e2) {
			e2.printStackTrace();
		} 
		
		return conn;
	}

	public static ResultSet execStatement(Connection conn, String queryString) throws SQLException {
		try {
			stmt = conn.prepareStatement(queryString);
			rs = stmt.executeQuery();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return rs;
	}

	public static void cleanResource() {
		try {
			if(rs != null) {
				rs.close();
			}
			
			if(stmt != null) {
				stmt.close();
			}
			
			if(conn != null) {
				conn.close();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		String[] Querys = {
				"select * from shop",	
		};
			
		try {
			Connection conn = getConnection();
			
			for(String query : Querys) {
				ResultSet rs = execStatement(conn, query);
				while(rs.next()) {
					System.out.println(rs.getInt(1));
				}
			}
			
			cleanResource();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
