package by.minsler.model;

import java.util.ArrayList;
import org.apache.log4j.Logger;

public class BeerExpert {

	private ArrayList<String> brands = new ArrayList<String>();
	private static Logger logger = Logger.getLogger(BeerExpert.class);

	public ArrayList<String> getBrands(String color){
		if(color.equals("dark")){
			brands.add("Alivaria Porter");
			brands.add("Krynica Porter");
			brands.add("Lidskoe Dark");
		} else if(color.equals("light")){
			brands.add("Zlaty Bazant");
			brands.add("Alivaria Ice");
			brands.add("Giguli");
		}
		logger.info("before return arralyList");
		return brands;
	}

}