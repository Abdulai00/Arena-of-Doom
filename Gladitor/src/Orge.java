public class Orge extends Monster {
	//instance variables
	
	
	private String tribeName;
	
	// Constructors
	public Orge() {
		super(12,5,3.0);
		this.tribeName = "Null";
	}
	
	public Orge(int dmg, int hp, String name,double coins) {
		super(hp,dmg,coins);
		this.tribeName = name;
	}
    // getters and setters
	

	public String getTribeName() {
		return tribeName;
	}

	public void setTribeName(String tribeName) {
		this.tribeName = tribeName;
	}

	
    // to String
	@Override
	public String toString() {
		return "Orge [damageDealt=" + getDamageDealt() + ", currentHealth=" + getCurrentHealth() + ", treasureCarried="
				+ getTreasureCarried() + ", tribeName=" + tribeName + "]";
	}
	
	public void attack(Combatant defender,int damageDealt) {
		System.out.println("The Orge is atttacking \n");
		defender.getAttacked(this,damageDealt);
		
	}
	
	
	
	public void getAttacked(Combatant attacker, int damageSustained) {
		System.out.println("The is getting ready to be attacked\n");
		
		this.setCurrentHealth(this.getCurrentHealth()- damageSustained);
		
		if(this.getCurrentHealth()>= 1) {
			
			System.out.println("the Orge lives!!");
		}else {
			
			System.out.println("the Orge has fallen");
		}
	}
	
	

}
