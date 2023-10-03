
public abstract class Monster implements Combatant {
	// instance variables
	private int currentHealth;
	
	private int damageDealt;
	
	private double treasureCarried;
	// constructors
	public Monster(){
		this.currentHealth = 0;
		this.damageDealt = 0;
		this.treasureCarried = 0;
		
	}
	
	public Monster(int health,int dmg, double coins){
		this.currentHealth = health;
		this.damageDealt = dmg;
		this.treasureCarried = coins;
				
	}
    // setters amd getters 
	public int getCurrentHealth() {
		return currentHealth;
	}

	public void setCurrentHealth(int currentHealth) {
		this.currentHealth = currentHealth;
	}

	public int getDamageDealt() {
		return damageDealt;
	}

	public void setDamageDealt(int damageDealt) {
		this.damageDealt = damageDealt;
	}

	public double getTreasureCarried() {
		return treasureCarried;
	}

	public void setTreasureCarried(double treasureCarried) {
		this.treasureCarried = treasureCarried;
	}
    // to striing
	@Override
	public String toString() {
		return "Monster [currentHealth=" + currentHealth + ", damageDealt=" + damageDealt + ", treasureCarried="
				+ treasureCarried + "]";
	}
	// abstract methods
	public abstract void  attack(Combatant defender, int damageDealt);
	
	public abstract void  getAttacked(Combatant attacker, int damageRecived);
	
	
	

}
