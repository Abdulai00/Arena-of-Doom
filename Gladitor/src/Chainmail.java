
public class Chainmail extends Armor {
	
	public Chainmail() {
		super(4.5,5);
	}
	
	public Chainmail(double cost,int damage) {
		super(cost,damage);
	}
	
	public String toString() {
		return "Sword [cost=" + getCost() + ", damage=" + getDamage() + "]";
	}

}
