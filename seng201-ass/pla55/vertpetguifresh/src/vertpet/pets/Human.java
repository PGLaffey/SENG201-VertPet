package vertpet.pets;

public class Human extends Pet {

	/**
	 * Initializes a pet of species Human.
	 * @param petName The name that will be assigned to the pet.
	 * @see Pet
	 */
	public Human(String petName) {
		super(petName);
		description = super.readDescription("$H$");
		species = "Human";
		likes = super.readLikes("$C$", "Likes");
		dislikes = super.readLikes("$C$", "Dislikes");
		poisons = super.readLikes("$C$", "Poisons");
		dailyHappiness = -15.0;
		toyUse = 30;
	}

}
