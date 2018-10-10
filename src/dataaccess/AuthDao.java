package dataaccess;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AuthDao {
	private static Connection con = null;
	
	public AuthDao() {
		con = DBConnection.getConnection();
	}
	
	public boolean checkUserPass(String username,String password,String type){
		boolean status = false; 
		
		try {
			if(type.equalsIgnoreCase("PortalUser")) {
				type = "admin";
			}
			PreparedStatement ps=con.prepareStatement(  
					"select * from user where user_name=? and user_password=? and user_type_name=?");   
			ps.setString(1,username);
			ps.setString(2,password);
			ps.setString(3,type);
			ResultSet rs = ps.executeQuery();
			
			status = rs.next();
		}catch(Exception e){
			System.out.println(e);
		}
		return status;
	}
	
	public boolean checkActorUserName(String username){
		try {       
			PreparedStatement ps=con.prepareStatement(  
					"select * from actor_preface where user_name=?");   
			ps.setString(1,username);  
			ResultSet rs = ps.executeQuery();
		      
			if(rs.next()){
				if(username.equals(rs.getString("user_name"))) 
					return false;            
			}
		}catch(Exception e){
			System.out.println(e);
		}  
		return true;
	}
	
	public boolean checkEmpUserName(String username){
		try {      
			PreparedStatement ps = con.prepareStatement(  
					"select * from employer where user_name=?");   
			ps.setString(1,username);  
			ResultSet rs = ps.executeQuery();
		      
			if(rs.next()){
				if(username.equals(rs.getString("user_name"))) 
					return false;            
			}
		}catch(Exception e){
			System.out.println(e);
		}
		
		return true;
	}
	
	public boolean addNewActor(String username,String password,String firstname,String lastname,String contactno,String gender,
			String year_range,String email,String education,String city,String state,String category){  
		try {       
			PreparedStatement ps=con.prepareStatement(  
					"insert into actor_preface(user_name,first_name,last_name,contact_info,gender,year_range,email,education,city,state,category) values (?,?,?,?,?,?,?,?,?,?,?)");   
			ps.setString(1,username);  
			ps.setString(2,firstname);
			ps.setString(3,lastname);  
			ps.setString(4,contactno);
			ps.setString(5,gender);
			ps.setString(6,year_range);  
			ps.setString(7,email);
			ps.setString(8,education);
			ps.setString(9,city);
			ps.setString(10,state);  
			ps.setString(11,category);
			int i = ps.executeUpdate();
			
			if(i>0){
				ps = con.prepareStatement("select actor_id from actor_preface where user_name=?");   
				ps.setString(1,username);  
				ResultSet rs = ps.executeQuery();
			      
				if(rs.next()){
					ps=con.prepareStatement("insert into login(user_id,user_name,user_password,type) values (?,?,?,?)");   
					ps.setInt(1,rs.getInt("actor_id"));  
					ps.setString(2,username);
					ps.setString(3,password);
					ps.setString(4,"actor");
					int j = ps.executeUpdate();
				if(j>0) 
					return true;
			}
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		return false;
	}
	
	public boolean addNewEmployer(String username,String password,String cmpname,String contactname,String contactno,String email,String city,String state,String category){  
		try {       
			PreparedStatement ps = con.prepareStatement(  
					"insert into employer(user_name,company_name,contact_name,contact_info,email,city,state,category) values (?,?,?,?,?,?,?,?)");
			ps.setString(1,username);
			ps.setString(2,cmpname);
			ps.setString(3,contactname);  
			ps.setString(4,contactno);  
			ps.setString(5,email);
			ps.setString(6,city);
			ps.setString(7,state);  
			ps.setString(8,category);
			
			int i = ps.executeUpdate();
			if(i>0){
				ps = con.prepareStatement("select employer_id from employer where user_name=?");   
				ps.setString(1,username); 
					
				ResultSet rs = ps.executeQuery();      
				if(rs.next()){
					ps = con.prepareStatement("insert into user(user_id,user_name, user_password,user_type_name) values (?,?,?,?)");   
					ps.setInt(1,rs.getInt("employer_id"));  
					ps.setString(2,username);
					ps.setString(3,password);
					ps.setString(4,"employer");
						
					int j = ps.executeUpdate();
					if(j>0) 
						return true;
				}
			}
		}
		catch(Exception e){
			System.out.println(e);
		}  
		return false;
	}
}
