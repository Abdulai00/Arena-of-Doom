//* Ce goblin2.0 - Food Inventory Program
//* Copyright 2022 Howard Community College
//* @author Abdulai Bah
//* @version 1.0

import java.util.Scanner;

public class gladitor_test {

//	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		System.out.print("Howard community college copyright @2021");
//		
//		String name,weapon,armor;
//		
//		int hp,treasure;
//		// initializing 2 different instances of the glad2 object
//		Gladiator2 Glad1 = new Gladiator2();
//
//		Gladiator2 Glad2 = new Gladiator2();
//		System.out.printf("%n%s the gladitor attributes: (hp:%d, weapon: %s, armor: %s, silver: %.2f)%n", Glad1.getName(),
//				Glad1.getCurrentHealth(), Glad1.getWeapon(), Glad1.getArmor(), Glad1.getTreasureCarried());
//		// gaining the input from the user
//		System.out.print("enter your name warrior: \n");
//		name = input.next();
//		
//		System.out.print("How much can you withstand?: \n");
//		hp = input.nextInt();
//		
//		System.out.print("Inform us of your migthy armor: \n");
//		armor = input.next();
//		
//		System.out.print("Choose your mighty weapon : \n");
//		weapon = input.next();
//		
//		System.out.print("How rich are you: \n");
//		treasure = input.nextInt();
//		
//		// setting the new values to the glad2 object 
//		Glad2.setArmor(armor);
//		Glad2.setCurrentHealth(hp);
//		Glad2.setName(name);
//		Glad2.setWeapon(weapon);
//		Glad2.setTreasureCarried(treasure);
//		
//		System.out.printf("%s the gladitor attributes: (hp:%d, weapon: %s, armor: %s, silver: %.2f)%n", Glad2.getName(),
//				Glad2.getCurrentHealth(), Glad2.getWeapon(), Glad2.getArmor(), Glad2.getTreasureCarried());
//		//closing the use of the scanner
//		input.close();
//		
//		
//
//	}
	
	public static void main(String[] args) {
		Gladiator2 bro = new Gladiator2();

		goblin gob = new goblin();

		Orge OneEyed = new Orge();

		Orge TwoEyed = new Orge();

		Combatant[] array = new Combatant[] { bro, gob, OneEyed, TwoEyed };

		for (int i = 0; i < 3; i++) {
			array[i].toString();
		}
	}

}
