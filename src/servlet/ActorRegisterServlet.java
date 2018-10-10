package servlet;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import dataaccess.AuthDao;

/**
 * Servlet implementation class JskRegisterServlet
 */
@WebServlet("/JskRegisterServlet")
@MultipartConfig 
public class ActorRegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static AuthDao authDao;     
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ActorRegisterServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
          
        String uname = request.getParameter("username");
        String pass = request.getParameter("password");
        String fname = request.getParameter("firstName");
        String lname = request.getParameter("lastName");
        String contactno = request.getParameter("contact");
        String gender = request.getParameter("gender");
        String year = request.getParameter("yearRange");
        String email = request.getParameter("email");
        String education = request.getParameter("education");
        String city = request.getParameter("city");
        String state = request.getParameter("state");
        String category = request.getParameter("category");
        
        authDao = new AuthDao();
        boolean checkusername = authDao.checkActorUserName(uname);
        
        if(checkusername){ 
        	boolean status = authDao.addNewActor(uname,pass,fname,lname,contactno,gender,year,email,education,city,state,category);
            
            if(status){
                try{
                   out.println("<script type=\"text/javascript\">");
                   out.println("alert('Registered Successfully!')"); 
                   out.println("location='login.jsp';");
                   out.println("</script>");
                   RequestDispatcher rd=request.getRequestDispatcher("login.jsp");  
                   rd.include(request,response);
                   } catch (Exception e) {
                	   out.println("Error in file upload <br/> ERROR:" + e.getMessage());
                } finally {
                    if (out != null){
                        out.close();
                    }
                }
            }else{ 
            	out.println("<script type=\"text/javascript\">");
                out.println("alert('Register Error!')"); 
                out.println("location='register.jsp';");
                out.println("</script>");
                RequestDispatcher rd=request.getRequestDispatcher("actorregister.jsp");  
                rd.include(request,response); 
            }
        }else{
        	out.println("<script type=\"text/javascript\">");
            out.println("alert('Username already exists!')"); 
            out.println("location='register.jsp';");
            out.println("</script>");
        	RequestDispatcher rd=request.getRequestDispatcher("actorregister.jsp");  
            rd.include(request,response); 
        }
	}

}
