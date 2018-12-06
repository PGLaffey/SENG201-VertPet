package vertpet.foods;

public class Berries extends Food {

	/**
	 * Initializes a food of type Berries.
	 * @see Food
	 */
	public Berries() {
		adjustHunger = -35.0;
		adjustThirst = -20.0;
		cost = 8.55;
		name = "Berries";
	}
}
