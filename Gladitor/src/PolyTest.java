
public class PolyTest {
	
	public static void main(String[] args) {
		// instances of objects
		Gladiator2 bro = new Gladiator2();

		goblin gob = new goblin();

		Orge OneEyed = new Orge();

		Orge TwoEyed = new Orge();
        // array of type Combatant filled with the instances of the above object
		Combatant[] array = { bro, gob, OneEyed, TwoEyed };
		
		// enhances for loop
		for(Combatant x : array) {
			x.toString();
		}
		// regular for loop
		for(Combatant currentCombatant : array) {
			
			currentCombatant.setCurrentHealth(20);
		}
	}

}
