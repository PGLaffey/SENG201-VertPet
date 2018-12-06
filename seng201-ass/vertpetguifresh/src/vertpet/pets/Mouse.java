package vertpet.pets;

public class Mouse extends Pet {

	/**
	 * Initializes a pet of species Mouse.
	 * @param petName The name that will be assigned to the pet.
	 * @see Pet
	 */
	public Mouse(String petName) {
		super(petName);
		description = super.readDescription("$M$");
		species = "Mouse";
		likes = super.readLikes("$C$", "Likes");
		dislikes = super.readLikes("$C$", "Dislikes");
		poisons = super.readLikes("$C$", "Poisons");
		dailyHunger = 10.0;
		toyUse = 15;
	}
}
