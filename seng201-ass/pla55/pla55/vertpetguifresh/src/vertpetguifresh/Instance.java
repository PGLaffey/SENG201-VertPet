package vertpetguifresh;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import vertpet.foods.Food;
import vertpet.pets.Pet;
import vertpet.toys.Toy;

/**
 * 
 * @author PGLaffey
 *
 */
public class Instance {
	
	private ArrayList<Player> players = new ArrayList<Player>();
	private int daysRemaining = 0;
	private int totalDays = 0;
	private boolean endGame = false;
	private int numPlayers;
	private int currentTime = 0;
	private String[] times = {"9AM","3PM","9PM"};
	private Player currentPlayer = null;
	private int actionsRemaining = 2;
	public Shop shop = new Shop();
	private boolean gameOver = false;
	
	/**
	 * Returns the player who's turn it is.
	 * @return The current Player.
	 */
	public Player getCurrentPlayer(){
		if (currentPlayer == null){
			currentPlayer = players.get(0);
		}
		return currentPlayer;
	}
	
	/**
	 * Returns amount of actions remaining in players turn.
	 * @return amount of actions remaining in players turn.
	 */
	public int getActionsRemaining(){
		return actionsRemaining;
	}
	
	/**
	 * Uses action and will change player if current player has no actions remaining.
	 * @return Events that have occurred, can be null.
	 */
	public String useAction(){
		actionsRemaining = actionsRemaining - 1;
		if (actionsRemaining < 1){
			return changeCurrentPlayer();
		}
		return null;
	}

	/**
	 * Returns if the game is ending at the end of this day.
	 * @return If the game is ending at the end of this day.
	 */
	public boolean getGameOver(){
		return gameOver;
	}
	
	/**
	 * Changes player  and will change time if current player is last player.
	 * @return Events that have occurred, can be null.
	 */
	public String changeCurrentPlayer(){
		String events = playerPetEvent();
		int currentIndex = players.indexOf(currentPlayer); 
		if (currentIndex < numPlayers - 1){
			currentPlayer = players.get(currentIndex + 1);
		}
		else{
			currentPlayer = players.get(0);
			changeTime();
			}
		actionsRemaining = 2;
		int numOfAlivePets = 0;
		int count = 0;
		while (count < players.size()){
			numOfAlivePets = numOfAlivePets + players.get(count).getPets().size();
			count = count + 1;
		}
		if (numOfAlivePets == 0){
			endGame = true;
			gameOver = true;
		}
		else if (currentPlayer.getPets().size() == 0){
			changeCurrentPlayer();
		}
		return events;
	}
	
	/**
	 * Changes time and will change day if current time is last time.
	 */	
	private void changeTime(){
		if (currentTime < 2){
			currentTime = currentTime + 1;
		}
		else{
			currentTime = 0;
			changeDay();
		}
		
	}
	
	/**
	 * Changes day and will end the game if there are no days remaining.
	 */
	private void changeDay(){
		daysRemaining = daysRemaining - 1;
		if (daysRemaining < 1 && totalDays < 100){
			gameOver = true;
		}
		else if (endGame){
			gameOver = true;
		}
	}
	
	/**
	 * Sets the game to end at the end of the current day.
	 */
	public void setEndGame(){
		endGame = true;
	}
	
	/**
	 * Sets the length of the game to length days.
	 * @param length Amount of days the game will go for.
	 */
	public void setGameLength(int length){
		totalDays = length;
		daysRemaining = length;
	}
	
	/**
	 * Returns the current day.
	 * @return The current day.
	 */
	public int getCurrentDay(){
		return totalDays - daysRemaining + 1;
	}
	
	/**
	 * Returns the current time.
	 * @return The current time.
	 */
	public String getTime(){
		return times[currentTime];
	}
	
	/**
	 * Clears all players from the game.
	 */
	public void clearPlayers(){
		players.clear();
	}
	
	/**
	 * Sets the number of players in the game.
	 * @param num The number of players in the game.
	 */
	public void setNumPlayers(int num){
		numPlayers = num;
	}
	
	/**
	 * Returns the number of players in the game.
	 * @return The number of players in the game.
	 */
	public int getNumPlayers(){
		return numPlayers;
	}
	
	/**
	 * Adds a player into the game.
	 * @param player Player to be added to the game.
	 */
	public void addPlayer(Player player){
		players.add(player);
	}
	
	/**
	 * Returns ArrayList of all players in the game.
	 * @return ArrayList of all players in the game.
	 */
	public ArrayList<Player> getPlayers(){
		return players;
	}
	
	/**
	 * Creates the players and allows them to customize their name. 
	 * @param name String array of names for the players.
	 */
	public void createPlayers(String[] names){
		int count = 0;
		while (count < numPlayers){
			String name = names[count].substring(0,1).toUpperCase()+names[count].substring(1).toLowerCase();
			players.add(new Player(name));
			count = count + 1;
		}
	}

	/**
	 * Returns Formatted string of any events that occurred during the players turn.
	 * @return Formatted string of any events that occurred during the players turn.
	 */
	private String playerPetEvent(){
		Player player = currentPlayer;
		int petCounter = 0;
		String events = "<html>";
		while (petCounter < player.getPets().size()){
			Pet pet = player.getPets().get(petCounter);
			events = events + petEvent(player, pet);
			events = events + pet.doDailyAdjustments();
			if (pet.getHealth() <= 0){
				events = events + player.addDeadPet(pet) + "<br>";
				if (player.getPets().size() == 0){
					events = events + player.getName()+" you have no more pets alive.<br>";
				}
			}
			petCounter = petCounter + 1;
		}
		if (events.equals("<html>")){
			return "Nothing Happened Today.";
		}
		else{
			return events + "</html>";
		}
	}
	
	/**
	 * Checks if a special pet event occurs. This involves a pet getting sick, eaten or attacked.
	 * @param player The player the pet belongs to.
	 * @param pet The pet that is getting tested for a special event.
	 */
	private String petEvent(Player player, Pet pet){
		String output = "";
		if (!pet.getSick()){
			int petCounter = 0;
			boolean foundPrey = false;
			Pet otherPet = new Pet("");		
			while (petCounter < player.getPets().size() && !foundPrey){
				otherPet = player.getPets().get(petCounter);
				if (pet.getSpecies().equals("Dog")){
					if (pet.getHappiness() < 10){
						if (otherPet.getSpecies().equals("Bird")||otherPet.getSpecies().equals("Cat")
								||otherPet.getSpecies().equals("Rabbit")||otherPet.getSpecies().equals("Human")){
							output = output + pet.getName()+" was too bored and played with "									
								+otherPet.getName()+". As a result "+otherPet.getName()
								+" is injured." + "<br>";
							otherPet.adjustHealth(-50);
							pet.adjustHappiness(5);
							foundPrey = true;
						}
					}
					else if (pet.getHunger() > 95){
						if (otherPet.getSpecies().equals("Bird")||otherPet.getSpecies().equals("Cat")
								||otherPet.getSpecies().equals("Rabbit")){
							output = output + pet.getName()+" was too hungry and ate "+otherPet.getName()+
									"<br>";
							otherPet.adjustHealth(-100);
							pet.adjustHunger(10);
							foundPrey = true;
						}
					}
				}
				else if (pet.getSpecies().equals("Cat")){
					if (pet.getHappiness() < 10){
						if (otherPet.getSpecies().equals("Bird")||otherPet.getSpecies().equals("Mouse")){
							output = output + pet.getName()+" was too bored and played with "									
								+otherPet.getName()+". As a result "+otherPet.getName()
								+" is injured.<br>";
							otherPet.adjustHealth(-50);
							pet.adjustHappiness(5);
							foundPrey = true;
						}
					}
					else if (pet.getHunger() > 95){
						if (otherPet.getSpecies().equals("Bird")||otherPet.getSpecies().equals("Mouse")
								||otherPet.getSpecies().equals("Rabbit")){
							output = output + pet.getName()+" was too hungry and ate "+otherPet.getName()
							+ "<br>";
							otherPet.adjustHealth(-100);
							pet.adjustHunger(10);
							foundPrey = true;
						}
					}
				}
				petCounter = petCounter + 1;
			}
		}
		return output;
	}
	
	
	/**
	 * Processes a pet eating a food.
	 * @param food The food to be eaten.
	 * @param pet The pet which is eating the food.
	 */
	public void eatFood(Food food, Pet pet){
		if (food.getName().equals("Medicine")){
			if (pet.getSick()){
				pet.isCured(true);
			}
		}
		pet.adjustHunger(food.getAdjustHunger());
		pet.adjustThirst(food.getAdjustThirst());
		pet.adjustHappiness(food.getAdjustHappiness());
		pet.adjustBladder(food.getAdjustBladder());
		pet.adjustTiredness(food.getAdjustTiredness());
		if (pet.getLikes().contains(food.getName().toLowerCase())){
			pet.adjustHunger(-10);
			pet.adjustThirst(-10);
			pet.adjustHappiness(5);
			pet.adjustHealth(5);
		}
		else if (pet.getDislikes().contains(food.getName().toLowerCase())){
			pet.adjustHunger(5);
			pet.adjustThirst(5);
			pet.adjustHappiness(-5);
			pet.adjustHealth(-2.5);
		}
		else if (pet.getPoisons().contains(food.getName().toLowerCase())){
			pet.adjustHunger(-food.getAdjustHunger()-10);
			pet.adjustThirst(-food.getAdjustThirst()-10);
			pet.adjustHappiness(-15);
			pet.adjustHealth(-15);
		}
	}
	
	/**
	 * Processes a pet using a toy.
	 * @param toy The toy to be used.
	 * @param pet The pet that is playing with the toy,
	 * @return
	 */
	public boolean useToy(Toy toy, Pet pet){
		pet.adjustHappiness(toy.getAdjustHappiness());
		pet.adjustThirst(toy.getAdjustThirst());
		pet.adjustHunger(toy.getAdjustHunger());
		pet.adjustTiredness(toy.getAdjustTiredness());
		toy.useToy(pet.getToyUse()+Math.round(Math.random()*11));
		if (toy.getDurability() <= 0){
			return true;
		}
		else{
			return false;
		}
	}
	
	/**
	 * Returns int of the players total score.
	 * @param player The player who you are scoring.
	 * @return int of the players total score.
	 */
	public int getPlayerScore(Player player){
		int score = 0;
		score = score + itemScore(player);
		int count = 0;
		while (count < player.getPets().size()){
			score = score + petScore(player.getPets().get(count));
			count = count + 1;
		}
		count = 0;
		while (count < player.getDeadPets().size()){
			score = score - 5000;
			count = count + 1;
		}
		return score;
	}
	
	/**
	 * Calculates the score for all remaining items in the players inventory.
	 * All items are worth 75% of their original value. Each $1 is worth 10 points.
	 * @param player The player thats items are getting scored.
	 * @return The score for all remaining items in the players inventory. 
	 */
	public int itemScore(Player player){
		int score = (int) (player.getMoney() * 10);
		int count = 0;
		while (count < player.getFoodInv().size()){
			score = (int) (score + Math.round(player.getFoodInv().get(count).getCost()*7.5));
			count = count + 1;
		}
		count = 0;
		while (count < player.getToyInv().size()){
			score = (int) (score + Math.round(player.getToyInv().get(count).getCost()*7.5));
			count = count + 1;
		}
		return score;
	}
	
	/**
	 * 
	 * Calculates a end-game score for a pet. Higher scores mean the pet was taken care of better.
	 * The score for a pet is calculated to be 100 * its happiness + health.
	 * @param pet The pet that is getting a score taken from.
	 * @return The score of the pet. 
	 */
	public int petScore(Pet pet){
		int score = 0;
		score = (int) (score + Math.round((pet.getHappiness()+pet.getHealth())*100));
		return score;
	}
	
	/**
	 * Reads the about game file using a BufferedReader.
	 * @return String of the about game file.
	 */
	public String readAbout(){
		String filename = System.getProperty("user.dir")+"/"+System.getProperty("java.class.path")+"/about";
		InputStream file = Instance.class.getResourceAsStream("about");
		filename = filename.replace("\\", "/");
		String about = "<html>";
		try {
			BufferedReader aboutReader = new BufferedReader(new InputStreamReader(file));
			String line = aboutReader.readLine();
			while (line != null){
				about = about + line +"<br>";
				line = aboutReader.readLine();
			}
			aboutReader.close();
			file.close();
		} catch (FileNotFoundException e) {
			System.out.println("Error: File "+filename+" not found!");
		} catch (IOException e) {
			System.out.println("Error: Error reading file "+filename);
		} 
		return about + "</html>";
		}

	/**
	 * Reads the scoring game file using a BufferedReader.
	 * @return String of the scoring information file.
	 */
	public String readScoring(){
		String filename = System.getProperty("user.dir")+"/"+System.getProperty("java.class.path")+"/scoring";
		InputStream file = Instance.class.getResourceAsStream("scoring");
		filename = filename.replace("\\", "/");
		String about = "<html>";
		try {
			BufferedReader aboutReader = new BufferedReader(new InputStreamReader(file));
			String line = aboutReader.readLine();
			while (line != null){
				about = about + line +"<br>";
				line = aboutReader.readLine();
			}
			aboutReader.close();
			file.close();
		} catch (FileNotFoundException e) {
			System.out.println("Error: File "+filename+" not found!");
		} catch (IOException e) {
			System.out.println("Error: Error reading file "+filename);
		} 
		return about + "</html>";
		}
}
