
public class Rags extends Armor {
	// instance variables
	private String Color;
    // setters and getters
	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}
   // constructors
	public Rags() {
		super(1.0,1);
		this.Color = "dull grey";
	}

	public Rags(double cost, int damage, String Color) {
		super(cost,damage);
		this.Color = Color;
	}
    // to String method
	@Override
	public String toString() {
		return "Rags [cost=" + getCost() + ", damage=" + getDamage() + ", Color=" + Color + "]";
	}

	
}
