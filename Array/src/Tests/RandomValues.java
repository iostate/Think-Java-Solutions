package Tests;

import java.util.Arrays;
import java.util.Random;

public class RandomValues {

	/**
	 * Creates an array full of random values.
	 * 
	 * @param size
	 *            The size of the array.
	 * @return Returns an integer array full of random values.
	 */
	public static int[] randomArray(int size) {
		Random random = new Random();
		int[] a = new int[size];
		for (int i = 0; i < a.length; i++) {
			a[i] = random.nextInt(100);
		}
		return a;
	}

	/**
	 * Display the values of an array using a for loop with a nested if/else
	 * statement.
	 * 
	 * If/else statement is used to exclude the last "," in the array.
	 * 
	 * @param b
	 *            Integer array. The array to be printed.
	 */
	public static void printArray(int[] b) {

		System.out.print("The values in this array are: ");
		System.out.print("{");

		// Display the values of an array using a for loop with a nested if and
		// else statement

		for (int i = 0; i < b.length; i++) {

			// if it is the last index of the array, then don't add a comma (so
			// it looks pretty)
			if (i == (b.length - 1)) {
				System.out.print(b[i]);
				// if it's any other index besides the last, then go ahead & add
				// the comma
			} else {
				System.out.print(b[i] + ", ");
			}
		}
		System.out.println("}");

		// Display the values of an array using java.util.Arrays

	}

	public static void main(String[] args) {

		// Creates a random array with 100 values and copies it to newArray
		int[] newArray = Arrays.copyOf(randomArray(99), ((randomArray(99).length)));

		// Use the printArray method to print newArray
		printArray(newArray);

		// MANUALLY prints all the values in a given array
		/*
		 * System.out.print("The random values in this array are: ");
		 * System.out.print("{" + newArray[0]); for (int i = 1; i <
		 * newArray.length; i++) { System.out.print(", " + newArray[i]); }
		 * System.out.println("}");
		 */

		// System.out.println(Arrays.toString(randomArray(99)));

	}

}
