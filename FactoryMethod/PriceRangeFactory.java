package FactoryMethod;

public class PriceRangeFactory {
	
	public static PriceRangePackage createRangePackage(RangeCode rangeCode) {
		
		switch (rangeCode){
		case lowBudget:
			return new LowBudget();
		case Midrange:
			return new MidRange();
		case Flagship:
			return new Flagship();
		default:
			return null;
		
	}
	
		
	
}
}