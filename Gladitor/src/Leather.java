// CMSY 166 Arena of Doom
// Copyright 2021 Howard Community College
// Abdulai Bah
// @version 3
public class Leather extends Armor {
	// instance variables
	
	private double thickness;
	
	// constructor
	public Leather() {
		super(2.5,3);
		this.thickness = 2.0;
	}
	
	public Leather(double cost, int dmg, double thick) {
		super(cost,dmg);
		this.thickness = thick;
	}
    // getters and setters
	

	public double getThickness() {
		return thickness;
	}

	public void setThickness(double thickness) {
		this.thickness = thickness;
	}
    // to string
	@Override
	public String toString() {
		return "Leather [cost=" + getCost() + ", damage=" + getDamage() + ", thickness=" + thickness + "]";
	}
	
	
	

}
