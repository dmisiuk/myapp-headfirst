package by.minsler.model;

import org.apache.log4j.Logger;

public class Info{
	private static Logger logger = Logger.getLogger(Info.class);

	private String email;

	public Info(String email){
		this.email = email;
		logger.info("created Info instance");
	}

	public String getEmail(){
		logger.info("returned email from Info instance");
		return email;
	}
}