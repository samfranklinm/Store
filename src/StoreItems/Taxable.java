package StoreItems;

import java.text.DecimalFormat;

//Anything other than food, open alcoholic beverages, etc are taxable
interface Taxable{
	
	final double taxRate = 0.09; // default sale tax rate is 9% on items that are taxable
	
     static double applyTax(double price) { // this function is to apply tax on items and result into a total price of the item
		
	    DecimalFormat twoDecimalPlaces = new DecimalFormat("#.##");
		double taxAmount = Double.valueOf(twoDecimalPlaces.format(taxRate * price));
		double totalPrice =  price + taxAmount;
		totalPrice = Double.valueOf(twoDecimalPlaces.format(totalPrice));
		
		return totalPrice;
	};
	
	public static void printTaxRates() { 
		System.out.println ("Sales tax rate is: " + Taxable.taxRate);
	}
	
}
