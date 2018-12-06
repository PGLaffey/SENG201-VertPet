package vertpet;

import java.util.ArrayList;

import vertpet.foods.*;
import vertpet.pets.*;
import vertpet.toys.Toy;

/**
 * 
 * @author PGLaffey
 *
 */
public class Player {

	private ArrayList<Pet> pets = new ArrayList<Pet>();
	private ArrayList<Pet> deadPets = new ArrayList<Pet>();
	private ArrayList<Food> foodInv = new ArrayList<Food>();
	private ArrayList<Toy> toyInv = new ArrayList<Toy>();
	private double money = 22.25;
	private String name;
	
	
	/**
	 * Initializes a Player.
	 * @param chosenName The name that will be assigned to the player.
	 */
	public Player(String chosenName){
		name = chosenName;
	}
	
	/**
	 * Adds a Pet to the players ArrayList of dead pets.
	 * @param pet The Pet to be added to the players dead pets. 
	 */
	public void addDeadPet(Pet pet){
		System.out.println(name+" your pet "+pet.getName()+" died.");
		pets.remove(pet);
		deadPets.add(pet);
	}
	
	/**
	 * Returns ArrayList of a players dead pets.
	 * @return ArrayList of a players dead pets.
	 */
	public ArrayList<Pet> getDeadPets(){
		return deadPets;
	}
	
	/**
	 * Sets the players name to chosenName.
	 * @param chosenName String to set the players name to.
	 */
	public void setName(String chosenName){
		name = chosenName;
	}
	
	/**
	 * Returns the players name as String.
	 * @return The players name as String.
	 */
	public String getName(){
		return name;
	}
	
	/**
	 * Returns the players money as double.
	 * @return The players money as double.
	 */
	public double getMoney(){
		return money;
	}
	
	/**
	 * Adjust the amount of money a player has.
	 * @param amount The amount of money to be adjusted by.
	 */
	public void adjustMoney(double amount){
		money = money + amount;
	}
	
	/**
	 * Adds a pet to the player if the player does not already have a pet by that name.
	 * @param type The species of the pet to be added.
	 * @param name The name of the pet to be added.
	 */
	public void addPet(String type, String name){
		if (pets.size() < 3){
			type = type.toLowerCase();
			Pet pet = new Pet("");
			if (type.equals("bird")){pet = new Bird(name);}
			else if (type.equals("cat")){pet = new Cat(name);}
			else if (type.equals("dog")){pet = new Dog(name);}
			else if (type.equals("elephant")){pet = new Elephant(name);}
			else if (type.equals("human")){pet = new Human(name);}
			else if (type.equals("mouse")){pet = new Mouse(name);}
			else if (type.equals("rabbit")){pet = new Rabbit(name);}
			else{System.out.println("Sorry, "+type+" is not a valid species.");}
			pets.add(pet);
			if (pet.getName().equals("")){pets.remove(pets.size()-1);}
			else{System.out.println("A "+type+" named "+name+" was added to "+getName()+"'s pets.");}
		}
		else{
			System.out.println("Sorry a player can only have three pets.");
		}
	}
	
	/**
	 * Returns a String of the players pets.
	 * @return String of the players pets.
	 */
	public String stringOfPets(){
		String output = "";
		int petCount = 0;
		while (petCount < pets.size()){
			output = output + "A " + pets.get(petCount).getSpecies()
					+" named "+pets.get(petCount).getName() +"\n";
			petCount = petCount + 1;
		}
		return output;
	}
	
	/**
	 * Returns ArrayList of the players pets.
	 * @return ArrayList of the players pets.
	 */
	public ArrayList<Pet> getPets(){
		return pets;
	}
	
	/**
	 * Returns ArrayList of the players toys.
	 * @return ArrayList of the players toys.
	 */
	public ArrayList<Toy> getToyInv(){
		return toyInv;
	}
	
	/**
	 * Adds a toy to the players inventory.
	 * @param toy The toy to be added.
	 */
	public void addToy(Toy toy){
		toyInv.add(toy);
	}
	
	/**
	 * Removes a toy from the players inventory.
	 * @param toy The toy to be removed.
	 */
	public void removeToy(Toy toy){
		toyInv.remove(toy);
	}
	
	/** 
	 * Returns ArrayList of the players food.
	 * @return ArrayList of the players food.
	 */
	public ArrayList<Food> getFoodInv() {
		return foodInv;
	}

	/**
	 * Add a food to the players inventory.
	 * @param food The food to be added.
	 */
	public void addFood(Food food) {
		foodInv.add(food);
	}

	/**
	 * Removes food from the players inventory.
	 * @param food The food to be removed.
	 */
	public void removeFood(Food food){
		foodInv.remove(food);
	}
	
	/**
	 * Removes a pet from the players list of pets.
	 * @param type The species of the pet.
	 * @param name The name of the pet.
	 */
	public void removePet(String type, String name){
		boolean removed = false;
		int count = 0;
		while (!removed && count < pets.size()){
			if (type.equals(pets.get(count).getSpecies().toLowerCase())){
				if (name.equals(pets.get(count).getName())){
					pets.remove(count);
					removed = true;
					System.out.println("A "+type+" named "+name+" was removed from "+getName()+"'s pets.");
				}
			}
			count = count + 1;
		}
		if (!removed){
			System.out.println("You do not have a "+type+" named "+name);
		}
	}
}
