/**
 * Exercise 7-5 of think Java, page 101/ Uses factorial method from page 79
 * Infinite series expansion problem.
 * 
 * @author Quan Truong
 *
 */
public class Factorial {

	public static void main(String[] args) {
		check(1);
		System.out.println(Math.exp(1));

	}

	public static double myexp(double x, int n) {
		System.out.println("No. of terms to be added in the " + "series e ^ " + x + ": " + n);
		// declarations for the loop
		double ansX = x;
		double ans = 0;
		int i = 2;
		double denom = 1;
		while (i <= n) {
			ansX = ansX * x;
			denom = denom * i;
			ans = ans + ansX / denom;
			i = i + 1;
		}
		return (1 + x + ans);
	}
	
	public static void check(double x) {
		int n = 18;
		System.out.println(x + "\t" + Math.exp(x) + "\t" + myexp(x,n));
	}

	// i counts down starting from (x-1)
	public static double factorial(int n) {
		if (n == 0) {
			return 1;
		}
		return n * factorial(n - 1);

	}

}
