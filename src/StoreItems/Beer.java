package StoreItems;

public class Beer extends Beverage{
	
	public Beer(String foodName, String brandName, double price, String containerType) {
		super(foodName, brandName, price, containerType);
		this.containerType = containerType;
	}
	
	@Override 
	public boolean doesExpire() { // Does beer expire ? Yes, after a while
		return true;
	}

	@Override
	public String toString() {
		String label ="Beer Name: " + foodName 
				+ "\nBrand Name: " + brandName
				+ "\nPrice: $" + price
				+ "\nContainerType: " + containerType
			    + "\n\n";
		return label;
	}

}