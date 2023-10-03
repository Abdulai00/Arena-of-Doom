// CMSY 166 Arena of Doom
// Copyright 2021 Howard Community College
// Abdulai Bah
// @version 3
public class Gladiator2 implements Combatant{
	// instance variables
	
	
	private String name;
	
	private int currentHealth;
	
	private Weapon weapon;
	
	private Armor armor;
	
	double treasureCarried;
   // constructors
	
	
	
	public Gladiator2(String name, int hp, Weapon ourWeapon, Armor armor,double treasure) {
			this.name = name;
			this.currentHealth = hp;
			this.weapon = ourWeapon;
			this.armor = armor;
			this.treasureCarried = treasure;
			
		}
	
	public Gladiator2() {
		this("the Masked",10,new Club(),new Rags(), 10.0);
		
	}
	// setters and getters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCurrentHealth() {
		return currentHealth;
	}

	public void setCurrentHealth(int currentHealth) {
		this.currentHealth = currentHealth;
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	public Armor getArmor() {
		return armor;
	}

	public void setArmor(Armor armor) {
		this.armor = armor;
	}

	public double getTreasureCarried() {
		return treasureCarried;
	}

	public void setTreasureCarried(double treasureCarried) {
		this.treasureCarried = treasureCarried;
	}

	@Override
	public String toString() {
		return "Gladiator2 [name=" + name + ", currentHealth=" + currentHealth + ", \nweapon=" + weapon + ", \narmor="
				+ armor + ", treasureCarried=" + treasureCarried + "]";
	}
	
	
	// reuqired method from the implementation of combatant from the super class
	public void attack(Combatant defender,int damageDealt) {
		System.out.println("The Gladiator is atttacking");
		defender.getAttacked(this,damageDealt);
		
	}
	
	public void getAttacked(Combatant attacker, int damageSustained) {
		System.out.println("The Gladiator is getting ready to be attacked");
		if(damageSustained - this.getArmor().getDamage() < 0) {
			this.setCurrentHealth(this.getCurrentHealth()- 0);
			System.out.println("Not even a scratch \n");
		}else {
			this.setCurrentHealth(this.getCurrentHealth()- (damageSustained - this.getArmor().getDamage()));
		}
		if(this.getCurrentHealth()>= 1) {
			System.out.println("the migthy gladiator lives!!");
		}else {
			System.out.println("the miight gladiator has fallen");
		}
		
		
	}
	
	
	


	
	
	
	
	
	
	
	
	
	
	


	
	
	
	
	
}
