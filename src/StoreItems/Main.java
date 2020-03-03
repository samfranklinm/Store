package StoreItems;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<StoreItem> inventoryList = new ArrayList<>(); // create an inventory list
		
		
		//Add inventory items to the inventory
		inventoryList.add(new PerishableFood("Macintosh Apple","Farmer Tom's", 2.99, 160));
		inventoryList.add(new PerishableFood("Cheddar Cheese", "ByrneDiary", 5.99, 546));
		inventoryList.add(new NonPerishableFood("Crackers", "Ritz", 1.99, 860));
		inventoryList.add(new NonPerishableFood("Crackers", "Saltines", 1.99, 860));
		inventoryList.add(new Beverage("Milk", "Byrne Diary", 5.99, false,
					            Beverage.ContainerType.CARDBOARD));
		inventoryList.add(new Beverage("Juice", "V8", 1.99, false,
								Beverage.ContainerType.GLASS));
		inventoryList.add(new Soda("Diet Pepsi", "PepsiCola", 5.99,
								Beverage.ContainerType.ALUMINUM));
		inventoryList.add(new Soda("Coke Cola", "Coke", 5.99,
				Beverage.ContainerType.ALUMINUM));
		inventoryList.add(new Beer("IPA", "Brewertons", 18.99, 
								Beverage.ContainerType.GLASS));
		inventoryList.add(new Medicine("Cold and Flu", "Sudafed", 8.99, true));
		inventoryList.add(new Medicine("Pain Reliever", "Tylenol", 6.99, false));	
		inventoryList.add(new PersonalCareItem("Shampoo", "Paul Mitchell", 18.99));

		

		System.out.println("\n*****Unsorted Inventory"); //Print all Unsorted Inventory
		for(int i = 0; i < inventoryList.size(); i++) {
			System.out.println(inventoryList.get(i).foodName);
		}
		
		
		System.out.println("\n*****Sorted Inventory");//Print all Sorted Inventory 
		
		Collections.sort(inventoryList);
		for(int i = 0; i < inventoryList.size(); i++) {
			System.out.println(inventoryList.get(i).foodName);
		}
		
		//System.out.println("\n*****Ordering Inventory");// I am not sure what to print here
		//Print all Ordering
		
		System.out.println("\n*****Taxes"); // I am not sure what to print here other than the below
		Taxable.printTaxRates();
		
		
		System.out.println("\n*****Expirations");
			for(int i = 0; i < inventoryList.size(); i++) {
				if(inventoryList.get(i).doesExpire() == true)
					System.out.println(inventoryList.get(i).foodName);
			}
		
		System.out.println("\n*****Aluminum Check"); //Print all items recyclable due to Aluminum
		for(int i = 0; i< inventoryList.size(); i++) {
			if(inventoryList.get(i).containerType == Beverage.ALUMINUM
					|| inventoryList.get(i).containerType == Soda.ALUMINUM
					|| inventoryList.get(i).containerType == Beer.ALUMINUM ) {
				System.out.println(inventoryList.get(i).foodName + " -- " + inventoryList.get(i).containerType + " Container.");
			}
		}
		
		
	}
	
	

}
