package vertpet.foods;

public class Chocolate extends Food {

	/**
	 * Initializes a food of type Chocolate.
	 * @see Food
	 */
	public Chocolate() {
		adjustHunger = -25.0;
		adjustTiredness = -5.0;
		adjustHappiness = 5.0;
		cost = 4.75;
		name = "Chocolate";
	}
}
