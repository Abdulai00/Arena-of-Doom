public abstract class Armor {
	
	private double cost;
	
	private int damage;
	
	// constructor
		public Armor() {
			this.cost = 4.5;
			this.damage = 3;
		}
		
		public Armor(double cost, int dmg) {
			this.cost = cost;
			this.damage = dmg;
		}
	    // getters and setters
		public double getCost() {
			return cost;
		}

		public void setCost(double cost) {
			this.cost = cost;
		}

		public int getDamage() {
			return damage;
		}

		public void setDamage(int damage) {
			this.damage = damage;
		}
        // to string
		@Override
		public String toString() {
			return "Armor [cost=" + cost + ", damage=" + damage + "]";
		}
		
		

}
