package vertpet.foods;

public class RawMeat extends Food {

	/**
	 * Initializes a food of type RawMeat.
	 * @see Food
	 */
	public RawMeat() {
		adjustHunger = -85.0;
		adjustThirst = -10.0;
		cost = 15.35;
		name = "RawMeat";
	}
}
