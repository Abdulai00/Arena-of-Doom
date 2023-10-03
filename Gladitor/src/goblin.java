// CMSY 166 Arena of Doom
// Copyright 2021 Howard Community College
// Abdulai Bah
// @version 3
public class goblin extends Monster{

	private int annoyanceLevel;
	
	public void setAnnoy(int value) {
		this.annoyanceLevel = value;
	}
	
	@Override
	public String toString() {
		return "goblin [currentHealth=" + getCurrentHealth() + ", damageDealt=" + getDamageDealt() + ", annoyanceLevel="
				+ annoyanceLevel + ", treasureCarried=" + getTreasureCarried() + "]";
	}

	public int getAnnoy() {
		return annoyanceLevel;
	}
	
	
	goblin(int hp, int dmgdealt, int annoylevel, double treasure){
		super(hp,dmgdealt,treasure);
		this.annoyanceLevel = annoylevel;
	}
	
	
	goblin(){
		super(3,3,1.5);
		this.annoyanceLevel = 0;
	}
	
	public void attack(Combatant defender,int damageDealt) {
		System.out.println("The Goblin is atttacking\n ");
		defender.getAttacked(this,damageDealt);
		
	}
	
	
	
	public void getAttacked(Combatant attacker, int damageSustained) {
		
		System.out.println("The Goblin is getting ready to be attacked\n");
		
		this.setCurrentHealth(this.getCurrentHealth()- damageSustained);
		
		if(this.getCurrentHealth()>= 1) {
			
			System.out.println("the Goblin lives!!");
			
		}else {
			
			System.out.println("the goblin has fallen");
		}
		
		
	}
	
	
	
	
	

}

