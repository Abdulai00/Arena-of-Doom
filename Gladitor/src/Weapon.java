// CMSY 166 Arena of Doom
// Copyright 2021 Howard Community College
// Abdulai Bah
// @version 3
public abstract class Weapon {
	//instance variables
	private double cost;
	
	private int damage;
    // constructors
	public Weapon(){
		this.cost = 0;
		this.damage = 0;
	}
	
	public Weapon(double cost,int damage){
		this.cost = cost;
		this.damage = damage;
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
    // to String
	@Override
	public String toString() {
		return "Weapon [cost=" + cost + ", damage=" + damage + "]";
	}

}
