package vertpet.foods;

public class Water extends Food {

	/**
	 * Initializes a food of type Water.
	 * @see Food
	 */
	public Water() {

		adjustThirst = -75.0;
		cost = 3.99;
		name = "Water";
	}
}
