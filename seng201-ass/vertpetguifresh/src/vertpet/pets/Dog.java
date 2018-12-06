package vertpet.pets;

public class Dog extends Pet {

	/**
	 * Initializes a pet of species Dog.
	 * @param petName The name that will be assigned to the pet.
	 * @see Pet
	 */
	public Dog(String petName) {
		super(petName);
		description = super.readDescription("$D$");
		species = "Dog";
		likes = super.readLikes("$C$", "Likes");
		dislikes = super.readLikes("$C$", "Dislikes");
		poisons = super.readLikes("$C$", "Poisons");
		dailyHunger = 17.5;
		dailyHappiness = -10.0;
		dailyTiredness = 10.0;
		dailyBladder = 12.5;
		toyUse = 40;
	}

}
