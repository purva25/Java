package Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Http_Servlet extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		
		String str1=req.getParameter("n1");
		String str2=req.getParameter("n2");
		
		int num1=Integer.parseInt(str1);
		int num2=Integer.parseInt(str2);
		int result=num1+num2;
		int result1=num1-num2;
		int result2=num1*num2;
		
		
		out.print("<h1>Addition is: "+result+"</h1>");
		out.print("<h1>Substraction is: "+result1+"</h1>");
		out.print("<h1>Multiplication is: "+result2+"</h1>");
		
	}
}
