package vertpet.pets;

public class Cat extends Pet {

	/**
	 * Initializes a pet of species Cat.
	 * @param petName The name that will be assigned to the pet.
	 * @see Pet
	 */
	public Cat(String petName) {
		super(petName);
		description = super.readDescription("$C$");
		species = "Cat";
		likes = super.readLikes("$C$", "Likes");
		dislikes = super.readLikes("$C$", "Dislikes");
		poisons = super.readLikes("$C$", "Poisons");
		dailyHappiness = -5.0;
		dailyThirst = 20.0;
		dailyBladder = 20.0;
		dailyTiredness = 25.0;
		toyUse = 20;
	}


}
