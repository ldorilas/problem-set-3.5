/**
 * INSTRUCTIONS.
 * 
 * The following exercises are, perhaps, more mathematically inclined than previous
 * problem sets. While they might be challenging, they are certainy doable.
 * 
 * You can (and should!) solve each of them using only the operators, conditional control
 * structures, and iterative control strucurs we've covered. You are not permitted to use
 * recursive code in your solutions.
 * 
 * Please be mindful of the expected outputs, as your code will be tested against that
 * directly. If you're unsure, please ask for clarification.
 * 
 * This problem set is worth 25 points and is due no later than 11:59pm on October 28, 2018.
 */
import java.util.Scanner;
public class ProblemSet3_5 {
	
	public static void main(String[] args) {
		ProblemSet3_5 ps = new ProblemSet3_5();
		Scanner in = new Scanner(System.in);
		
		/**System.out.println("Enter starting value: ");
		int start = in.nextInt();
		System.out.println("Enter ending value: ");
		int end = in.nextInt();
		// test your solutions here
		ps.primes(start, end);
		
		System.out.println("Enter year: ");
		int year = in.nextInt();
		ps.leapYears( );
		
		System.out.println("Enter number: ");
		int number = in.nextInt();
		ps.palindromicNumbers(number);
		*/
		
		System.out.println("Enter value: ");
		int n = in.nextInt();
		ps.fibonacci(n);
	}
	/**
	 * How many prime numbers are there between @start and @end, where @start and @end
	 * are positive integers in the range [1, @Integer.MAX_VALUE]?
	 * 
	 * Print your solution in the following formats: "There is X prime number."
	 *                                               "There are X prime numbers."
	 * 
	 * @param start
	 * @param end
	 */
	
	/**public void primes(int start, int end) {
		int count = 0;
		if (start <= 0) {
			System.out.println("Enter a POSITIVE, NONZERO value: ");
		}
		int i = 2;
		while (start < end) {
			if ((start % i != 0) && (end % i != 0)) {
				count++;
			}
			while () {
				if () {
					
				}
			}	
		}
		if (count != 1) {
			System.out.println("There are " + count + " prime numbers.");
			}		
		else if (count == 1) {
			System.out.println("There is " + count + " prime numbers.");
			}
		}
	*/
	
	/**
	 * What are the next @count leap years?
	 * 
	 * Print your solution in the following formats: "The next leap year is X."
	 *                                               "The next 2 leap years are X and Y."
	 *                                               "THe next N leap years are A, ..., X, Y, and Z."
	 * 
	 * @param count
	 */
	
	public void leapYears(int count) {

	}
	
	/**
	 * Is @number a palindromic number?
	 * 
	 * Print your solution in the following formats: "X is a palindromic number."
	 *                                               "X is not a palindromic number."
	 *                                               
	 * @param number
	 */
	
	/**public void palindromicNumbers(int number) {
		boolean isPalindromic = false;
		for (int i = 0; i < number; i++) {
			if (number ) {
				isPalindromic = true;
			}
		}
	}
	*/
	
	/**
	 * What is the @nth Fibonacci number, where @n is a positive integer?
	 * 
	 * Print your solution in the following formats: "The 21st Fibonacci number is X."
	 *                                               "The 22nd Fibonacci number is X."
	 *                                               "The 23rd Fibonacci number is X."
	 *                                               "The 24th Fibonacci number is X."
	 *                                               
	 * @param n
	 */
	
	public void fibonacci(int n) {
		int prevnum1 = 0;
		int prevnum2 = 1;
		// 1 = 0 + 1
		if (n == 1) {
			int fibnum = prevnum1 + prevnum2;
			System.out.println("The " + n + "st Fibonacci number is " + fibnum + ".");
			}
		else if (n == 2) {
			int fibnum = fibnum + prevnum2;
			System.out.println("The " + n + "nd Fibonacci number is " + fibnum + ".");
			}
			for (int i = 1; i > 0; i++) {
				if (n > 2) {
					int fibnum1 = fibnum;
					int fibnum2;
					fibnum2 = prevnum2;
					fibnum1 = fibnum2 + fibnum1;
				}
				// 2 = 1 + 1 
				// 3 = 2 + 1
				// 5 = 3 + 2
				// 8 = 5 + 3
				// 13 = 8 + 5
				// 21 = 13 + 8	
			}
			System.out.println("The " + n + "th Fibonacci number is " + fibnum + ".");
		}
	}
	
	/**
	 * What is the sum of all multiples of @x and @y less than @limit, where @x, @y, and
	 * @limit are positive integers?
	 * 
	 * Print your solution in the following format: "The sum is X."
	 * 
	 * @param limit
	 */
	
	public void multiples(int x, int y, int limit) {
		
	}
}
