package vertpet.foods;

public class Kibble extends Food {

	/**
	 * Initializes a food of type Kibble.
	 * @see Food
	 */
	public Kibble() {
		adjustHunger = -60.0;
		adjustThirst = 10.0;
		cost = 8.30;
		name = "Kibble";
	}
}
