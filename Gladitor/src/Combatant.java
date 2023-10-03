
public interface Combatant {
	/**
	 * purpose - This combatant object attacks a target combatant object,
	 * inflicting damage on the target combatant object's health.
	 * 
	 * @param defender    - ref variable to the combatant object being attacked
	 * @param damageDealt - amount of hitPoints delivered upon the defending
	 *                    combatant object.
	 */
	public abstract void attack(Combatant defender, int damageDealt);

	/**
	 * purpose - This entity is being attacked by a attacking combatant object,
	 * taking damage to this defending combatant object's health.
	 * 
	 * @param attacker        - ref variable to the combatant object attacking
	 * @param damageSustained - amount of hitPoints sustained by this defending
	 *                        combatant object.
	 */
	public abstract void getAttacked(Combatant attacker, int damageSustained);
	
	public abstract void setCurrentHealth(int hp);
	
	

}
