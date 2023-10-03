public class Sword extends Weapon{
	// instance variables
	
	private boolean isEngraved;
	
	// constructors
	public Sword() {
		super(2.5,4);
	}
    
	public Sword(double cost, int damage, boolean TF) {
		super(cost,damage);
		this.isEngraved = TF;
	}

    // getters and setters
	


	public boolean isEngraved() {
		return isEngraved;
	}


	public void setEngraved(boolean isEngraved) {
		this.isEngraved = isEngraved;
	}

    // to String
	@Override
	public String toString() {
		return "Sword [cost=" + getCost() + ", damage=" + getDamage() + ", isEngraved=" + isEngraved + "]";
	}
	
	
	
}
