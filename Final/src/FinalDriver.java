import java.util.Scanner;
import java.util.ArrayList;

/**
 * 
 * @author <Abdulai Bah>
 *
 */
public class FinalDriver {

	public static void main(String[] args) {

		// DATA BLOCK - city list and time difference from EST
		String[] cities = { "London", "Paris", "Rome", "Seattle", "Tokyo" };
		int[] timeDeltas = { 6, 7, 8, -3, -12 };

		// TODO: create the ArrayList of TimeDifference objects using new operator
		
		ArrayList<TimeDifference> cities2 = new ArrayList<TimeDifference>();
		
		


		// TODO: load the array list with the data with a regular for loop
		for (int i = 0; i < cities.length; i++) {
		
			TimeDifference city = new TimeDifference(cities[i],timeDeltas[i]);
			cities2.add(city);

		}

		// TODO: create Scanner object
		
		Scanner input = new Scanner(System.in);
		

		// create a variable to hold a Time object reference
		Time inputTime;

		// prompt for a valid current time
		inputTime = getValidTime(input);

		// flush input buffer stream
		input.nextLine();

		// TODO: prompt for desired city name and receive input String
		
		


		// TODO: loop to prompt user for city and call findCityTime or quit
		do {
			// TODO: call findCityTime with appropriate arguments
			//System.out.println(findCityTime();

			// prompt for next city or Q to quit
			System.out.print("\nPlease enter a city or \"Q\" to quit: ");
			cityChoice = input.nextLine();

		} while (!cityChoice.equalsIgnoreCase("Q"));

		// TODO: display goodbye message

		// close Scanner
		input.close(); // close Scanner

	} // end of method main

	private static Time getValidTime(Scanner input) {

		// declare constant stings for error messages and prompt
		int counter  = 0;
		
		final String ERROR_HRS = 
			"Invalid entry for hours. Please enter values between 0 and 23.";

		final String ERROR_MIN = 
			"Invalid entry for minutes. Please enter values between 0 and 59.";

		final String ERROR_SEC = 
			"Invalid entry for seconds. Please enter values between 0 and 59.";

		final String TIME_PROMPT = 
		"Current EST in HH MM SS format? (e.g., for 2:45 PM Enter: 14 45 00): ";

		System.out.print(TIME_PROMPT);

		// declare local variables
		int hours, minutes, seconds;

		// TODO: accept the 3 integers (hours, minutes, seconds) as input and
		// create a time object 

		// TODO: error trap loop to ensure values are appropriate for HH MM SS

		boolean inputError = false, inputErrorHours = false,
				inputErrorMins = false, inputErrorSecs = false;

		 do {
			 System.out.print(TIME_PROMPT);
			    String bruh = input.nextLine();

			    String[] parts = bruh.split(" ");
			    hours = Integer.parseInt(parts[0]);
			    minutes = Integer.parseInt(parts[1]);
			    seconds = Integer.parseInt(parts[2]);
			    
			   if(hours < 0 || hours > 23) {
				   System.out.println(ERROR_HRS);
			   }else {
				   inputErrorHours = true;
				   counter++;
			   }
			   
			   if(minutes < 0|| minutes > 59){
				   System.out.println(ERROR_MIN);
			   }else {
				   inputErrorMins = true;
				   counter++;
			   }
			   
			   if(seconds < 0|| seconds > 59){
				   System.out.println(ERROR_SEC);
			   }else {
				   inputErrorSecs = true;
				   counter++;
			   }
			   
			   
			   
			   if(counter == 3) {
				   inputError = true;
			   }
			 

		 } while (inputError);

		// create and return valid EST object
		return new Time(hours, minutes, seconds);
	}

	// Method:
	private static String findCityTime(ArrayList<TimeDifference> array,
			String city, Time EST_Time) {

		/*
		 * INPUT state: The function gets the TimeDifference ArrayList, its
		 * size, the name of the city to find, and a Time object that holds the
		 * current Eastern Standard Time (EST).
		 * 
		 * Function Description: The function looks for the city name in the
		 * TimeDifference ArrayList. If the city is found, the function computes
		 * and outputs the name and correct local time for that city to a return
		 * string.
		 * 
		 * If the city is not found, the function returns a string with �City
		 * not found�. The function must ensure time values are adjusted to
		 * remain between 00:00:00 and 24:00:00.
		 * 
		 * OUTPUT state: No values are changed by the function and and string is
		 * returned.
		 */

		// TODO: instantiate a Time object
		Time localTime = new Time();

		// TODO: search for the city by looping through ArrayLIst of
		// TimeDifference objects.
		for (TimeDifference x :array ) {

			//TODO: check if the city provided matched this element's city
			if (city == x.getCityName()) {


				// TODO: IF city found, add time delta.
				EST_Time.setNumHours(EST_Time.getNumHours()+x.getTimeZoneDelta());
				
				EST_Time.setNumSeconds(EST_Time.getNumHours()+x.getTimeZoneDelta());
				
				EST_Time.setNumMinutes(EST_Time.getNumHours()+x.getTimeZoneDelta());
				
				
				// TODO: If resulting hours calculation yields value greater > 24,
				//       deduct 24 to hours value.
				
				
				// TODO: If resulting hours calculation yields value greater < 0,
				//       add 24 to hours value.


				// TODO: Use setter methods of Time object to update the time 
				//       object instance fields.


			} // end if city found

		} // end of enhanced for

		//TODO: return appropriate message for whether or not city was found.
		//
		if () {
			return "Current Time in " + city + " is: " + localTime + "\n";
		} else {
			return "City not found.";
		}

	} // end of method dislayCurrentTime

} // end of class FinalPracticumDriver

blic class TimeDifference {

	// declare instance fields
	private String cityName;
	private int timeZoneDelta;
	
	// TODO: Create zero argument constructor
	
	public TimeDifference() {
		this.cityName = "";
		this.timeZoneDelta = 0;
	}
	
	

	// TODO: Create full argument constructor
	public TimeDifference(String name, int time) {
		this.cityName = name;
		this.timeZoneDelta = time;
	}
	
	// TODO: Create accessor and mutator methods (i.e., gets and sets)

	public String getCityName() {
		return cityName;
	}



	public void setCityName(String cityName) {
		this.cityName = cityName;
	}



	public int getTimeZoneDelta() {
		return timeZoneDelta;
	}



	public void setTimeZoneDelta(int timeZoneDelta) {
		this.timeZoneDelta = timeZoneDelta;
	}



	
	

	// TODO: Create toString method
	
	@Override
	public String toString() {
		return "TimeDifference [cityName=" + cityName + ", timeZoneDelta=" + timeZoneDelta + "]";
	}
	
	
	
	
}

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


