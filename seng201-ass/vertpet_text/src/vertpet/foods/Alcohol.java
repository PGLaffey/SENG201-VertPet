package vertpet.foods;

public class Alcohol extends Food {

	/**
	 * Initializes a food of type Alcohol.
	 * @see Food
	 */
	public Alcohol() {
		adjustHunger = 10.0;
		adjustThirst = -5.0;
		adjustBladder = 15.0;
		adjustHappiness = 25.0;
		cost = 16.85;
		name = "Alcohol";
	}
}
