package FactoryMethod;

public class MidRange extends PriceRangePackage {

	@Override
	protected void createRangePackage() {
		devices.add(new Samsung());
		
	}

}
