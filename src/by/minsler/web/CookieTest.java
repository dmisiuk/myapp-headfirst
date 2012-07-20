package by.minsler.web;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.net.*;
import org.apache.log4j.Logger;


public class CookieTest extends HttpServlet {

	private static Logger logger = Logger.getLogger(CookieTest.class);

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");
		String userName = request.getParameter("userName");
		Cookie cookie  = new Cookie("userName", URLEncoder.encode(userName,"UTF-8"));
		cookie.setMaxAge(60*60);
		response.addCookie(cookie);
		logger.info("Отправка куки: userName - " + userName);
		RequestDispatcher dispatcher  = request.getRequestDispatcher("cookieresult.jsp");
		dispatcher.forward(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		doGet(request,response);
	}
}