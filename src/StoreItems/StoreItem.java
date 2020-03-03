package StoreItems;

import java.util.ArrayList;

public abstract class StoreItem implements Comparable<StoreItem>, Expiration, Taxable{
	protected String foodName;
	protected String brandName;
	protected double price;
	protected boolean restriction;
	protected String containerType;
	static ArrayList<StoreItem> inventoryList = new ArrayList<>();
	
	
	public static final double DEFAULT_PRICE = 0.00;
	
	private static int numOfStoreItems = 0;
	
	public StoreItem(String foodName, String brandName) {
		this(foodName, brandName, DEFAULT_PRICE);
	}

	public StoreItem(String foodName, String brandName, double price) {
		this.foodName = foodName;
		this.brandName = brandName;
		this.price = price;
		numOfStoreItems++;
	}
	
	public StoreItem(String foodName, String brandName, double price, boolean restriction) {
		this.foodName = foodName;
		this.brandName = brandName;
		this.price = price;
		this.restriction = restriction;
		numOfStoreItems++;
	}
	

	public StoreItem(String foodName, String brandName, double price, boolean restriction, String containerType) {
		this.foodName = foodName;
		this.brandName = brandName;
		this.price = price;
		this.restriction = restriction;
		this.containerType = containerType;
		numOfStoreItems++;
	}

	
	
	public String getFoodName() {
		return foodName;
	}
	public String getBrandName() {
		return brandName;
	}
	public double getPrice() {
		return price;
	}
	
	
	public void setTitle(String foodName) {
		this.foodName = foodName;
	}
	public void setBrandName(String brandName) {
			this.brandName = brandName;
	}
	public void setPrice(double price) {
		if(price >= 0) {
			this.price = price;
		}
	}
	
	public static int getNumberOfStoreItems() {
		return numOfStoreItems;
	}
	
	public boolean doesExpire() {
		System.out.print("\n" + foodName + " expires.\n");
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
