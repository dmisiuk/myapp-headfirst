package by.minsler.web;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class BeerParamTest extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<!DOCTYPE html>");
		out.print("<html><head><title>Init Param</title></head><body>");
		String email = getServletConfig().getInitParameter("email");
		out.println("My email is " + email);
		out.println("</body></html>");
	}

}