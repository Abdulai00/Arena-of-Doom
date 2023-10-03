import java.util.Scanner;

public class gladitor_test {
	public static void main(String[] args) {
		Gladiator2 bro = new Gladiator2();

		goblin gob = new goblin();

		Orge OneEyed = new Orge();

		Orge TwoEyed = new Orge();

		Combatant[] array = new Combatant[] { bro, gob, OneEyed, TwoEyed };

		for (int i = 0; i < 3; i++) {
			array[i].toString();
		}
	}

}
