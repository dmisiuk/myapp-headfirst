package by.minsler.web;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import by.minsler.model.Info;

public class BeerParamTest extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<!DOCTYPE html>");
		out.print("<html><head><title>Init Param</title></head><body>");
		String email = getServletConfig().getInitParameter("email");
		Info info = (Info) getServletContext().getAttribute("info");
		String infoemail = info.getEmail();
		out.println("My email is " + email + "<br>");
		out.println("The main email is " + infoemail + " <br>");
		out.println("</body></html>");
	}

}