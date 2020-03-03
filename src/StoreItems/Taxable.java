package StoreItems;

import java.text.DecimalFormat;

//Anything other than food, open alcoholic beverages, etc are taxable
public interface Taxable{
	
	final double taxRate = 0.09; // default sale tax rate is 9% on items that are taxable
	
    double applyTax();
	
	void printTaxRates();
	
}
