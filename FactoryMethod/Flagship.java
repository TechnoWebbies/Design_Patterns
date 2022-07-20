package FactoryMethod;

public class Flagship extends PriceRangePackage{

	@Override
	protected void createRangePackage() {
		devices.add(new Apple());
		
	}

}
