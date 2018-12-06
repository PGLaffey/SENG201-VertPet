package vertpet.foods;

public class Carrot extends Food {

	/**
	 * Initializes a food of type Carrot.
	 * @see Food
	 */
	public Carrot() {
		adjustHunger = -40.0;
		adjustThirst = -10.0;
		cost = 4.55;
		name = "Carrot";
	}
}
