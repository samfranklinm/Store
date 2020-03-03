package StoreItems;

public class NonPerishableFood extends StoreItem implements Taxable , Expiration{
	
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

	public void printTaxRates() {
		System.out.println("Tax rate for " + foodName + ": " + (Taxable.taxRate * 1.4));
		
	}

}
