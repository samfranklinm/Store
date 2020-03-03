package StoreItems;

public class Medicine extends StoreItem {

	public Medicine(String foodName, String brandName, double price, boolean restriction) {
		super(foodName, brandName, price, restriction);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean doesExpire() {
		return true;
	}

	@Override
	public String toString() {
		String label ="Medicine Name: " + foodName 
				+ "\nBrand Name: " + brandName
				+ "\nPrice: $" + price
				+ "\nTax Amount: $" + (Taxable.taxRate * price)
				+ "\nTotal Price: $" + Taxable.applyTax(price)
				+ "\nRestiction: " + restriction
				+ "\n\n";
		return label;
}

}

