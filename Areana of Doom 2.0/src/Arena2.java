
// CMSY 166 Arena of Doom
// Copyright 2021 Howard Community College
// Abdulai Bah
// @version 3
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
// I used eclispe to build a path to make use of the glaidator class and all it's sub classes
// the same with goblin class you have them as i turned it in in previous work

public class Arena2 {

	public static void main(String[] args) {
		// varriables i will use to call the methods and stop the loop
		int save, save2;

		// final variables for monster choiice
		final int gob = 1;
		final int Og = 2;
		final int gia = 3;
		final int dra = 4;
        // final variables for menu choice
		final int Arena = 1;
		final int Rest = 2;
		final int Shop = 3;
		final int Stats = 4;
		final int Quit = 5;

		boolean stop = false;
		// initilaizng scanner class
		Scanner input = new Scanner(System.in);

		String glad_name;
		// initializng a instance of the gladiator class
		Gladiator2 glad = new Gladiator2();

		System.out.print("Howard Communitiy college copyright @2021");
		System.out.print("\nWelcome to the arena of Doom!\nWhat is your name, gladiator?  ");

		glad_name = input.next();
		// setting the inputed name to the class of gladiator
		glad.setName(glad_name);

		// hash maps
		Map<Integer, String> M = new HashMap<>();
		M.put(1, "goblin");
		M.put(2, "orge");
		M.put(3, "giant");
		M.put(4, "dragon");

		// loop until quit is selected
		do {
			// calling the method and saving the value
			save = getValidMenuChoice();
			switch (save) {
			case Quit:
				quit(glad.getName());
				stop = true;
				break;
			case Shop:
				buy(glad);
				break;
			case Arena:
				// Making sure the gladiator cannot fight with no health points
				if (glad.getCurrentHealth() <= 0) {
					System.out.printf("%s Has No Health points!!!\nHeal him up to contiune!!!!", glad.getName());
				} else {
					// calling the method and saving the value
					save2 = getValidMonsterChoice(glad.getName());
					switch (save2) {
					// using apporpiate function calls and hashmap retrivals to compute
					case gob:
						// instance of goblin method
						Monster goblin = new goblin();

						glad = startFight(goblin, glad, M.get(save2));

						break;
					case Og:
						Monster orge = new Orge();

						glad = startFight(orge, glad, M.get(save2));
						break;
					case gia:
						Monster giant = new Giant();

						glad = startFight(giant, glad, M.get(save2));
						break;
					case dra:
						Monster dragon = new Dragon();

						glad = startFight(dragon, glad, M.get(save2));
						break;
					// Using the .get method i'am able to retrieve the key value pairs from the hash
					// map
					}
				}
				// using a nested switch statement it is much easier to complete the arena of
				// doom
				break;
			case Rest:
				// making sure that the gladiator has the correct amount of treasure to heal
				if (glad.getTreasureCarried() - 1 >= 0) {
					glad.setCurrentHealth(glad.getCurrentHealth() + 2);
					System.out.print(
							"\n" + glad.getName() + " The Gladiator rests, gaining 2 hit points\nHit points are now: "
									+ glad.getCurrentHealth() + "\n");
				} else {
					System.out.print(
							"You don't have enough to treasure to rest! Will you risk battle or leave with your glory?");
				}

				break;

			case Stats:
				// using methods of glad to make output all the values of our gladitor
				System.out.print(glad);
				break;

			}
		} while (!stop);
	}

	public static int getValidMenuChoice() {
		int choice = 0;

		// bringing in a an instance of the scanner class
		Scanner input = new Scanner(System.in);

		System.out.print("\nChoose an action:\n1 - Enter the Arena\n2 - Rest at the Healer's Tent\n3"
				+ " - Buy Equipment at the Bazaar\n4 - display Status\n5 - Quit the Game\nWhat would you like to do: ");
		// cathcing letters and wrong numbers
		boolean success = false;
		while (!success) {
			try {
				choice = input.nextInt();
				if (choice < 1 || choice > 5) {
					System.out.print("1 through 5 bro");
					System.out.print("\nChoose an action:\n1 - Enter the Arena\n2 - Rest at the Healer's Tent\n3"
							+ " - Buy Equipment at the Bazaar\n4 - display Status\n5 - Quit the Game\nWhat would you like to do: ");
					continue;
				} else {
					success = true;
				}

			} catch (Exception e) {
				System.out.print("\ncomputer is too dumb for words bro\n");
				System.out.print("\nChoose an action:\n1 - Enter the Arena\n2 - Rest at the Healer's Tent\n3"
						+ " - Buy Equipment at the Bazaar\n4 - display Status\n5 - Quit the Game\nWhat would you like to do: ");
				input.next();
			}
		}

		return choice;
	}

	// quitting method
	public static void quit(String name) {
		System.out.print(
				"\n" + name + " the gladiator has left the building.\nGoodbye, " + name + ".  thank you for playing.");

	}

	// buy method
	public static void buy(Gladiator2 glad) {
		int choice = 0;
		// Scanner
		Scanner input = new Scanner(System.in);

		System.out.print("\nWelcome to the Shop would\n");

		System.out.print("Enter 1 to buy Weapons and enter 2 to buy Armor ");
		// catching false input
		boolean success = false;
		while (!success) {
			try {
				choice = input.nextInt();
				if (choice < 1 || choice > 2) {
					System.out.print("\nPlease choose 1 through 2\n");
					System.out.print("Enter 1 to buy Weapons and enter 2 to buy Armor: \n");
					continue;
				} else {
					success = true;
				}

			} catch (Exception e) {
				System.out.print("\nPlease choose 1 through 2\n");
				System.out.print("Enter 1 to buy Weapons and enter 2 to buy Armor: \n ");
				input.next();
			}
		}
		if (choice == 1) {
			// the objects that I will give to the gladiator
			int choice2 = 0;
			Weapon club = new Club();
			Weapon sword = new Sword();
			Weapon axe = new Axe();
			Weapon katana = new Katana();

			Weapon[] array = { club, sword, axe, katana };
			String[] array2 = { "Club", "Sword", "Axe", "Katana" };

			boolean success2 = false;
			System.out.print("    Weapon   Dmg   Cost\n");
			System.out.print("-----------------------\n");

			for (int i = 0; i < array.length; i++) {
				System.out.printf("%d.) %s    %d  %.1f%n", i + 1, array2[i], array[i].getDamage(), array[i].getCost());
			}
			System.out.print("Enter the corresponding number of what you want to buy: ");
			// checking for correct input
			while (!success2) {
				try {
					choice2 = input.nextInt();
					if (choice2 < 1 || choice2 > 4) {
						System.out.print("\nPlease choose 1 through 4\n");

						System.out.print("    Weapon   Dmg   Cost\n");
						System.out.print("-----------------------\n");

						for (int i = 0; i < array.length; i++) {
							System.out.printf("%d.) %s    %d  %.1f%n", i + 1, array2[i], array[i].getDamage(),
									array[i].getCost());
						}

						System.out.print("Enter the corresponding number of what you want to buy: ");
						continue;
					} else {
						success2 = true;
					}

				} catch (Exception e) {
					System.out.print("\nPlease choose 1 through 4\n\n");

					System.out.print("    Weapon   Dmg   Cost\n");
					System.out.print("-----------------------\n");

					for (int i = 0; i < array.length; i++) {
						System.out.printf("%d.) %s    %d  %.1f%n", i + 1, array2[i], array[i].getDamage(),
								array[i].getCost());
					}

					System.out.print("Enter the corresponding number of what you want to buy: ");
					input.next();
				}
			}
			// doing the processiing of the buying
			if (glad.getTreasureCarried() - array[choice2 - 1].getCost() >= 0) {
				glad.setTreasureCarried(glad.getTreasureCarried() - array[choice2 - 1].getCost());
				glad.setWeapon(array[choice2 - 1]);
				System.out.printf("You have succesful bought a %s%n", array2[choice2 - 1]);
				System.out.printf("Your treasure carried is now %.2f%n", glad.getTreasureCarried());

			} else {
				// making sure that if they do not enough treasure they can contiune to browse
				System.out.print("You dont have enough treasure for that weapon");
				buy(glad);
			}

		} else {
			// objects to be bought by gladiator
			int choice2 = 0;
			Armor rags = new Rags();
			Armor leather = new Leather();
			Armor chainmail = new Chainmail();
			Armor steelplate = new Steelplate();

			Armor[] array = { rags, leather, chainmail, steelplate };
			String[] array2 = { "Rags", "Leather", "Chainmail", "Steelplate" };

			boolean success2 = false;
			System.out.print("    Weapon   Dmg   Cost\n");
			System.out.print("-----------------------\n");

			for (int i = 0; i < array.length; i++) {
				System.out.printf("%d.) %s    %d  %.1f%n", i + 1, array2[i], array[i].getDamage(), array[i].getCost());
			}
			System.out.print("Enter the corresponding number of what you want to buy: ");
			// input checking
			while (!success2) {
				try {
					choice2 = input.nextInt();
					if (choice2 < 1 || choice2 > 4) {
						System.out.print("\nPlease choose 1 through 4\n");

						System.out.print("    Weapon   Dmg   Cost\n");
						System.out.print("-----------------------\n");

						for (int i = 0; i < array.length; i++) {
							System.out.printf("%d.) %s    %d  %.1f%n", i + 1, array2[i], array[i].getDamage(),
									array[i].getCost());
						}

						System.out.print("Enter the corresponding number of what you want to buy: ");
						continue;
					} else {
						success2 = true;
					}

				} catch (Exception e) {
					System.out.print("\nPlease choose 1 through 4\n\n");

					System.out.print("    Weapon   Dmg   Cost\n");
					System.out.print("-----------------------\n");

					for (int i = 0; i < array.length; i++) {
						System.out.printf("%d.) %s    %d  %.1f%n", i + 1, array2[i], array[i].getDamage(),
								array[i].getCost());
					}

					System.out.print("Enter the corresponding number of what you want to buy: ");
					input.next();
				}
			}
			// processing the buying of new armor
			if (glad.getTreasureCarried() - array[choice2 - 1].getCost() >= 0) {
				glad.setTreasureCarried(glad.getTreasureCarried() - array[choice2 - 1].getCost());
				glad.setArmor(array[choice2 - 1]);
				System.out.printf("You have succesful bought a %s%n", array2[choice2 - 1]);
				System.out.printf("Your treasure carried is now %.2f%n", glad.getTreasureCarried());

			} else {
				System.out.print("You dont have enough treasure for that Armor");
				// if they dont have enough treasure calling it again to let them look for
				// somethiing else
				buy(glad);
			}
		}
	}

	public static int getValidMonsterChoice(String name) {
		int choice = 0;

		// bringing in a an instance of the scanner class
		Scanner input = new Scanner(System.in);

		System.out.print("\n" + name + " the gladiator has entered the arena of doom!!\n"
				+ "\nChoose an Action\n1 - Goblin\n2 - Ogre\n3 - Giant\n4 - Dragon\n\nWhat will you fight?  ");
		// cathcing letters and wrong numbers
		boolean success = false;
		while (!success) {
			try {
				choice = input.nextInt();
				if (choice < 1 || choice > 5) {
					System.out.print("1 through 5 bro");
					System.out.print("\n" + name + " the gladiator has entered the arena of doom!!\n"
							+ "\nChoose an Action\n1 - Goblin\n2 - Ogre\n3 - Giant\n4 - Dragon\n\nWhat will you fight?  ");
					continue;
				} else {
					success = true;
				}

			} catch (Exception e) {
				System.out.print("\ncomputer is too dumb for words bro\n");
				System.out.print("\n" + name + " the gladiator has entered the arena of doom!!\n"
						+ "\nChoose an Action\n1 - Goblin\n2 - Ogre\n3 - Giant\n4 - Dragon\n\nWhat will you fight?  ");
				input.next();
			}
		}
		return choice;

	}
   // the fight function I make use of the combatant classes attack and get attack functions 
	public static Gladiator2 startFight(Monster creature, Gladiator2 champion, String name) {
		System.out.println("the " + name + " and " + champion.getName() + " prepare for battle\n");
		do {
			champion.attack(creature, champion.getWeapon().getDamage());
			if (creature.getCurrentHealth() < 0) {
				break;
			}
			creature.attack(champion, creature.getDamageDealt());

		} while (champion.getCurrentHealth() > 0 && creature.getCurrentHealth() > 0);

		if (champion.getCurrentHealth() > 0) {
			champion.setTreasureCarried(champion.getTreasureCarried() + creature.getTreasureCarried());
			System.out.println("the gladiator has won this battle and slayed the " + name);
		} else {
			System.out.println("the gladitor has lost his battle agasint the " + name);
		}

		return champion;
	}

}
