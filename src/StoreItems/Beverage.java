package StoreItems;

public class Beverage extends StoreItem{


	public static final Beverage ContainerType = null;
	static final String GLASS = "Glass";
	static final String CARDBOARD = "Cardboard";
	static final String ALUMINUM = "Aluminum";
	static final String PLASTIC = "Plastic";
	
	public Beverage(String foodName, String brandName, double price, boolean restriction, String containerType) {
		super(foodName, brandName, price, restriction, containerType);
	}
	
	public Beverage(String foodName, String brandName, double price, String containerType) {
		super(foodName, brandName, price);		
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

	public void printTaxRates() {
		System.out.println ("Tax do not apply to this item");
	}
	
	
	public boolean doesExpire() {
		return true;
	}
	
}




