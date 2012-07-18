package by.minsler.model;

import java.util.ArrayList;

public class BeerExpert {
	private ArrayList<String> brands = new ArrayList<String>();

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
		return brands;
	}

}