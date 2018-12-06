package vertpet.pets;

public class Rabbit extends Pet {
	
	/**
	 * Initializes a pet of species Rabbit.
	 * @param petName The name that will be assigned to the pet.
	 * @see Pet
	 */
	public Rabbit(String petName) {
		super(petName);
		description = super.readDescription("$R$");
		species = "Rabbit";
		likes = super.readLikes("$C$", "Likes");
		dislikes = super.readLikes("$C$", "Dislikes");
		poisons = super.readLikes("$C$", "Poisons");
		dailyHunger = 15.0;
		dailyThirst = 12.5;
		toyUse = 20;
	}
}
