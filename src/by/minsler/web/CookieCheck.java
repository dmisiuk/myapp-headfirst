package by.minsler.web;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.net.*;

public class CookieCheck extends HttpServlet{

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		Cookie[] cookies = request.getCookies();
		String userName = "unknown";

		if(cookies != null){
			for(int i = 0; i < cookies.length; i++){
				String name = cookies[i].getName();
				if(name.equals("userName")){
					userName = URLDecoder.decode(cookies[i].getValue(),"UTF-8");
					break;
				}
			}
		}

		PrintWriter out = response.getWriter();
		out.println("<html><head><meta charset='utf-8' > </head><body>Ваше имя" + userName + "</body></html>");
	}
}
