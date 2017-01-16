/**
 * Exercise 3-4 of Think Java, 2016.
 * A recursive Guess The Number Game. 
 * Feel free to make improvements!
 * @author Quan Truong
 */

import java.util.*;

public class GuessNumberGameRecursion {

	public static void main(String[] args) {
		int computerValue, userValue;

		// Generate computer value
		Random r = new Random();
		computerValue = r.nextInt(100) + 1;

		// Ask for user input
		Scanner in = new Scanner(System.in);
		System.out.println("I am thinking of a number between 1 and 100.");
		System.out.println("Type your guess: ");
		userValue = in.nextInt();

		// Display user's guess, computer's guess, and the difference
		
		System.out.println("Your guess is: " + userValue);
		System.out.println("You were off by " + Math.abs(userValue - computerValue));

		// Check difference
		equality(userValue, computerValue);
	}

	public static void equality(int param1, int param2) {
		Scanner in = new Scanner(System.in);
		while (param1 != param2) {
			if (param1 < param2) {
				System.out.println("Too low! Enter another number: ");
				param1 = in.nextInt();
			} else if (param1 > param2) {
				System.out.println("Too high! Enter another number: ");
				param1 = in.nextInt();
			} 
		
		}
		
		if (param1 == param2) {
				System.out.println("You got it right! Give yourself a pat on the back!");
		}
	}
}
