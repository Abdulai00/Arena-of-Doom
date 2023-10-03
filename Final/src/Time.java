
public class Time {

	// declare instance fields
	private int numHours;
	private int numMinutes;
	private int numSeconds;

	// TODO: Create full argument constructor
	
	public Time(int hours, int minutes, int seconds) {
		this.numHours = hours;
		this.numMinutes = minutes;
		this.numSeconds = seconds;
			
	}


	// TODO: Create zero argument constructor
	public Time() {
		this.numHours = 0;
		this.numMinutes = 0;
		this.numSeconds = 0;
	}
	
	


	// TODO: Create accessor and mutator methods (i.e., gets and sets)
	
	public int getNumHours() {
		return numHours;
	}


	public void setNumHours(int numHours) {
		this.numHours = numHours;
	}


	public int getNumMinutes() {
		return numMinutes;
	}


	public void setNumMinutes(int numMinutes) {
		this.numMinutes = numMinutes;
	}


	public int getNumSeconds() {
		return numSeconds;
	}


	public void setNumSeconds(int numSeconds) {
		this.numSeconds = numSeconds;
	}
	
	
	
	


	/**
	 * 
	 * @param value
	 */
	private static String displayTwoDigits(int value) {
		String result = "";
		if (value < 10) {
			result = "0" + value;
		} else {
			result += value;
		}

		return result;
	} // end method displayTwoDigits

	


	@Override
	public String toString() {

		String output = "";

		output += displayTwoDigits(numHours) + ":"
				+ displayTwoDigits(numMinutes) + ":"
				+ displayTwoDigits(numSeconds);

		return output;
	}

}
