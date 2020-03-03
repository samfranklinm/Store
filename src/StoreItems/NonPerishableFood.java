package StoreItems;

public class NonPerishableFood extends StoreItem {
	
	int weight;

	public NonPerishableFood(String foodName, String brandName, double price, int weight) {
		super(foodName, brandName, price);
		this.weight = weight;
	}
	
	@Override
	public boolean doesExpire() {
		return false;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public int getWeight() {
		return weight;
	}

}
