package vertpet.foods;

public class CookedMeat extends Food {

	/**
	 * Initializes a food of type CookedMeat.
	 * @see Food
	 */
	public CookedMeat() {
		adjustHunger = -90.0;
		cost = 17.86;
		name = "CookedMeat";
	}
}
