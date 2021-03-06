package Exercises;

/**
 * The Sieve of Eratosthenes is a "simple, ancient algorithm for finding all prime numbers up to any given limit," 
 * which you can read about at https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes.
 * 
 * Write a method called sieve that takes an integer parameter, n, and returns a boolean array that 
 * indicates, for each number from 0 to n-1, whether the number is prime.
 * 
 * Some additional resources:
 * 
 * Below is how to solve the Sieve of Eratosthenes'. I suggest learning how this algorithm works in English before Java.
 * 
 * Sieve of Eratosthenes' Algorithm explained: https://www.khanacademy.org/computing/computer-science/cryptography/comp-number-theory/v/sieve-of-eratosthenes-prime-adventure-part-4
 * 
 * 
 * Sieve of Eratosthenes' Java: https://www.youtube.com/watch?v=n6Jk1yGsml8
 */
import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class sieveEratosthenes85 {

	public static void main(String[] args) {
		sieve(25);
	}

	/**
	 * Returns a boolean value for each element. True if it is prime, false if it is not.
	 * @param N 
	 * @return
	 */
	public static boolean[] sieve(int N) {
		
		// initialize boolean array full of true values.
		boolean[] isPrime = new boolean[N];
		isPrime[0] = false;
		for (int c = 1; c < N; c++) {
			isPrime[c] = true;
		}
		// check every number greater than 2  for primality 
		//Only checking numbers above 2 because isPrime[0] is already set to false & isPrime[1] is already set to true (in above loop)
		for (int i = 2; i <= N; i++) {

			// isPrime[2-1] is actually isPrime[1] which is the value 2..
			if (isPrime[i - 1]) {

				// cross off all subsequent multiples of i
				for (int j = 2 * i; j <= N; j += i) {
					isPrime[j - 1] = false;
				}
			}
		}
		
		//Tells us whether each variable is true or false.
		//The way the output is tells us the index of isPrime...followed by.."which is" (insert actual number the index represents) ... is (true/false)
		for (int z = 0; z < N; z++) {
			if (isPrime[z]) {
				System.out.println("isPrime[" + z + "] which is " + (z+1) + " is true");
			} else {
				System.out.println("isPrime[" + z + "] which is " + (z+1) + " is false");
			}
		}
		return isPrime;
	}
}


