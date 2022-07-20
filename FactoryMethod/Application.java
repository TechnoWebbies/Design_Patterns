package FactoryMethod;

public class Application {

	public static void main(String[] args) {
		
		PriceRangePackage aPackage=PriceRangeFactory.createRangePackage(RangeCode.lowBudget);
		System.out.println(aPackage);
		
		PriceRangePackage aPackage1=PriceRangeFactory.createRangePackage(RangeCode.Midrange);
		System.out.println(aPackage1);
		
		PriceRangePackage aPackage2=PriceRangeFactory.createRangePackage(RangeCode.Flagship);
		System.out.println(aPackage2);
		

	}

}
