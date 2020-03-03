package StoreItems;

import java.text.DecimalFormat;

public class Soda extends Beverage implements Taxable, Expiration{

	public Soda(String foodName, String brandName, double price, String containerType) {
		super(foodName, brandName,price, containerType);
		this.containerType = containerType;
	}
	
	@Override
	public boolean doesExpire() { // Do Sodas expire? Yes, after a while
		return true;
	}

	public double applyTax(){
		
	    DecimalFormat twoDecimalPlaces = new DecimalFormat("#.##");
		double taxAmount = Double.valueOf(twoDecimalPlaces.format(taxRate * price));
		double totalPrice =  price + taxAmount;
		totalPrice = Double.valueOf(twoDecimalPlaces.format(totalPrice));
		
		return totalPrice;
		
	}
	
	@Override
	public String toString() {
		String label ="Soda Name: " + foodName 
				+ "\nBrand Name: " + brandName
				+ "\nPrice: $" + price
				+ "\nTax Amount: $" + (Taxable.taxRate * price)
				+ "\nTotal Price: $" + applyTax()
				+ "\nContainerType: " + containerType
			    + "\n\n";
		return label;
	}
	
	@Override
	public void printTaxRates(){
		System.out.println("Tax rate for " + foodName + ": " + (Taxable.taxRate * 2));
	}
}
