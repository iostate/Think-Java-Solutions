package Exercises;

/**
 * Exercise 8-4 of Think Java, 2016.
 * 
 * The book asks if indexOfMax can be written with an enchanced for loop. The answer is no, because an enchanced for loop
 * will not allow you to return a specific value. It is only useful when you need to "step through" every index of a loop. 
 * To return a value, it is better suited to use the traditional for loop. 
 * Source: https://www.cis.upenn.edu/~matuszek/General/JavaSyntax/enhanced-for-loops.html
 * 
 * @author Quan Truong
 *
 */

public class indexOfMax84 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2,3,4,5,6,7,8,9};
		
		System.out.println(indexOfMax(a));
		
	}
	
	/**
	 * Returns the highest value in an array.
	 * @param a The array to be searched for highest value.
	 * @return The highest value in an array.
	 */
	public static int indexOfMax(int[] a) {
		
		int maxValue = a[0];
		
		for (int i = 1; i < a.length; i++) {
			if (a[i] > maxValue)
				maxValue = a[i];
		
		}
		return maxValue;
	}

}
