package Tests;

import java.util.Arrays;
import java.util.Random;

/**
 * Page 110 from Think Java 2016.
 * 
 * @author Quan Truong Jan 5, 2017 3:41:22 AM
 */
public class Histogram {

	/**
	 * Count the number of elements that fall in a given range.
	 * 
	 * @param a
	 *            The array to be searched.
	 * @param low
	 *            The low number to search.
	 * @param high
	 *            The high number to search.
	 * @return
	 */
	public static int inRange(int[] a, int low, int high) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] >= low && a[i] <= high) {
				count++;
			}
		}
		return count;
	}

	/**
	 * Creates an array of random values.
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

		// Creates a random array with 100 values and copies it to scores
		int[] scores = randomArray(99);

		// Use the printArray method to print scores
		printArray(scores);

		// DURRR
		int[] counts = new int[(scores.length + 1)];
		for (int i = 0; i < scores.length; i++) {
			int index = scores[i];
			counts[index]++;

		}

		printArray(counts);

		/*
		 * Check how many times elements fall within given range
		 * 
		 * int a = inRange(scores, 50, 59); System.out.
		 * println("The amount of elements within the 50-59 range is: " + a);
		 * int b = inRange(scores, 60, 69);
		 * 
		 * System.out.
		 * println("The amount of elements within the 60-69 range is: " + b);
		 * int c = inRange(scores, 70, 79); System.out.
		 * println("The amount of elements within the 70-79 range is: " + c);
		 * int d = inRange(scores, 80, 89); System.out.
		 * println("The amount of elements within the 80-89 range is: " + d);
		 * int e = inRange(scores, 90, 100); System.out.
		 * println("The amount of elements within the 90-100 range is: " + e);
		 */

		// MANUALLY prints all the values in a given array
		/*
		 * System.out.print("The random values in this array are: ");
		 * System.out.print("{" + scores[0]); for (int i = 1; i < scores.length;
		 * i++) { System.out.print(", " + scores[i]); } System.out.println("}");
		 */

		// System.out.println(Arrays.toString(randomArray(99)));

	}

}
