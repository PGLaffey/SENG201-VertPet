package vertpet.pets;

public class Elephant extends Pet {

	/**
	 * Initializes a pet of species Elephant.
	 * @param petName The name that will be assigned to the pet.
	 * @see Pet
	 */
	public Elephant(String petName) {
		super(petName);
		description = super.readDescription("$E$");
		species = "Elephant";
		likes = super.readLikes("$C$", "Likes");
		dislikes = super.readLikes("$C$", "Dislikes");
		poisons = super.readLikes("$C$", "Poisons");
		dailyBladder = 7.5;
		dailyThirst = 10.0;
		dailyHunger = 15.0;
		toyUse = 100;
	}
}
