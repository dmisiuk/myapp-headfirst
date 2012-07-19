package by.minsler.web;

import javax.servlet.*;
import by.minsler.model.Info;

public class InitContextListener implements ServletContextListener {

	public void contextInitialized(ServletContextEvent event){
		ServletContext context = event.getServletContext();
		Info info = new Info(context.getInitParameter("infoemail"));
		context.setAttribute("info", info);
	}

	public void contextDestroyed(ServletContextEvent event){
		
	}
}