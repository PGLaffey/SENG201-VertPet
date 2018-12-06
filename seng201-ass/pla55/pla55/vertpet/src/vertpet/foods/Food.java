package vertpet.foods;

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
}
