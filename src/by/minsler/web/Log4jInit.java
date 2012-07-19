package by.minsler.web;

import javax.servlet.*;
import java.io.File;
import org.apache.log4j.PropertyConfigurator;

public class Log4jInit implements ServletContextListener {

	public void contextInitialized(ServletContextEvent event){
		String logFileProperties = event.getServletContext().getInitParameter("logFileProperties");
		String homeDir=event.getServletContext().getRealPath("/");
		File propertiesFile = new File(homeDir,logFileProperties);
		PropertyConfigurator.configure(propertiesFile.toString());
	}

	public void contextDestroyed(ServletContextEvent event){
		
	}
}