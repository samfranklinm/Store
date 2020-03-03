package StoreItems;

public class Beverage extends StoreItem{
	
	//Container Types
	public static final Beverage ContainerType = null;
	static final String GLASS = "Glass";
	static final String CARDBOARD = "Cardboard";
	static final String ALUMINUM = "Aluminum";
	static final String PLASTIC = "Plastic";
	
	// Restriction applied on some Beverages
	public Beverage(String foodName, String brandName, double price, boolean restriction, String containerType) {
		super(foodName, brandName, price, restriction, containerType);
	}
	
	// No restriction applied on most Beverages
	public Beverage(String foodName, String brandName, double price, String containerType) {
		super(foodName, brandName, price);		
	}
	
	public boolean doesExpire() { // By default, yes, most beverages would expire
		return true;
	}
	
	
	@Override
	public String toString() {
		String label ="Beverage Name: " + foodName 
				+ "\nBrand Name: " + brandName
				+ "\nPrice: $" + price
				+ "\nRestriction: " + restriction
				+ "\nContainerType: " + containerType
			    + "\n\n";
		return label;
	}
	
}




