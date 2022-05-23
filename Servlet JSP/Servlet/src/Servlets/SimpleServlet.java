package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.servlet.*;

public class SimpleServlet implements Servlet{

	public void destroy() {
		
	}

	public ServletConfig getServletConfig() {
		
		return null;
	}

	public String getServletInfo() {
		
		return null;
	}

	public void init(ServletConfig config) throws ServletException {
		
	}

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("Server Running.......");
		
		PrintWriter out=res.getWriter();
		
		out.print("<html><body>");
		out.print("<h1> User Details</h1>");
		out.print("Name: Riya Sharma<br>User ID: 2048<br>Username:Riya_65<br>Email: riyasharma@gmail.com<br>Date of Birth: 15 Nov 1996<br>Address: Plot no 138, Tilak Nagar, Delhi<br>");
		out.print("</html></body>");
		
	}

}
