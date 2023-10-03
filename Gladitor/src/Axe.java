
public class Axe extends Weapon {
	public Axe() {
		super(4.5,6);
	}
    
	public Axe(double cost, int damage) {
		super(cost,damage);
	}

    // to String
	@Override
	public String toString() {
		return "Sword [cost=" + getCost() + ", damage=" + getDamage() + "]";
	}

}
