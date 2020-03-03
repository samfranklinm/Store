package StoreItems;

import java.util.ArrayList;

public abstract class StoreItem implements Comparable<StoreItem>, Expiration, Taxable{
	protected String foodName; 
	protected String brandName;
	protected double price;
	protected boolean restriction;
	protected String containerType;
	
	static ArrayList<StoreItem> inventoryList = new ArrayList<>();
	
	
	public static final double DEFAULT_PRICE = 0.00; // set default price for an item
	
	private static int numOfItemsInStock = 0; // keep track of how many items there are in stock
	
	public StoreItem(String foodName, String brandName) { // default item initializer
		this(foodName, brandName, DEFAULT_PRICE);
	}

	public StoreItem(String foodName, String brandName, double price) { // there can be an items with just item name, brand name and price
		this.foodName = foodName;
		this.brandName = brandName;
		this.price = price;
		numOfItemsInStock++;
	}
	
	public StoreItem(String foodName, String brandName, double price, boolean restriction) { // there can be an items with item name, brand name, price and sometimes with some restriction
		this.foodName = foodName;
		this.brandName = brandName;
		this.price = price;
		this.restriction = restriction;
		numOfItemsInStock++;
	}
	

	public StoreItem(String foodName, String brandName, double price, boolean restriction, String containerType) {
		this.foodName = foodName;
		this.brandName = brandName;
		this.price = price;
		this.restriction = restriction;
		this.containerType = containerType;
		numOfItemsInStock++;
	}

	
	
	public String getFoodName() { // get item name
		return foodName;
	}
	public String getBrandName() { // get brand of the item
		return brandName;
	}
	public double getPrice() { // get the price of the item
		return price;
	}
	
	
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public void setBrandName(String brandName) {
			this.brandName = brandName;
	}
	public void setPrice(double price) {
		if(price >= 0) { // if the items costs more than $0.00 then set it
			this.price = price;
		}else { // if not, it's the default price of $0.00 or simply to say, its free
			this.price = DEFAULT_PRICE;
		}
	}
	
	public static int getNumberOfStoreItems() {
		return numOfItemsInStock;
	}
	
	public boolean doesExpire() { // Default is that an item does NOT expire.
		return false;
	}


	@Override
	public String toString() {
		String label ="Food Name: " + foodName 
				+ "\nBrand Name: " + brandName
				+ "\nPrice: $" + price
				+ "\n\n";
		return label;
}
	
	@Override
	public int compareTo(StoreItem otherItem) {
		int compareResult = this.foodName.compareTo(otherItem.foodName);
		
		if(compareResult == 0) {
			return this.getFoodName().compareTo(otherItem.getFoodName());
		}else return compareResult;
	}
	
}
