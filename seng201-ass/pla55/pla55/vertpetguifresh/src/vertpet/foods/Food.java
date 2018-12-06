package vertpet.foods;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


/**
 * 
 * @author PGLaffey
 *
 */
public class Food {
	protected double adjustHunger = 0.0;
	protected double adjustThirst = 0.0;
	protected double adjustHappiness = 0.0;
	protected double adjustTiredness = 0.0;
	protected double adjustBladder = 0.0;
	protected double cost = 0.0;
	protected String name = "Food";

	/**
	 * Returns the amount the food adjusts hunger by.
	 * @return Double amount that the food adjusts hunger by.
	 */
	public double getAdjustHunger() {
		return adjustHunger;
	}

	/**
	 * Returns the amount the food adjusts thirst by.
	 * @return Double amount that the food adjusts thirst by.
	 */
	public double getAdjustThirst() {
		return adjustThirst;
	}

	/**
	 * Returns the amount the food adjusts happiness by.
	 * @return Double amount that the food adjusts happiness by.
	 */
	public double getAdjustHappiness() {
		return adjustHappiness;
	}

	/**
	 * Returns the amount the food adjusts tiredness by.
	 * @return Double amount that the food adjusts tiredness by.
	 */
	public double getAdjustTiredness() {
		return adjustTiredness;
	}

	/**
	 * Returns the amount the food adjusts bladder by.
	 * @return Double amount that the food adjusts bladder by.
	 */
	public double getAdjustBladder() {
		return adjustBladder;
	}

	/**
	 * Returns the amount the food costs.
	 * @return Double amount that the food costs.
	 */
	public double getCost() {
		return cost;
	}
	
	/**
	 * Returns the foods name.
	 * @return String of the foods name.
	 */
	public String getName(){
		return name;
	}
	
	/**
	 * reads in the description of the food from the file desctipt.txt and returns it.
	 * @param type The type of food to return the description of.
	 * @return The description of the food as a string. 
	 */
	public String readDescription(String type){
		String filename = System.getProperty("user.dir")+"/"+System.getProperty("java.class.path")+"/descript";
		InputStream file = Food.class.getResourceAsStream("descript");
		filename = filename.replace("\\", "/");
		BufferedReader reader;
		try {
			reader = new BufferedReader(new InputStreamReader(file));
			String descript = "<html>";
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
			return descript + "</html>";			
		} catch (FileNotFoundException e) {
			System.out.println("Error: File "+filename+" not found!");
			return "Error";
		} catch (IOException e) {
			System.out.println("Error: Error reading file "+filename);
			return "Error";
			}
		}
}
