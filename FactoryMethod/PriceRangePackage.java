package FactoryMethod;

import java.util.ArrayList;
import java.util.List;

public abstract class PriceRangePackage {

	protected List<Devices> devices = new ArrayList<>(); 
		
	public PriceRangePackage() {
		createRangePackage();
	}
	
	protected abstract void createRangePackage();
	
	public String toString() {
		
		return "Price Range {" + " Devices " + devices + "}";
	}
	
}
