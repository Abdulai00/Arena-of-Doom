public class Steelplate extends Armor {
	
	public Steelplate() {
		super(7.0,8);
	}
	
	public Steelplate(double cost, int damage) {
		super(cost,damage);
	}
	
	public String toString() {
		return "Sword [cost=" + getCost() + ", damage=" + getDamage() + "]";
	}

}
