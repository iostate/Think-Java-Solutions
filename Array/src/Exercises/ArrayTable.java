package Exercises;

import java.util.Arrays;

public class ArrayTable {

	public static void main(String[] args) {

		/*
		 * 
		 * // Formatted header to display values //
		 * System.out.println("Index\tValue");
		 * 
		 * // Array
		 */
		int array[] = { 2, 4, 5, 6, 2, 3 };

		double squareNumbers[] = { 2, 3, 4, 5, 6, 7 };
		
		//Copy squareNumbers to another array
		double b[];
		
		b = Arrays.copyOf(squareNumbers, squareNumbers.length);
		
		System.out.println("b[3] = " + b[3]);

		squareArray(squareNumbers);

		/*
		 * // for loop that displays the value in the same format as header for
		 * (int counter = 0; counter < array.length; counter++) {
		 * System.out.println(counter + "\t" + array[counter]); }
		 * 
		 * int[] b = { 2, 4, 6, 8, 10, 12 };
		 * 
		 * printArray(b);
		 * 
		 * // Display the values of b using java.util.arrays
		 * System.out.println(Arrays.toString(b));
		 * 
		 * 
		 * 
		 * 
		 * int[] a = {2,4,6,7};
		 * 
		 */

		// Copy elements of an array. Must create the destination array.
		int[] biggs = new int[array.length];
		copyElementsOfArray(array, biggs);

//		squareArray(squareNumbers);

	}

	/**
	 * Copies elements of one array to another using Arrays.copyOf()
	 * Arrays.copyof(nameOfArrayToBeCopied, numberOfIndexesToCopyBeginningFrom0)
	 */

	public static void copyArray() {
		double[] a = new double[3];
		// Values for a
		a[0] = 17;
		a[1] = 12;
		a[2] = 14;

		// Reference to array "a"
		// double[] b = a;

		// Copy elements from a to b using java.util.arrays
		double[] b = Arrays.copyOf(a, 3);

		// Copy first 2 elements of b to c
		double[] c = Arrays.copyOf(b, 1);

		// Copy all elements of b to c
		c = Arrays.copyOf(b, b.length);

		// Entering the array into sys.out gives error. Use java.util.arrays or
		// write a for loop to display it
		// System.out.println(c);

		// Display array "c" using java.util.Arrays
		System.out.println(Arrays.toString(c));

		// Copy elements from a to b, instead of just referencing
		for (int i = 0; i < a.length; i++) {
			a[i] = b[i];
			System.out.println(b[i]);

		}

	}

	public static void copyElementsOfArray(int[] source, int[] dest) {
		dest = Arrays.copyOf(source, source.length);

		System.out.println(Arrays.toString(dest));
	}

	/**
	 * Square and display all numbers in a double array.
	 * 
	 * @param b The double array whose elements will be squared.
	 * 
	 */

	public static void squareArray(double[] b) {
	
		System.out.print("{" + b[0]);
		
		for (int i = 1; i < b.length; i++) {
			b[i] = b[i] * b[i];
			System.out.print(", " + b[i]);
		}
		
		System.out.println("}");
		
	}

	/**
	 * Display the values of an array using a for loop with a nested if/else
	 * statement.
	 * 
	 * If/else statement is used to exclude the last "," in the array.
	 * 
	 * @param b
	 *            is the array to be displayed.
	 */

	public static void printArray(int[] b) {

		System.out.print("{");

		// Display the values of an array using a for loop with a nested if and
		// else loop

		for (int i = 0; i < b.length; i++) {
			// if it is the last index of the array, then don't add a comma
			if (i == (b.length - 1)) {
				System.out.print(b[i]);
				// if it's any other index, add the comma
			} else {
				System.out.print(b[i] + ", ");
			}
		}
		System.out.println("}");

		// Display the values of an array using java.util.Arrays

	}

}
