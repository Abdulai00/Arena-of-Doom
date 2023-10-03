// CMSY 166 Arena of Doom
// Copyright 2021 Howard Community College
// Abdulai Bah
// @version 3
public class Giant extends Monster {
	
	Giant(int hp, int dmgdealt, double treasure){
		super(hp,dmgdealt,treasure);
	}
	
	
	Giant(){
		super(20,8,4.5);
	}
	
	@Override
	public String toString() {
		return "Giant [currentHealth=" + getCurrentHealth() + ", damageDealt=" + getDamageDealt() +  ", treasureCarried=" + getTreasureCarried() + "]";
	}
	
	
	
	public void attack(Combatant defender,int damageDealt) {
		System.out.println("The Giant is atttacking \n");
		defender.getAttacked(this,damageDealt);
		
	}
	
	public void getAttacked(Combatant attacker, int damageSustained) {
		
		System.out.println("The Giant is getting ready to be attacked\n");
		
		this.setCurrentHealth(this.getCurrentHealth()- damageSustained);
		
		if(this.getCurrentHealth()>= 1) {
			
			System.out.println("the Giant lives!!");
			
		}else {
			
			System.out.println("the Giant has fallen\n");
		}
		
		
	}

}
