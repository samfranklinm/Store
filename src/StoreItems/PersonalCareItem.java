package StoreItems;

public class PersonalCareItem extends StoreItem implements Taxable, Expiration {

	public PersonalCareItem(String foodName, String brandName, double price) {
		super(foodName, brandName, price);
		// TODO Auto-generated constructor stub
	}
	
	@Override 
	public boolean doesExpire() { //Do Personal Care Items expire?
		return true;
	}
	
	@Override
	public String toString() {
		String label ="Item Name: " + foodName 
				+ "\nBrand Name: " + brandName
				+ "\nPrice: $" + price
				+ "\nTax Amount: $" + (Taxable.taxRate * price)
				+ "\nTotal Price: $" + applyTax()
				+ "\n\n";
		return label;
}

	@Override
	public void printTaxRates() {
		System.out.println("Tax rate for " + foodName + ": " + (Taxable.taxRate * 1.2));
		
	}

}
