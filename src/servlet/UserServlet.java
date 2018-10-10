package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dataaccess.DBConnection;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * Servlet implementation class UserManagementServlet
 */
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/json; charset=utf-8");
		PrintWriter out = response.getWriter();
		JSONArray jsonarray = new JSONArray();  
        JSONObject jsonobj = new JSONObject();
        
		try {
			String shopUser = "select * from shop_user";
			Connection conn = DBConnection.getConnection();
			ResultSet rs = DBConnection.execStatement(conn, shopUser);
			while(rs.next()) {
				jsonobj.put("id", rs.getInt(1));  
		        jsonobj.put("shopId", rs.getInt(2));  
		        jsonobj.put("username", rs.getString(3));                           
		        jsonobj.put("password", rs.getString(4)); 
		       jsonarray.add(jsonobj);             
			}
			
			out = response.getWriter();
			out.println(jsonarray);
			
			out.close();
			DBConnection.cleanResource();
		}catch(Exception e) {
			e.printStackTrace();
		}    
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
