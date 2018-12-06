package vertpet.pets;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * @author PGLaffey
 */
public class Pet {
	private String name;
	private double tiredness = 10.0;
	private double hunger = 20.0;
	private double thirst = 20.0;
	private double happiness = 50.0;
	private double bladder = 20.0;
	protected ArrayList<String> likes = new ArrayList<String>();
	protected ArrayList<String> dislikes = new ArrayList<String>();
	protected ArrayList<String> poisons = new ArrayList<String>();
	protected String species = "Undefined";
	protected String description = "Undefined";
	protected double dailyTiredness = 15.0;
	protected double dailyHunger = 12.5;
	protected double dailyThirst = 15.0;
	protected double dailyHappiness = -7.5;
	protected double dailyBladder = 15.0;
	private double health = 100;
	private boolean sick = false;
	protected double toyUse = 0.0;
	
	/**
	 * Initializes a standard pet. All pets start being 10% Tired, 20% Hungry, 50% Happy and bladder 20% full.
	 * @param petName The name that will be assigned to the pet.
	 */
	public Pet(String petName){
		name = petName;
	}
	
	/**
	 * returns how much durability a pet uses by playing with a toy
	 * @return Double value of durability used by pet playing with a toy
	 */
	public double getToyUse(){
		return toyUse;
	}

	/**
	 * Adjusts the pets health by the amount entered. If health is above 100, it is set to 100
	 * @param amount The amount the pets health is changed by
	 */
	public void adjustHealth(double amount){
		health = health + amount;
		if (health > 100){
			health = 100;
		}
	}

	/**
	 * returns the health of the pet
	 * @return Double value of pets health
	 */
	public double getHealth(){
		return health;
	}

	/**
	 * Does the adjustments to the pets stats for one time period passed.
	 */
	public void doDailyAdjustments(){
		adjustTiredness(dailyTiredness + Math.round(Math.random()*6));
		adjustHunger(dailyHunger + Math.round(Math.random()*6));
		adjustThirst(dailyThirst + Math.round(Math.random()*7.5));
		adjustHappiness(dailyHappiness - Math.round(Math.random()*6));
		adjustBladder(dailyBladder + Math.round(Math.random()*11));
		double sickChance = (tiredness+hunger+thirst+(100-happiness)+bladder+(100-health))/1000;
		if (sickChance > Math.random() && !sick){
			sick = true;
			System.out.println(name+" is now sick.");
		}
		else if (sick){
			adjustTiredness(Math.round(Math.random()*11));
			adjustHunger(Math.round(Math.random()*11));
			adjustThirst(Math.round(Math.random()*16));
			adjustHappiness(- Math.round(Math.random()*11));
			adjustBladder(Math.round(Math.random()*16));
			adjustHealth(-5.5);
			double cureChance = (300 - tiredness+hunger+thirst)/1000;
			if (cureChance > Math.random()){
				sick = false;
				System.out.println(name+" is feeling better and no longer sick.");
			}
		}
		if (hunger > 85){
			happiness = happiness - 10;
			health = health - 5;
		}
		if (thirst > 85){
			happiness = happiness - 10;
			health = health - 5;
		}		
		if (tiredness > 90){
			happiness = happiness - 10;
			health = health - 5;
		}
		if (happiness < 10){
			health = health - 5;
		}
		if (hunger < 10){
			happiness = happiness + 2.5;
			health = health + 2.5;
		}
		if (thirst < 10){
			happiness = happiness +2.5;
			health = health + 2.5;
		}		
		if (tiredness < 10){
			happiness = happiness + 2.5;
			health = health + 2.5;
		}
		if (happiness > 85){
			health = health + 2.5;
		}
		if (bladder > 95){
			health = health - 15;
			happiness = happiness - 15;
		}
	}

	/**
	 * returns if the pet is sick or not 
	 * @return True if the pet is sick
	 */
	public boolean getSick(){
		return sick;
	}

	/**
	 * Cures a pet if it is sick
	 * @param cured if true the pet is no longer sick.
	 */
	public void isCured(boolean cured){
		if (cured){
			sick = false;
		}
	}

	/**
	 * Returns a list of what the pet dislikes.
	 * @return ArrayList representation of pets dislikes.
	 */
	public ArrayList<String> getDislikes(){
		return dislikes;
	}

	/**
	 * Returns a list of what the pet likes.
	 * @return ArrayList representation of the pets likes.
	 */
	public ArrayList<String> getLikes(){
		return likes;
	}

	/**
	 * Returns a list of poisons of the pet.
	 * @return ArrayList representation of pets poisons.
	 */
	public ArrayList<String> getPoisons(){
		return poisons;
	}
	
	/**
	 * Returns the tiredness percentage of a pet as a string.
	 * @return Double representation of pets tiredness as a percentage.  
	 */	
	public double getTiredness(){
		return tiredness;
	}

	/**
	 * Returns the name of a pet as a string.
	 * @return String representation of pets name.  
	 */
	public String getName(){
		return name;
	}

	/**
	 * Returns the species of the pet.
	 * @return Species of pet
	 */
	public String getSpecies(){
		return species;
	}

	/**
	 * Returns the description of the pets species.
	 * @return Description of pets species.
	 */
	public String getDescription(){
		return description;
	}

	/**
	 * Returns the hunger percentage of a pet as a string.
	 * @return Double representation of pets hunger as a percentage.  
	 */
	public double getHunger(){
		return hunger;
	}

	/**
	 * Returns the hunger percentage of a pet as a string.
	 * @return Double representation of pets hunger as a percentage.  
	 */
	public double getThirst(){
		return thirst;
	}	

	/**
	 * Returns the happiness percentage of a pet as a string.
	 * @return Double representation of pets happiness as a percentage.  
	 */
	public double getHappiness(){
		return happiness;
	}

	/**
	 * Returns how full a pets bladder is as a string.
	 * @return Double representation of how full a pets bladder is as a percentage.  
	 */
	public double getBladder(){
		return bladder;
	}

	/**
	 * Prints a summary of the pet. This includes calls to getName(), getTiredness(),
	 * getHunger(), getThirst, getHappiness() and getBladder().  
	 */
	public void getStats(){
		String sickValue = " not ";
		if (sick){
			sickValue = " ";
		}
		System.out.print("Stats for " + getName() + ": \n"
				+ getTiredness() + "% tired\n"
				+ getHunger() + "% hungry\n"
				+ getThirst() + "% thirsty\n"
				+ getHappiness() + "% happy\n"
				+ "Bladder is " + getBladder() + "% full\n"
				+ getName() + " is" + sickValue + "sick.\n\n");	
	}
	
	/**
	 * Adjusts the pets hunger by the amount entered into the function.
	 * @param amount The amount the hunger of the pet is to be adjusted by. Negative value to decrease. If hunger is above 100 or below 0 it is set to 100 or 0 respectively.
	 */
	public void adjustHunger(double amount){
		hunger += amount;
		if (hunger > 100){
			hunger = 100;
		}
		else if (hunger < 0){
			hunger = 0;
		}
	}

	/**
	 * Adjusts the pets thirst by the amount entered into the function.
	 * @param amount The amount the hunger of the pet is to be adjusted by. Negative value to decrease. If thirst is above 100 or below 0 it is set to 100 or 0 respectively.
	 */
	public void adjustThirst(double amount){
		thirst += amount;
		if (thirst > 100){
			thirst = 100;
		}
		else if (thirst < 0){
			thirst = 0;
		}
	}

	/**
	 * Adjusts the pets happiness by the amount entered into the function.
	 * @param amount The amount the happiness of the pet is to be adjusted by. Negative value to decrease. If happiness is above 100 or below 0 it is set to 100 or 0 respectively.
	 */
	public void adjustHappiness(double amount){
		happiness += amount;
		if (happiness > 100){
			happiness = 100;
		}
		else if (happiness < 0){
			happiness = 0;
		}
	}

	/**
	 * Adjusts the pets tiredness by the amount entered into the function.
	 * @param amount The amount the tiredness of the pet is to be adjusted by. Negative value to decrease. If tiredness is above 100 or below 0 it is set to 100 or 0 respectively.
	 */
	public void adjustTiredness(double amount){
		tiredness += amount;
		if (tiredness > 100){
			tiredness = 100;
		}
		else if (tiredness < 0){
			tiredness = 0;
		}
	}

	/**
	 * Adjusts the pets bladder by the amount entered into the function.
	 * @param amount The amount the bladder of the pet is to be adjusted by. Negative value to decrease. If bladder is above 100 or below 0 it is set to 100 or 0 respectively.
	 */
	public void adjustBladder(double amount){
		bladder += amount;
		if (bladder > 100){
			bladder = 100;
		}
		else if (bladder < 0){
			bladder = 0;
		}
	}
	
	/**
	 * Sets the pets bladder to 5% full
	 */
	public void goToilet(){
		bladder = 5;
	}
	
	/**
	 * reads in the description of the pet from the file desctipt.txt and returns it.
	 * @param type The type of pet to return the description of.
	 * @return The description of the pet as a string. 
	 */
	public String readDescription(String type){
		String filename = System.getProperty("user.dir")+"/"+System.getProperty("java.class.path")+"/descript";
		InputStream file = Pet.class.getResourceAsStream("descript");
		filename = filename.replace("\\", "/");
		BufferedReader reader;
		try {
			reader = new BufferedReader(new InputStreamReader(file));
			String descript = "";
			String checkDigit = "";
			boolean done = false;
			int letter = reader.read();
			while (letter != -1 && ! done){
				checkDigit += Character.toString((char)letter);
				if (checkDigit.length() > 3){
					checkDigit = checkDigit.substring(1);
				}
				if (checkDigit.equals(type)){
					letter = reader.read();
					while (! (Character.toString((char)letter).equals("#"))){
						descript += (char)letter;
						letter = reader.read();
					done = true;
					}
				}
				letter = reader.read();	
			}
			file.close();
			reader.close();
			return descript;			
		} catch (FileNotFoundException e) {
			System.out.println("Error: File "+filename+" not found!");
			return "Error";
		} catch (IOException e) {
			System.out.println("Error: Error reading file "+filename);
			return "Error";
			}
		}

	/**
	 * Reads in the description of the pet from the file desctipt.txt and returns it.
	 * @param type The type of pet to return the likes, dislikes and poisons of.
	 * @return The likes, dislikes and poisons of the pet as a string. 
	 */
	public String getAllLikes(String type){
		String output = "Likes: ";
		ArrayList<String> likes = readLikes(type, "Likes");
		ArrayList<String> dislikes = readLikes(type, "Dislikes");
		ArrayList<String> poisons = readLikes(type, "Poisons");
		int count = 0;
		while (count < likes.size()){
			output = output + likes.get(count) + " ";
			count = count + 1;
		}
		output = output +"\nDislikes: ";
		count = 0;
		while (count < dislikes.size()){
			output = output + dislikes.get(count) + " ";
			count = count + 1;
		}
		output = output +"\nPoisons: ";
		count = 0;
		while (count < poisons.size()){
			output = output + poisons.get(count) + " ";
			count = count + 1;
		}
		return output + "\n";
	}

	/**
	 * reads in the likes, dislikes or poisons of the pet from the relative file and returns it in an Array List.
	 * @param type The type of pet to return the description of.
	 * @param preference Determines whether the function gathers the likes, dislikes or poisons of the pet.
	 * @return The likes, dislikes or poisons of the pet in a ArrayList. 
	 */
	protected ArrayList<String> readLikes(String type, String preference){
		BufferedReader reader;
		String filename = System.getProperty("user.dir")+"/"+System.getProperty("java.class.path");
		InputStream file = null;
		if (preference.equals("Likes")){
			filename = filename + "/likes";
			file = Pet.class.getResourceAsStream("likes");
		}
		else if (preference.equals("Dislikes")){
			filename = filename + "/dislikes";
			file = Pet.class.getResourceAsStream("dislikes");
		}
		else if (preference.equals("Poisons")){
			filename = filename + "/poisons";
			file = Pet.class.getResourceAsStream("poisons");
		}
		filename = filename.replace("\\", "/");
		ArrayList<String> likes = new ArrayList<String>();
		try {
			reader = new BufferedReader(new InputStreamReader(file));
			String checkDigit = "";
			String word = "";
			boolean done = false;
			int letter = reader.read();
			while (letter != -1 && ! done){
				checkDigit += Character.toString((char)letter);
				if (checkDigit.length() > 3){
					checkDigit = checkDigit.substring(1);
				}
				if (checkDigit.equals(type)){
					letter = reader.read();
					while (! (Character.toString((char)letter).equals("#"))){
						word += (char)letter;
						letter = reader.read();
						if ((Character.toString((char)letter).equals(" "))){
							likes.add(word);
							word = "";
							letter = reader.read();
						}
					done = true;
					}
				}
				letter = reader.read();	
			}
			file.close();
			reader.close();
			return likes;			
		} catch (FileNotFoundException e) {
			System.out.println("Error: File "+filename+" not found!");
			likes.add("Error Reading "+preference+" for "+type);
			return likes;
		} catch (IOException e) {
			System.out.println("Error: Error reading file "+filename);
			likes.add("Error Reading "+preference+" for "+type);
			return likes;
			}
		}
}
