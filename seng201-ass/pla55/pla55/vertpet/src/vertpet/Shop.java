package vertpet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import vertpet.foods.*;
import vertpet.toys.*;

public class Shop {

	private ArrayList<Toy> toyInv = new ArrayList<Toy>();
	private ArrayList<Food> foodInv = new ArrayList<Food>();
	private Toy[] initialToys = {new TV(), new Laser(), new Laser(), new Football()
			,new Football(), new Mirror(), new Radio(), new RunningWheel(), new RunningWheel()
			,new BouncyBall(), new BouncyBall()};
	private Food[] initialFood = {new Alcohol(), new Berries(), new Berries()
			, new Berries(), new Carrot(), new Carrot(), new Chocolate(), new Chocolate()
			, new CookedMeat(), new CookedMeat(), new CookedMeat(), new Juice(), new Milk()
			, new Kibble(), new Medicine(), new Medicine(), new Medicine(), new Milk()
			, new Penuts(), new Penuts(), new RawMeat(), new RawMeat(), new Seed(), new Seed()
			, new Seed(), new Water(), new Water(), new Water(), new Water(), new Water()};
	private Toy[] allToys = {new Football(), new Laser(), new TV(), new BouncyBall(), new Mirror()
			, new Radio(), new RunningWheel()};
	private Food[] allFood = {new Alcohol(), new Berries(), new Carrot(), new Chocolate()
			, new CookedMeat(), new Juice(), new Kibble(), new Milk()
			, new Penuts(), new RawMeat(), new Seed(), new Water(), new Medicine()};
	
	/**
	 * Initializes a shop.
	 */
	public Shop(){
		toyInv.addAll(Arrays.asList(initialToys));
		foodInv.addAll(Arrays.asList(initialFood));
	}
	
	/**
	 * Return an array of all possible food in the shop. 
	 * @return An array of all possible food in the shop.
	 */
	public Food[] getAllFood(){
		return allFood;
	}
	
	/**
	 * Returns an array of all possible toys in the shop.
	 * @return An array of all possible toys in the shop.
	 */
	public Toy[] getAllToys(){
		return allToys;
	}
	
	/**
	 * Checks if a food or toy is in stock of the shop.
	 * @param item The toy or food to check.
	 * @return True if food or toy is in stokc. False otherwise.
	 */
	public boolean inStock(Object item){
		int counter = 0;
		if (item instanceof Food){
			Food food = (Food)item;
			while (counter < foodInv.size()){
				if (foodInv.get(counter).getName().equals(food.getName())){
					return true;
				}
				counter = counter + 1;
			}
		}
		else if (item instanceof Toy){
			Toy toy = (Toy)item;
			while (counter < toyInv.size()){
				if (toyInv.get(counter).getName().equals(toy.getName())){
					return true;
				}
				counter = counter + 1;
			}
		}
		return false;
	}
	
	/**
	 * Simulates selling an item and removes it from the shops inventory.
	 * @param item A food or toy that is being sold.
	 */
	public void soldItem(Object item){
		boolean found = false;
		int count = 0;
		if (item instanceof Food){
			Food food = (Food)item;
			while (!found){
				if (food.getName().equals(foodInv.get(count).getName())){
					found = true;
					foodInv.remove(foodInv.get(count));
				}
				count = count + 1;
			}
		}
		else if (item instanceof Toy){
			Toy toy = (Toy)item;
			while (!found){
				if (toy.getName().equals(toyInv.get(count).getName())){
					found = true;
					toyInv.remove(toyInv.get(count));
				}
				count = count + 1;
			}
		}
	}
	
	/**
	 * Returns ArrayList of shops current food stock.
	 * @return ArrayList of shops current food stock.
	 */
	public ArrayList<Food> getFoodStock(){
		return foodInv;
	}
	
	/**
	 * Returns ArrayList of shops current food stock.
	 * @return ArrayList of shops current food stock.
	 */
	public ArrayList<Toy> getToyStock(){
		return toyInv;
	}
	
	/**
	 * Returns formatted String of shops stock.
	 * @return formatted String of shops stock.
	 */
	public String getStock(){
		String output = "Item's we have in stock:\n\n";
		int count = 0;
		ArrayList<String> items = new ArrayList<String>();
		ArrayList<String> itemsCost = new ArrayList<String>();
		ArrayList<String> allItems = new ArrayList<String>();
		Food food = new Food();
		Toy toy = new Toy();
		while (count < foodInv.size()){
			if (!items.contains(foodInv.get(count).getName())){
				food = foodInv.get(count);
				items.add(food.getName());
				itemsCost.add(Double.toString(food.getCost()));
			}
			allItems.add(foodInv.get(count).getName());
			count = count + 1;
		}
		count = 0;
		while (count < toyInv.size()){
			if (!items.contains(toyInv.get(count).getName())){
				toy = toyInv.get(count);
				items.add(toy.getName());
				itemsCost.add(Double.toString(toy.getCost()));
			}
			allItems.add(toyInv.get(count).getName());
			count = count + 1;
		}
		count = 0;
		while (count < items.size()){
			output = output+items.get(count)+" x"+Collections.frequency(allItems, items.get(count))
			+" for $"+itemsCost.get(count)+" each.\n";
			count = count + 1;
		}
		return output;
	}
	
	/**
	 * Restocks the shop if it is low on toys or food.
	 */
	public void restock(){
		if (toyInv.size() < 7){
			toyInv.addAll(Arrays.asList(initialToys));
		}
		if (foodInv.size() < 15){
			foodInv.addAll(Arrays.asList(initialFood));
		}
	}
}
