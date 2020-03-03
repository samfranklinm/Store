package StoreItems;

public class Soda extends Beverage{

	public Soda(String foodName, String brandName, double price, String containerType) {
		super(foodName, brandName,price, containerType);
		this.containerType = containerType;
	}
	
	@Override
	public boolean doesExpire() { // Do Sodas expire? Yes, after a while
		return true;
	}
	
	@Override
	public String toString() {
		String label ="Soda Name: " + foodName 
				+ "\nBrand Name: " + brandName
				+ "\nPrice: $" + price
				+ "\nTax Amount: $" + (Taxable.taxRate * price)
				+ "\nTotal Price: $" + Taxable.applyTax(price)
				+ "\nContainerType: " + containerType
			    + "\n\n";
		return label;
	}
}
