package ChainOfResponsibilities;

public class ATMWithdrawal {
	
	protected static PaperCurrencyDispenser hundredDispenser = new HundredDispenser();
	protected static PaperCurrencyDispenser fiftyDispenser = new FiftyDispenser();
	protected static PaperCurrencyDispenser twentyDispenser = new TwentyDispenser();
	protected static PaperCurrencyDispenser dispenserChain;
	
	 static {
		 hundredDispenser.setNextDispenser(fiftyDispenser);
		 fiftyDispenser.setNextDispenser(twentyDispenser);
		 dispenserChain = hundredDispenser;
	 }
	 
	 public static void withdraw(PaperCurrency currency) {
		 if (currency != null) {
			 dispenserChain.dispense(currency);
		 }
	 }

}
