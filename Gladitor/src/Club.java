// CMSY 166 Arena of Doom
// Copyright 2021 Howard Community College
// Abdulai Bah
// @version 3
public class Club extends Weapon{
	// instance variables
	
	String woodType;
    // setters and getters
	public String getWoodType() {
		return woodType;
	}

	public void setWoodType(String woodType) {
		this.woodType = woodType;
	}
	
	
	// constructors 
	public Club() {
		super(1.0,2);
		this.woodType = "oak";
	}
	
   

	public Club(double cost,int damage,String wood) {
    	super(cost,damage);
    	this.woodType = wood;
    	
    }
	
    // to String Method
	 public String toString() {
	        return "Club Attributes [Cost =" + getCost() + ", Damage=" + getDamage() +  ", woodType=" + woodType + "]";
	    }
	
	
	

}
