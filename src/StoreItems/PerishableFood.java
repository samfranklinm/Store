package StoreItems;

public class PerishableFood extends StoreItem{
	
	int weight;

	public PerishableFood(String foodName, String brandName, double price, int weight) {
		super(foodName, brandName, price);
		this.weight = weight;
	}
	
	@Override
	public boolean doesExpire() {
		return true;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public int getWeight() {
		return weight;
	}
	
}
