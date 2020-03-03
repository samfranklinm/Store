package StoreItems;

import java.text.DecimalFormat;

//Anything other than food, open drink(beer), etc are not taxable
interface Taxable{
	
	final double taxRate = 0.09;
	
     static double applyTax(double price) {
		
	    DecimalFormat twoDecimalPlaces = new DecimalFormat("#.##");
		double taxAmount = Double.valueOf(twoDecimalPlaces.format(taxRate * price));
		double totalPrice =  price + taxAmount;
		totalPrice = Double.valueOf(twoDecimalPlaces.format(totalPrice));
		
		return totalPrice;
	};
	
}
