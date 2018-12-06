package vertpet;

import junit.framework.TestCase;
import vertpet.pets.Cat;
import vertpet.pets.Pet;

public class TestPlayer extends TestCase {

	private Player player = new Player("Test Player");

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testAddDeadPet() {
		player.addPet("cat", "cat");
		Pet pet = player.getPets().get(0);
		player.addDeadPet(pet);
		if (!(player.getDeadPets().get(0) == pet)){
			fail("Pet was not added to dead pets.");
		}
		if (player.getPets().contains(pet)){
			fail("Pet was not removed from alive pets.");
		}
	}

	public void testAddPet() {
		player.addPet("cat","cat");
		Pet pet = player.getPets().get(0);
		if (!(pet.getName().equals("cat") && pet.getSpecies().equals("Cat"))){
			fail("Cat of species Cat was not added correctly.");
		}
		player.addPet("unknown", "Blah");
		try{
			Pet pet2 = player.getPets().get(1);
			pet2.getSpecies();
			fail("There should be no pet at index 1, for unknown is not a valid species.");
		}
		catch (IndexOutOfBoundsException e){
		}
	}

	public void testStringOfPets() {
		player.addPet("cat", "cat");
		String pets = player.stringOfPets();
		if (!pets.equals("A Cat named cat\n")){
			fail("Did not produce correct output string for reading one pet.");
		}
		player.addPet("dog", "woof");
		player.addPet("human", "bob");
		pets = player.stringOfPets();
		if (!pets.equals("A Cat named cat\nA Dog named woof\nA Human named bob\n")){
			fail("Did not produce correct output string for reading three pets.");
		}
	}

	public void testRemovePet() {
		player.addPet("cat","cat");
		Pet pet = player.getPets().get(0);
		player.removePet("cat", "cat");
		if (player.getPets().contains(pet)){
			fail("Cat not removed");
		}
		try{
			player.removePet("dog", "Woof");
		}
		catch (IndexOutOfBoundsException e){
			fail("Crashed apon trying to remove a pet that doesnt exist.");
		}
	}

}
