
public class Katana extends Weapon {
	public Katana() {
		super(7.0,8);
	}
    
	public Katana(double cost, int damage) {
		super(cost,damage);
	}

    // to String
	@Override
	public String toString() {
		return "Sword [cost=" + getCost() + ", damage=" + getDamage() + "]";
	}

}
