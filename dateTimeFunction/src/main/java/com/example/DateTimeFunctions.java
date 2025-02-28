package com.example;

import java.time.*;

public class DateTimeFunctions {

	/*
	 * Update the class and existing methods as necessary to perform the required calculations
	 * and return the expected results.
	 *
	 * - All code should be inside the placeholders provided.
	 * - Do not add code outside of the placeholders.
	 * - Do not change code except as required inside the placeholders.
	 *	    //YOUR CODE STARTS HERE
	 *
	 *		//YOUR CODE ENDS HERE
	 */


	/*
	 * Implement the method so that it returns today's date.
	 */
	public static LocalDate getTodaysDate() {
		//YOUR CODE STARTS HERE
		//This calls Java's built-in method that fetches the current system date.
		//The method then returns the current date as a LocalDate object.
		return LocalDate.now();
		//YOUR CODE ENDS HERE
	}

	/*
	 * Implement the method so that it returns the date x days after
	 * the input date.
	 */
	public static LocalDate getLaterDatebyDays(LocalDate date, int x) {
		//YOUR CODE STARTS HERE
		//Adds x days to the given date and returns a new LocalDate object.
		//This does not modify the original date since LocalDate is immutable.
		return date.plusDays(x);
		//YOUR CODE ENDS HERE
	}

	/*
	 * Implement the method so that it returns the date x weeks prior to
	 * the input date.
	 */
	public static LocalDate getPreviousDatebyWeeks(LocalDate date, int x) {
		//YOUR CODE STARTS HERE
		//Subtracts x weeks from the given date and returns a new LocalDate object.
		//This does not modify the original date since LocalDate is immutable.
		return date.minusWeeks(x);
		//YOUR CODE ENDS HERE
	}

	/*
	 * Implement the method so that it returns the time difference between two input dates
	 * in terms of years, months, and days.
	 * Return the String in the format: "Year-20:Months-5:Days-1"
	 */
	public static String getTimeDifference(LocalDate date1, LocalDate date2) {
		//YOUR CODE STARTS HERE
		// Ensure date1 is earlier than date2 to avoid negative values
		//If date1 is later than date2, it swaps them to avoid negative values
		if (date1.isAfter(date2)) {
			LocalDate temp = date1;
			date1 = date2;
			date2 = temp;
		}
		//Creates a Period object representing the difference between date1 and date2
		Period period = Period.between(date1, date2);
		//Returns the formatted string representation of the time difference.
		return "Years-" + period.getYears() + ":Months-" + period.getMonths() + ":Days-" + period.getDays();
	}
		//YOUR CODE ENDS HERE


	public static void main(String[] args) {
		System.out.println("Today's date is: " + getTodaysDate());
		System.out.println("14 days from today is: " + getLaterDatebyDays(getTodaysDate(), 14));
		System.out.println("5 weeks prior to today was: " + getPreviousDatebyWeeks(getTodaysDate(), 5));
		System.out.println("The difference between today " +
				"and June 30, 2031 is: " +
				getTimeDifference(getTodaysDate(), LocalDate.of(2031,06,30)));
	}
}
