package vertpet;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import vertpet.foods.Food;
import vertpet.pets.Pet;
import vertpet.toys.Toy;

/**
 * 
 * @author PGLaffey
 *
 */
public class Instance {
	
	private Scanner reader = new Scanner(System.in);
	private ArrayList<Player> players = new ArrayList<Player>();
	private int daysRemaining = 0;
	private int totalDays = 0;
	private Shop shop = new Shop();
	private boolean endGame = false;
	
	
	/**
	 * Starts the instance of the game.
	 */
	public void start(){
		intro();
		int numPlayers = getPlayers();
		createPlayers(numPlayers);
		addPets();
		while (daysRemaining < 1){
			setDays();
		}
		totalDays = daysRemaining;
		System.out.println("Alright thats the setup done, let's being!\n");
		while ((daysRemaining > 0 || totalDays < 99) && !endGame){
			processDay();
			daysRemaining = daysRemaining - 1;
		}
		end();
	}
	
	
	/**
	 * Run at the end of the game. Calculates score for all players and prints it.
	 */
	private void end(){
		System.out.println("\n\nGame Over!!!\n\n");
		int playerCount = 0;
		int petCount = 0;
		int score = 0;
		int totalScore = 0;
		Player player = null;
		Pet pet = null;
		while (playerCount < players.size()){
			player = players.get(playerCount);
			System.out.print("Review of player - "+player.getName()+"\n\n"
					+ "Alive Pets:\n");
			while (petCount < player.getPets().size()){
				pet = player.getPets().get(petCount);
				score = petScore(pet);
				totalScore = totalScore + score;
				System.out.println(pet.getSpecies()+" named "+pet.getName()+", score "+score+"\n");
				petCount = petCount + 1;
			}
			System.out.println("\nDead Pets:");
			petCount = 0;
			while (petCount < player.getDeadPets().size()){
				pet = player.getPets().get(petCount);
				totalScore = totalScore - 5000;
				System.out.println(pet.getSpecies()+" named "+pet.getName()+", score -5000\n");
				petCount = petCount + 1;
			}
			petCount = 0;
			System.out.println("\nBonus for Money and Items:"
					+ "Money $"+player.getMoney()+", score "+Math.round(player.getMoney()*10)+"\n");
			score = itemScore(player);
			totalScore = totalScore + score;
			System.out.print("Remaining Toys and Food, score "+Math.round(score)+"\n\n"
					+ "Total Score, "+ totalScore + "\n\n");
			totalScore = 0;
			playerCount = playerCount + 1;
		}
	}
	
	
	/**
	 * Calculates the score for all remaining items in the players inventory.
	 * All items are worth 75% of their original value. Each $1 is worth 10 points.
	 * @param player The player thats items are getting scored.
	 * @return The score for all remaining items in the players inventory. 
	 */
	private int itemScore(Player player){
		int score = 0;
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
	private int petScore(Pet pet){
		int score = 0;
		score = (int) (score + Math.round((pet.getHappiness()+pet.getHealth())*100));
		return score;
	}
	
	/**
	 * Processes a full in game day for all players.
	 */
	private void processDay(){
		int playerCount = 0;
		int timeCount = 0;
		int petCount = 0;
		String[] times = {"9AM", "3PM", "9PM"};
		while (timeCount < 3){
			playerCount = 0;
			while (playerCount < players.size()){
				processTurn(times[timeCount], players.get(playerCount));
				petCount = 0;
				while (petCount < players.get(playerCount).getPets().size()){
					players.get(playerCount).getPets().get(petCount).doDailyAdjustments();
					petEvent(players.get(playerCount), players.get(playerCount).getPets().get(petCount));
					petCount = petCount + 1;
				}
				playerCount = playerCount + 1;
			}
			timeCount = timeCount + 1;
		}
	}
	
	/**
	 * Checks if a special pet event occurs. This involves a pet getting sick, eaten or attacked.
	 * @param player The player the pet belongs to.
	 * @param pet The pet that is getting tested for a special event.
	 */
	private void petEvent(Player player, Pet pet){
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
							System.out.println(pet.getName()+" was too bored and played with "									
								+otherPet.getName()+". As a result "+otherPet.getName()
								+" is injured.");
							otherPet.adjustHealth(-50);
							pet.adjustHappiness(5);
							foundPrey = true;
						}
					}
					else if (pet.getHunger() > 95){
						if (otherPet.getSpecies().equals("Bird")||otherPet.getSpecies().equals("Cat")
								||otherPet.getSpecies().equals("Rabbit")){
							System.out.println(pet.getName()+" was too hungry and ate "+otherPet.getName());
							otherPet.adjustHealth(-100);
							pet.adjustHunger(10);
							foundPrey = true;
						}
					}
				}
				else if (pet.getSpecies().equals("Cat")){
					if (pet.getHappiness() < 10){
						if (otherPet.getSpecies().equals("Bird")||otherPet.getSpecies().equals("Mouse")){
							System.out.println(pet.getName()+" was too bored and played with "									
								+otherPet.getName()+". As a result "+otherPet.getName()
								+" is injured.");
							otherPet.adjustHealth(-50);
							pet.adjustHappiness(5);
							foundPrey = true;
						}
					}
					else if (pet.getHunger() > 95){
						if (otherPet.getSpecies().equals("Bird")||otherPet.getSpecies().equals("Mouse")
								||otherPet.getSpecies().equals("Rabbit")){
							System.out.println(pet.getName()+" was too hungry and ate "+otherPet.getName());
							otherPet.adjustHealth(-100);
							pet.adjustHunger(10);
							foundPrey = true;
						}
					}
				}
				petCounter = petCounter + 1;
			}
		}
		if (pet.getHealth() <= 0){
			player.addDeadPet(pet);
			if (player.getPets().size() == 0){
				System.out.println(player.getName()+" you have no more pets alive.");
			}
		}
	}
	
	/**
	 * Simulates visiting the shop.
	 * @param player The player that is visiting the shop.
	 */
	private void visitShop(Player player){
		System.out.print("\nGreetings "+player.getName()+" welcome to the shop!\n"
				+ "You have $"+player.getMoney()+" avalible.\n"
				+ "Avalible actions:\n"
				+ "'Money - Check how much money you have.\n"
				+ "'Buy' - Buy a toy or some food.\n"
				+ "'Stock - Checks what the shop has to sell.\n"
				+ "'Inv' - Check your inventory.\n"
				+ "'Leave' - Leave the shop.\n"
				+ "'Help' - Print this message again.\n");
		String command = null;
		Object item = null;
		String itemName = null;
		Food[] allFood = shop.getAllFood();
		Toy[] allToys = shop.getAllToys();
		boolean done = false;
		while (!done){
			command = reader.next();
			command = command.toLowerCase();
			if (command.equals("help")){
				System.out.print("Avalible actions:\n"
				+ "'Money - Check how much money you have.\n"
				+ "'Buy' - Buy a toy or some food.\n"
				+ "'Stock - Checks what the shop has to sell.\n"
				+ "'Inv' - Check your inventory.\n"
				+ "'Leave' - Leave the shop.\n"
				+ "'Help' - Print this message again.\n");
			}
			else if (command.equals("leave")){
				done = true;
			}
			else if (command.equals("money")){
				System.out.println("You have $"+player.getMoney()+" avalible.");
			}
			else if (command.equals("inv")){
				System.out.print(getPlayerInv(player));
			}
			else if (command.equals("stock")){
				System.out.print(shop.getStock());
			}
			else if (command.equals("buy")){
				System.out.print(shop.getStock());
				itemName = reader.next();
				itemName = itemName.toLowerCase();
				boolean itemFound = false;
				int count = 0;
				while (count < allFood.length && !itemFound){
					if (itemName.equals(allFood[count].getName().toLowerCase())){
						item = (Food)allFood[count];
						itemFound = true;
					}
					count = count + 1;
				}
				count = 0;
				while (count < allToys.length && !itemFound){
					if (itemName.equals(allToys[count].getName().toLowerCase())){
						item = (Toy)allToys[count];
						itemFound = true;
					}
					count = count + 1;
				}
				if (itemFound){
					if (shop.inStock(item)){
						if (item instanceof Food){
							Food foodItem = (Food)item;
							if (player.getMoney() >= foodItem.getCost()){
								player.addFood(foodItem);
								shop.soldItem(item);
								player.adjustMoney(Math.round(-foodItem.getCost()));
								System.out.println("Successfully purchased one "+foodItem.getName());
							}
							else{
								System.out.println("Sorry you dont have enough money for a "+foodItem.getName());
							}
						}
						else{
							Toy toyItem = (Toy)item;
							if (player.getMoney() >= toyItem.getCost()){
								player.addToy(toyItem);
								shop.soldItem(item);
								player.adjustMoney(Math.round(-toyItem.getCost()));
								System.out.println("Successfully purchased one "+toyItem.getName());
							}
							else{
								System.out.println("Sorry you dont have enough money for a "+toyItem.getName());
							}
						}
					}
					else{
						System.out.println("Sorry we done have any "+itemName+" in stock"
								+ " at the moment. Check back later.");
					}
				}
				else{
					System.out.println("Sorry "+itemName+" is not a valid item for sale.");
				}
			}
			else{
				System.out.println("Sorry "+command+" is not a valid command.");
			}
			command = null;
		}
	}
	
	/**
	 * Gets a formatted String representation of a players inventory.
	 * @param player The player who's inventory is getting checked.
	 * @return String of the players inventory.
	 */
	private String getPlayerInv(Player player){
		String output = player.getName()+"'s Inventory:\n\nFood:\n";
		int foodCount = 0;
		int toyCount = 0;
		while (foodCount < player.getFoodInv().size()){
			output = output + player.getFoodInv().get(foodCount).getName() + "\n";
			foodCount = foodCount + 1;
		}
		output = output + "\nToys:\n";
		while (toyCount < player.getToyInv().size()){
			output = output + player.getToyInv().get(toyCount).getName() + "\n";
			toyCount = toyCount + 1;
		}
		output = output + "\nMoney: $" + player.getMoney();
		return output + "\n\n";
	}

	/**
	 * Processes one players turn for one time of the day.
	 * @param time The in game time of the day.
	 * @param player The player who's turn it is.
	 */
	private void processTurn(String time, Player player){
		System.out.println("Greetings "+player.getName()+". It is "+time+" on day "
				+ (totalDays-daysRemaining+1)+".");
		int actionCount = 2;
		int petCounter = 0;
		String command = null;
		String name = null;
		String itemName = null;
		Pet pet = new Pet("");
		while (actionCount > 0){
			System.out.print("Available actions:\n"
					+ "'Feed' - Feed a pet with food you own\n"
					+ "'Play' - Play with a pet using a toy you have\n"
					+ "'Sleep' - Put a pet to sleep\n"
					+ "'Toilet' - Take a pet to visit the bathroom\n"
					+ "'Work' - Go to work to earn more money\n"
					+ "'Shop' - Visit the shop to buy food or toys\n"
					+ "'Update' - Get an update on your pets status\n"
					+ "'Inv' - Get an update on the food, toys and money you have\n"
					+ "'Skip' - Skip your current turn by doing nothing\n"
					+ "'End' - Ends the game after the current day\n\n"
					+ "What would you like to do? (Actions remaining: "+actionCount+")\n");
			command = reader.next();
			command = command.toLowerCase();
			if (command.equals("skip")){
				actionCount = actionCount - 1;}
			else if (command.equals("end")){
				endGame = true;
				System.out.println("The game will end at the end of this day.");
			}
			else if (command.equals("update")){
				petCounter = 0;
				while (petCounter < player.getPets().size()){
					player.getPets().get(petCounter).getStats();
					petCounter = petCounter + 1;}
				}
			else if (command.equals("inv")){System.out.print(getPlayerInv(player));}
			else if (command.equals("work")){
				double moneyEarned = 20 + Math.round((Math.random() * 41));
				System.out.println("You earned "+moneyEarned+" from working.\n");
				player.adjustMoney(moneyEarned);
				actionCount = actionCount - 1;}
			else if (command.equals("shop")){
				actionCount = actionCount - 1;
				visitShop(player);}
			else if (command.equals("feed")||command.equals("play")||command.equals("sleep")||command.equals("toilet")){
				System.out.println("Please enter the pets name you would like do this action on.\n"
						+ "Pets:\n"+player.stringOfPets());
				name = reader.next();
				name = name.substring(0,1).toUpperCase()+name.substring(1).toLowerCase();
				petCounter = 0;
				boolean foundPet = false;
				while (petCounter < player.getPets().size()){
					if (player.getPets().get(petCounter).getName().equals(name)){
						foundPet = true;
						pet = player.getPets().get(petCounter);}
					petCounter = petCounter + 1;
				}
				if (foundPet){
					actionCount = actionCount - 1;
					if (command.equals("toilet")){
						if (pet.getBladder() > 10){
							pet.goToilet();
						}
						else{
							System.out.println(name+" doesnt need to go to the toilet.");
						}
					}
					else if (command.equals("sleep")){
						if (pet.getTiredness() > 50){
							pet.adjustTiredness(-35 - Math.round(Math.random()*31));
							pet.adjustHunger(-5 - Math.round(Math.random()*11));
							if (pet.getSpecies().equals("Cat")){
								pet.adjustTiredness(-5.0);
								pet.adjustHappiness(2.5);
							}
						}
						else{
							System.out.println(name+" couldn't sleep. It isn't tired.");
							pet.adjustHappiness(-5 - Math.round(Math.random()*10+1));
						}
					}
					else{
						///feed or play
						System.out.println("Please enter the item you would like to use");
						getPlayerInv(player);
						itemName = reader.next();
						itemName = itemName.toLowerCase();
						int foodCounter = 0;
						int toyCounter = 0;
						boolean foodItem = false;
						boolean foundItem = false;
						boolean toyItem = false;
						Food food = new Food();
						Toy toy = new Toy();
						while (foodCounter < player.getFoodInv().size() && !foundItem){
							if (player.getFoodInv().get(foodCounter).getName().toLowerCase().equals(itemName)){
								foodItem = true;
								foundItem = true;
								food = player.getFoodInv().get(foodCounter);}
							foodCounter = foodCounter + 1;
						}
						while (toyCounter < player.getToyInv().size() && !foundItem){
							if (player.getToyInv().get(toyCounter).getName().toLowerCase().equals(itemName)){
								toyItem = true;
								foundItem = true;
								toy = player.getToyInv().get(toyCounter);}
							toyCounter = toyCounter + 1;
						}
						if (foundItem){
							if (command.equals("feed")){
								if (foodItem){
									if (food.getName().equals("Medicine")){
										if (pet.getSick()){
											System.out.println(pet.getName()+" is no longer sick.");
											pet.isCured(true);
										}
										else{
											System.out.println(pet.getName()+" was not sick but took the medicine anyway.");
										}
									}
									pet.adjustHunger(food.getAdjustHunger());
									pet.adjustThirst(food.getAdjustThirst());
									pet.adjustHappiness(food.getAdjustHappiness());
									pet.adjustBladder(food.getAdjustBladder());
									pet.adjustTiredness(food.getAdjustTiredness());
									player.removeFood(food);
									if (pet.getLikes().contains(food.getName().toLowerCase())){
										pet.adjustHunger(-10);
										pet.adjustThirst(-10);
										pet.adjustHappiness(5);
										pet.adjustHealth(5);
										System.out.println(pet.getName()+" likes "+food.getName());
									}
									else if (pet.getDislikes().contains(food.getName().toLowerCase())){
										pet.adjustHunger(5);
										pet.adjustThirst(5);
										pet.adjustHappiness(-5);
										pet.adjustHealth(-2.5);
										System.out.println(pet.getName()+" doesn't like "+food.getName());
									}
									else if (pet.getPoisons().contains(food.getName().toLowerCase())){
										pet.adjustHunger(-food.getAdjustHunger()-10);
										pet.adjustThirst(-food.getAdjustThirst()-10);
										pet.adjustHappiness(-15);
										pet.adjustHealth(-15);
										System.out.println(pet.getName()+" vomits. "+food.getName()+
												" is poisonous to "+pet.getName());
									}
									else{
										System.out.println(pet.getName()+" ate the "+food.getName());
									}
								}
								else{
									System.out.println(name+" tried but cant eat a "+toy);
									pet.adjustHunger(- Math.round(Math.random()*11));
								}	
							}
							if (command.equals("play")){
								if (toyItem){
									System.out.println(pet.getName()+" played with the "+toy.getName());
									pet.adjustHappiness(toy.getAdjustHappiness());
									pet.adjustThirst(toy.getAdjustThirst());
									pet.adjustHunger(toy.getAdjustHunger());
									pet.adjustTiredness(toy.getAdjustTiredness());
									toy.useToy(pet.getToyUse()+Math.round(Math.random()*11));
									if (toy.getDurability() <= 0){
										System.out.println("The "+toy.getName()+" broke.");
									}
								}
								else{
									System.out.println(name+" cant play with a "+food+" because its food.");
									pet.adjustHappiness(- Math.round(Math.random()*11));
								}	
							}
						}
						else{
							System.out.println(player.getName()+" you have not item "+itemName);
							actionCount = actionCount + 1;
						}
					}
				}
				else{
					System.out.println(player.getName()+" you have no pet named "+name);
				}
				name = null;
			}
			else{
				System.out.println(command+" is not a valid command");
			}
			command = null;
		}
	}
	
	/**
	 * Prints the introduction to the game as well as asking the player if they want to learn about the game.
	 */
	private void intro(){
		String welcome = "/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\\nWelcome to Virtual Pets!";
		welcome = welcome + "\n\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\n";
		System.out.print(welcome);
		System.out.println("For information about the game type 'about' or type 'start' to begin.");
		String input = null;
		boolean done = false;
		while (!done){
			while (input == null){
				input = reader.next();
			}
			input = input.toLowerCase();
			if (input.equals("about")){
				System.out.print(readAbout()+"\n");
			}
			else if (input.equals("start")){
				done = true;
			}
			else{
				System.out.println(input+" not valid please enter 'about' to learn about the game"
						+ " or 'start' to begin the game.");
			}
			input = null;
		}
	}
	
	/**
	 * Reads the about game file using a BufferedReader.
	 * @return String of the about game file.
	 */
	private String readAbout(){
		String filename = System.getProperty("user.dir")+"/"+System.getProperty("java.class.path")+"/about";
		InputStream file = Instance.class.getResourceAsStream("about");
		filename = filename.replace("\\", "/");
		String about = "";
		try {
			BufferedReader aboutReader = new BufferedReader(new InputStreamReader(file));
			String line = aboutReader.readLine();
			while (line != null){
				about = about + line +"\n";
				line = aboutReader.readLine();
			}
			aboutReader.close();
			file.close();
		} catch (FileNotFoundException e) {
			System.out.println("Error: File "+filename+" not found!");
		} catch (IOException e) {
			System.out.println("Error: Error reading file "+filename);
		} 
		return about;
		}
	
	/**
	 * Sets the amount of days the players would like to play for.
	 */
	private void setDays(){
		System.out.println("How many days would you like to play for? (enter any value greater than 100 for an endless game)");
		String input = null;
		while (input == null){
			input = reader.next();
		}
		try{
			int days = Integer.parseInt(input);
			if (days > 100){
				days = 100;
			}
			else if (days < 1){
				System.out.println("Please enter a value larger than 0.");
			}
			daysRemaining = days;
		}
		catch (java.lang.NumberFormatException e){
			System.out.println("Please enter a valid number.");		
		}
	}
	
	/**
	 * Goes through adding pets for a player.
	 */
	private void addPets(){
		int count = 0;
		boolean done = false;
		String command = null;
		String name = null;
		String species = null;
		Pet pet = new Pet("Pet");
		List<String> allSpecies = Arrays.asList("bird", "cat", "dog", "elephant", "human", "mouse", "rabbit");
		while (count < players.size()){
			done = false;
			System.out.print(players.get(count).getName()+" it's time to chose your pets.\n"
					+ "To add a pet, type 'add' followed by the species and then it's name.\n"
					+ "To remove a pet, type 'remove' followed by the species and then it's name.\n"
					+ "To view your current pets, type 'pets'.\n"
					+ "To get the description of a species, type 'description' followed by the species.\n"
					+ "To view the likes, dislikes and poisons of a species, type 'likes' followed by the species.\n"
					+ "To see this message again type, 'help'.\n"
					+ "Once you have finished adding your pets type, 'done'.\n"
					+ "Valid species are as follows; Bird, Cat, Dog, Elephant, Human, Mouse, Rabbit\n");
			while (!done){
				
				command = reader.next();
				command = command.toLowerCase();
				if (command.equals("done")){
					if (players.get(count).getPets().size() < 1){
						System.out.println(players.get(count).getName()+" you must have between one and three pets.");
					}
					else{done = true;}
				}
				else if (command.equals("help")){
					count = count - 1;
					done = true;
				}
				else if (command.equals("pets")){
					ArrayList<Pet> pets = players.get(count).getPets();
					int counter = 0;
					if (pets.size() == 0){System.out.println("You have no pets.");}
					else{
						System.out.println("Your pets are:");
						while (counter < pets.size()){
							System.out.println("A "+pets.get(counter).getSpecies()+" named "
									+ pets.get(counter).getName());
							counter = counter + 1;
			}}}
				else if (command.equals("description")||command.equals("add")||command.equals("remove")||command.equals("likes")){
					species = reader.next();
					species = species.toLowerCase();
					if (!allSpecies.contains(species)){
						System.out.println(species+" is not a valid species.");
					}
					else if (command.equals("description")){
						String type = species.substring(0,1).toUpperCase();
						System.out.println(pet.readDescription("$"+type+"$"));
					}
					else if (command.equals("likes")){
						String type = species.substring(0,1).toUpperCase();
						System.out.print(pet.getAllLikes("$"+type+"$"));
					}
					else{
						name = reader.next();
						name = name.substring(0,1).toUpperCase()+name.substring(1).toLowerCase();
						if (command.equals("add")){
							int petCount = 0;
							boolean avalible = true;
							while (petCount < players.get(count).getPets().size()){
								if (players.get(count).getPets().get(petCount).getName().equals(name)){
									avalible = false;
								}
								petCount = petCount + 1;
							}
							if (!avalible){
								System.out.println("Sorry you already have a pet with that name.");
							}
							else{
								players.get(count).addPet(species, name);
							}
						}
						else if (command.equals("remove")){
							players.get(count).removePet(species, name);
						}
						name = null;
					}
					species = null;
				}
				else{
					System.out.println(command+" is not a valid command.");
				}
				command = null;
			}
			count = count + 1;
		}}
	
	/**
	 * Creates the players and allows them to customize their name. 
	 * @param numPlayers The number of players playing the game.
	 */
	private void createPlayers(int numPlayers){
		int count = 0;
		String[] names = {"Player 1", "Player 2", "Player 3", "Player 4", "Player 5"};
		while (count < numPlayers){
			players.add(new Player(names[count]));
			count = count + 1;
		}
		count = 0;
		String name = null;
		while (count < numPlayers){
			System.out.println(names[count]+"'s name: (Enter a . to leave as "+names[count]+")");
			while (name == null){
				name = reader.next();
			}
			if (name.equals(".")){
				count = count + 1;
			}
			else{
				name = name.substring(0,1).toUpperCase()+name.substring(1).toLowerCase();
				players.get(count).setName(name);
				count = count + 1;
			}
			name = null;
		}
	}
	
	/**
	 * Asks how many players would like to play.
	 * @return The number of players to play.
	 */
	private int getPlayers(){
		boolean done = false;
		int numPlayers = 0;
		while (!done){
			if (numPlayers == 0){
				try{
					System.out.println("How many players would like to play?");
					numPlayers = reader.nextInt();	
					if (numPlayers < 1){
						System.out.println("Number of players must be more than 0");
					}
					else if (numPlayers < 6){
						System.out.println("You would like " + numPlayers + " players? (Y/N)");
						String confirm = reader.next().toLowerCase();
						if (confirm.equals("y") || confirm.equals("yes")){
							done = true;
						}
						
					}
					else{
						System.out.println("Max players is 5");
					}
				}
				catch (java.util.InputMismatchException e){
					System.out.println("Please enter a number.");
				}
			}
			if (!done){
				//reader.nextLine();
				numPlayers = 0;
			}
		}
		return numPlayers;
	}
	
	public static void main(String[] argv){
		Instance run = new Instance();
		run.start();
	}
}
