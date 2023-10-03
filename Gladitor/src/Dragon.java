// CMSY 166 Arena of Doom
// Copyright 2021 Howard Community College
// Abdulai Bah
// @version 3
public class Dragon extends Monster {
	
	Dragon(int hp, int dmgdealt, double treasure){
		super(hp,dmgdealt,treasure);
	}
	
	
	Dragon(){
		super(40,13,6);
	}
	
	@Override
	public String toString() {
		return "Dragon [currentHealth=" + getCurrentHealth() + ", damageDealt=" + getDamageDealt() +  ", treasureCarried=" + getTreasureCarried() + "]";
	}
	
	public void attack(Combatant defender,int damageDealt) {
		System.out.println("The Dragon is atttacking \n");
		defender.getAttacked(this,damageDealt);
		
	}
	
	
	
	public void getAttacked(Combatant attacker, int damageSustained) {
		System.out.println("The Dragon is getting ready to be attacked");
		
		this.setCurrentHealth(this.getCurrentHealth()- damageSustained);
		
		if(this.getCurrentHealth()>= 1) {
			
			System.out.println("the Dragon lives!!");
		}else {
			
			System.out.println("the Dragon has fallen\n");
		}
		
		
	}

}
