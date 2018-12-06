package vertpet.toys;

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
public class Toy {
	protected double cost = 0.0;
	protected String name = "Toy";
	protected double adjustHappiness = 0.0;
	protected double adjustHunger = 0.0;
	protected double adjustThirst = 0.0;
	protected double adjustTiredness = 0.0;
	protected double durability = 0.0;
	
	/**
	 * Returns double of the toys remaining durability.
	 * @return Double of the toys remaining durability.
	 */
	public double getDurability(){
		return durability;
	}
	
	/**
	 * Lowers the durability of a toy by the amount durUse.
	 * @param durUse Amount to reduce durability of toy by.
	 */
	public void useToy(double durUse){
		durability = durability - durUse;
	}

	/**
	 * Returns the amount the toy adjusts happiness by.
	 * @return Double amount that the toy adjusts happiness by.
	 */
	public double getAdjustHappiness(){
		return adjustHappiness;
	}
	
	/**
	 * Returns the amount the toy adjusts hunger by.
	 * @return Double amount that the toy adjusts hunger by.
	 */
	public double getAdjustHunger(){
		return adjustHunger;
	}
	
	/**
	 * Returns the amount the toy adjusts thirst by.
	 * @return Double amount that the toy adjusts thirst by.
	 */
	public double getAdjustThirst(){
		return adjustThirst;
	}
	
	/**
	 * Returns the amount the toy adjusts tiredness by.
	 * @return Double amount that the toy adjusts tiredness by.
	 */
	public double getAdjustTiredness(){
		return adjustTiredness;
	}
	
	/**
	 * Returns the amount the toy costs.
	 * @return Double amount that the toy costs.
	 */
	public double getCost(){
		return cost;
	}
	
	/**
	 * Returns the name of the toy as a String.
	 * @return Returns the name of the toy as a String.
	 */
	public String getName(){
		return name;
	}
	
	/**
	 * reads in the description of the toy from the file desctipt.txt and returns it.
	 * @param type The type of toy to return the description of.
	 * @return The description of the toy as a string. 
	 */
	public String readDescription(String type){
		String filename = System.getProperty("user.dir")+"/"+System.getProperty("java.class.path")+"/descript";
		InputStream file = Toy.class.getResourceAsStream("descript");
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
