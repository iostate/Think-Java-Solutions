package Exercises;

public class gauss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(gauss(3, 7));
		
		System.out.println("Gauss(3,7) equals " + gauss(3,7) + " but does it equal " + (1 - (3*3) + (-1*(387420489/153400)))      );
	}

	public static double gauss(double x, int accuracy) {
		// set ansX to x^2
		double ansX = x * x;

		// set ans to 0
		double ans = 0;

		// set sign to -1 to begin
		double sign = -1;

		// set int to 2, so we begin at 2nd iteration
		int i = 2;

		// replacement for factorial. set denominator to 1, then times by i.
		double denom = 1;

		// while i is smaller than accuracy, perform this calculation
		while (i <= accuracy) {
			
			sign = sign * -1;

			// every loop, make the exponent increase by 2
			ansX = ansX * x * x;

			// increase the denominator every loop to match factorial
			denom = denom * i;

			// add the sum to the answer every loop
			ans = ans + sign * ansX / denom;
			
			//increase i every loop
			i = i + 1;

		}

		return (1 - (x * x) + ans);

	}
}
