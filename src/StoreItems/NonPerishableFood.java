package StoreItems;

public class NonPerishableFood extends StoreItem {
	
	int weight;

	public NonPerishableFood(String foodName, String brandName, double price, int weight) {
		super(foodName, brandName, price);
		this.weight = weight;
	}
	
	@Override
	public boolean doesExpire() { //Do non-perishable foods expire? Nope, they are non-perishable for a reason :)
		return false;
	}
	
	public void setWeight(int weight) { //set weight for the food
		this.weight = weight;
	}
	
	public int getWeight() { //retrieve weight for the food
		return weight;
	}

}
