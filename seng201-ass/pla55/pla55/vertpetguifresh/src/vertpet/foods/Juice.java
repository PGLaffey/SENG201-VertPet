package vertpet.foods;

public class Juice extends Food {

	/**
	 * Initializes a food of type Juice.
	 * @see Food
	 */
	public Juice() {
		adjustHunger = -5.0;
		adjustThirst = -70.0;
		adjustHappiness = 2.5;
		cost = 6.05;
		name = "Juice";
	}
}
