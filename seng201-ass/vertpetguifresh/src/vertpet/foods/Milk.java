package vertpet.foods;

public class Milk extends Food {

	/**
	 * Initializes a food of type Milk.
	 * @see Food
	 */
	public Milk() {
		adjustHunger = -5.0;
		adjustThirst = -65.0;
		cost = 5.50;
		name = "Milk";
	}
}
