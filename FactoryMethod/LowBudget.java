package FactoryMethod;

public class LowBudget extends PriceRangePackage {
	
	@Override
	protected void createRangePackage() {
		devices.add( new Oppo());
		
	}
}
