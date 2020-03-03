package StoreItems;

public class PerishableFood extends StoreItem{
	
	int weight;

	public PerishableFood(String foodName, String brandName, double price, int weight) {
		super(foodName, brandName, price);
		this.weight = weight;
	}
	
	@Override
	public boolean doesExpire() { //Do perishable foods expire? Yep, they are perishable for a reason :)
		return true;
	}
	
	public void setWeight(int weight) { //set weight for the food
		this.weight = weight;
	}
	
	public int getWeight() { //retrieve weight for the food
		return weight;
	}
	
}
