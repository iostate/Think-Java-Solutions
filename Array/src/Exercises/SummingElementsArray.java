package Exercises;
import java.util.Arrays;

public class SummingElementsArray {

	public static void main(String[] args) {

		int[] count, values;
		int n = 14;
		int ans = 0;
		int sum = 0;
		
		count = new int[4];
		
		values = new int[6];
		
		count[0] = 4;
		count[1] = count[1] + 2;
		
		for (int i = 1; i < n; i++) {
			ans = count[1]++;
			sum = sum + ans;
		}
		System.out.println(sum);
		
		
		System.out.println(count[1]);

	}

	/*
	 * Returns the value of x index in array
	 * @param x The number of index to be returned.
	 */
	
	public static int array(int x) {

		int bucky[] = { 21, 16, 32, 24, 21, 3 };

		int sum = 0;

		for (int counter = 0; counter < bucky.length; counter++) {
			sum += bucky[counter];
		}
		// Sums the elements of the array
		System.out.println("The sums of the numbers are " + sum);

		//Prints the value of bucky[x]
		System.out.println(bucky[x]);

		return bucky[x];
	}
}
