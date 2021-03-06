package Exercises;
/**
 * Beer bottles exercise #4.3 from Think Java, 2016.
 * @author Quan Truong
 *
 */



public class BeerBottles {
	
	
	/**
	 * Method below uses recursion to keep calling itself until a condition is met. In this case, the condition is n == 0.
	 * @author Quan Truong
	 *
	 */
	public static void countdown(int n) {
		if (n == 0) {
			System.out.println("No bottles of beer on the wall!");
		} else {
			System.out.println(n + "bottle of beer on the wall");
			
			//calls itself again here
			countdown(n-1);
		}
	}
	
	public static void main(String[] args) {
		countdown(100);
	}
	
	
}
