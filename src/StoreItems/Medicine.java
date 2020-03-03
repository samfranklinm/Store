package StoreItems;

public class Medicine extends StoreItem implements Taxable , Expiration {

	public Medicine(String foodName, String brandName, double price, boolean restriction) {
		super(foodName, brandName, price, restriction);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean doesExpire() { //Do medicines expire? Yes, different medicines expire at different rates/dates
		return true;
	}

	@Override
	public String toString() {
		String label ="Medicine Name: " + foodName 
				+ "\nBrand Name: " + brandName
				+ "\nPrice: $" + price
				+ "\nTax Amount: $" + (Taxable.taxRate * price)
				+ "\nTotal Price: $" + applyTax()
				+ "\nRestiction: " + restriction
				+ "\n\n";
		return label;
}

	@Override
	public void printTaxRates() {
		System.out.println("Tax rate for " + foodName + ": " + (Taxable.taxRate * 1));
		
	}

}

