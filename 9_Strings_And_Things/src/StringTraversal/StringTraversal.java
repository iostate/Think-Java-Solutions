package StringTraversal;

import java.util.Scanner;

/**
 * String Traversal page 119 THink Java 2016
 * 
 * charAt method is discussed in here
 * 
 * Created a method to select a character from the array.
 * 
 * @author Quan Truong
 *
 */

public class StringTraversal {

	public static void main(String[] args) {
		String name = "Quan Minh Truong Minh ";

		// CHARAT
		// select letter M using charAt function
		char letter = name.charAt(6);

		System.out.println(letter);

		selectChar(name, 5);

		// COMPARETO FUNCTION
		String myName = "Quan Truong";
		String yourName = "Quan Nguyen";

		int diffOfNames = myName.compareTo(yourName); // -1 if myName comes
														// before yourName.
														// Otherwise, returns
														// positive.

		System.out.println("This will return \"-1\" if myName comes before yourName. If it returns positive"
				+ " then yourName came before myName: " + diffOfNames);

		// insert hours in 24 hr format
		System.out.println(timeString(23, 12));

		// PARSE INT
		// Ask for input
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a number to multiply by 2: ");
		String input = in.nextLine();

		// Convert string to integer
		int stringToNum = Integer.parseInt(input);

		// Print and perform the expression
		System.out.println("stringToNum * 2 = " + stringToNum * 2);

		// PARSE BOOLEAN
		String truu = "true";
		Boolean trueOrFalse = Boolean.parseBoolean(truu);

		System.out.println(trueOrFalse);

		// STRING TRAVERSAL
		
		String traverseThis = "traverse This";
		traverseArray(traverseThis);
	}

	/**
	 * Selects a character from an array and prints it
	 * 
	 * @param string
	 *            Pull a character from this array
	 * @param n
	 *            The number of the index
	 * @return char value. Returns a character from the string
	 */
	public static char selectChar(String string, int n) {

		char letter = string.charAt(n);

		System.out.println(letter);
		return letter;
	}

	/**
	 * SUBSTRING:
	 * 
	 * Extracts a part of a string. Usage: For the ending letter, insert the
	 * letter before the one you want it to end at.
	 * 
	 * @param string
	 *            The string to be extracted from.
	 * @param begin
	 *            The beginning of what is to be extracted
	 * @param end
	 *            The ending of what is to be extracted. Insert the letter
	 *            before the one where you want it to end at
	 */
	public static String extract4rmString(String string, String n, String o) {
		String result;

		result = string.substring(string.indexOf(n), string.indexOf(o) + 1);

		System.out.println(result);
		return result;
	}

	/**
	 * REVERSE A STRING WITH A FOR LOOP
	 * 
	 * @param s
	 *            The string to be reversed
	 * 
	 * @return The string reversed in the variable r
	 */
	public static String reverse(String s) {
		String r = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			r = r + s.charAt(i);
		}
		return r;
	}

	/**
	 * Prints the count and character of every element in an array.
	 * 
	 * @param name
	 *            The name of the string to be traversed.
	 */
	public static void traverseArray(String name) {
		for (char i : name.toCharArray()) {
			System.out.print(i);

		}
	}

	// STRING FORMATTING pg. 122

	/**
	 * Takes hour and minute integers and formats it to show time with AM/PM at
	 * end.
	 * 
	 * @param hour
	 *            Insert the hour.
	 * @param minute
	 *            Insert the minutes.
	 * @return String of formatted time with AM/PM concatenated at the end.
	 */
	public static String timeString(int hour, int minute) {

		String ampm;
		// if hour is below 12 then set it "AM" and also if it is set to 0 then
		// set the hour = 12
		if (hour < 12) {
			ampm = "AM";
			if (hour == 0) {
				hour = 12;
			}
		} else {
			ampm = "PM";
			hour = hour - 12;
		}
		return String.format("%02d:%02d %s", hour, minute, ampm);
	}

}
