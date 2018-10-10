package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dataaccess.AuthDao;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private static AuthDao authDao;  
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
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
        PrintWriter out = response.getWriter();  
		
		String username = request.getParameter("userlogin");
		String password = request.getParameter("passlogin");
		String type = request.getParameter("typelogin");
		 
		authDao = new AuthDao();
		boolean result = authDao.checkUserPass(username,password,type); 
		
		if(result){
			out.println("<script type=\"text/javascript\">");
	        out.println("alert('Login Successfull!')"); 
	        out.println("location='actor/jobseekermain.jsp';");
	        out.println("</script>");
	        
			RequestDispatcher rd = request.getRequestDispatcher("actor/jobseekermain.jsp");  
	        rd.include(request,response);
		}
	}
}
