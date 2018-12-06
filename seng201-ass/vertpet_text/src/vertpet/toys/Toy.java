package vertpet.toys;

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
	
}
