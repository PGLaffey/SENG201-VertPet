package vertpet.pets;

public class Bird extends Pet {

	/**
	 * Initializes a pet of species Bird.
	 * @param petName The name that will be assigned to the pet.
	 * @see Pet
	 */
	public Bird(String petName) {
		super(petName);
		description = super.readDescription("$B$");
		species = "Bird";
		likes = super.readLikes("$C$", "Likes");
		dislikes = super.readLikes("$C$", "Dislikes");
		poisons = super.readLikes("$C$", "Poisons");
		toyUse = 10;
	}
}
