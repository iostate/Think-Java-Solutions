package Tests;

import java.util.Arrays;

public class CopyElementsInArray {

	public static void main(String[] args) {
		// The array to be copied
		int array[] = { 2, 4, 5, 6, 2, 3 };

		// Destination array
		int[] biggs = Arrays.copyOf(array, array.length);
		System.out.println(Arrays.toString(biggs));
		
		
		
		//Copy the elements
//		copyElementsOfArray(array, biggs);
		
		
		 /*Copy an array
		 * for (int i = 0; i<array.length;i++) {
			biggs[i] = array[i];
			System.out.println(biggs[i]);
		}*/

	}

	/**
	 * THIS IS BASICALLY USELESS SINCE YOU CAN JUST USE newArray = Arrays.copyOf(sourceArray, array.length)
	 * Copy the elements from a source array and paste them in a destination array.
	 * @param source Source array of integer type.
	 * @param dest Destination array of integer type.
	 */
	
	public static void copyElementsOfArray(int[] source, int[] dest) {
		//Specify to copy all the elements using .length
		 dest = Arrays.copyOf(source, source.length);
		 
		 //Arrays.toString is the easiest method to print an array
		 System.out.println(Arrays.toString(dest));
	}
	
}
