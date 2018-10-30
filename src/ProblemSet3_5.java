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
		

		//exercise 1
		System.out.println("Enter starting value: ");
		int start = in.nextInt();
		System.out.println("Enter ending value: ");
		int end = in.nextInt();
		ps.primes(start, end);
		
		//exercise 2
		System.out.println("Enter year: ");
		int year = in.nextInt();
		ps.leapYears(count);
		
		//exercise 3
		System.out.println("Enter number: ");
		int number = in.nextInt();
		ps.palindromicNumbers(number);
		
		//exercise 4
		System.out.println("Enter value: ");
		int n = in.nextInt();
		ps.fibonacci(n);
		
		
		//exercise 5
		System.out.println("Enter x: ");
		int x = in.nextInt();
		System.out.println("Enter y: ");
		int y = in.nextInt();
		System.out.println("Enter limit: ");
		int limit = in.nextInt();
		ps.multiples(x, y, limit);
		
		in.close();
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
	
	public void primes(int start, int end) {
		int count = 0;
		int primeNum = 0;
		if (end > 1) {
			primeNum++;
		}
		for (int i = start; i <= end; i++) {
		    count = 0;
			for(int i = 2; i < start; i++) {
				if (start % i == 0) {
					count++;
				}
				if (i == start - 1) {
					if (count == 0) {
						primeNum++;
					    }
				    }
			    }
			start++;
		}
		if (primeNum == 1) {
			System.out.println("There is " + primeNum + " prime number.");
		}
		else if (primeNum > 1 || primeNum == 0) {
			System.out.println("There are " + primeNum + " prime numbers.");
		}
	}
	
	
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
		int year = 2018;
		boolean isLeapYear = false;
		int leapYear = 0;
		int leapYearNum = 0;
		int number = 0;
		for (int i = 4; i > 0; i--) {
			if ((year + i) % 4 == 0) {
				number = i + (4 * count);
			}
		}
		if (count == 1) {
			System.out.print("The next leap year is ");
			for (int n = 0; n < number; n++) {
				leapYear = year + n;
				isLeapYear = false;
				if ((year + n) % 100 == 0) {
					if ((year + n) % 400 == 0) {
						isLeapYear = true;
					}
					else if ((year + n) % 400 != 0) {
						isLeapYear = false;
					}
				}
				else if ((year + n) % 4 == 0) {
					isLeapYear = true;
				}
				if (isLeapYear == true) {
					System.out.println(leapYear + ".");
				}
			}
		}
		if (count == 2) {
			System.out.print("The next 2 leap years are ");
			for (int n = 0; n < number; n++) {
				leapYear = year + n;
				isLeapYear = false;
				if ((year + n) % 100 == 0) {
					if ((year + n) % 400 == 0) {
						isLeapYear = true;
						leapYearNum++;
					}
					else if ((year + n) % 400 != 0) {
						isLeapYear = false;
					}
				}
				else if ((year + n) % 4 == 0) {
					isLeapYear = true;
					leapYearNum++;
				}
				if (leapYearNum == 1) {
					if (isLeapYear == true) {
						System.out.print(leapYear + " and");
					}
				}
				else {
					if (isLeapYear == true) {
						System.out.println(leapYear + ".");
					}
				}
			}
		}
		else if (count > 2) {
			System.out.print("The next " + count + " leap years are ");
			for (int n = 0; n < number; n++) {
				leapYear = year + n;
				isLeapYear = false;
				if ((year + n) % 100 == 0) {
					if ((year + n) % 400 == 0) {
						isLeapYear = true;
						leapYearNum++;
					}
					else if ((year + n) % 400 != 0) {
						isLeapYear = false;
					}
				}
				else if ((year + n) % 4 == 0) {
					isLeapYear = true;
					leapYearNum++;
				}
				if (leapYearNum == count) {
					if (isLeapYear == true) {
						System.out.println("and " + leapYear + ".");
					}
				}
				else {
					if (isLeapYear == true) {
						System.out.print(leapYear + ", ");
					}
				}
			}
		}
	}
	
	/**
	 * Is @number a palindromic number?
	 * 
	 * Print your solution in the following formats: "X is a palindromic number."
	 *                                               "X is not a palindromic number."
	 *                                               
	 * @param number
	 */
	
	public void palindromicNumbers(int number) {
		int previous = 0;
		int num = 0;
		boolean isPalindromicNumber = false;
		if (number % 2 == 0) {
			if (number % 10 == 0) {
				for (int i = 0; i < 10; i++) {
					if ((number - i) % 10 == 0) {
						num = i;
						previous = i;
					}
				}
			}
			else if (number % 2 == 0) {
				for (int i = 0; i < 10; i++) {
					if ((number - i) % 10 == 0) {
						num = i + 1;
						previous = i;
					}
				}
			}
			if (number % 10 == 0) {
				isPalindromicNumber = false;
			}
			else if ((number - previous) % num == 0) {
				isPalindromicNumber = true;
			}
		}
		else {
			for (int i = 0; i < 10; i++) {
				if ((number - i) % 10 == 0) {
					if ((number - i) % 5 == 0) {
						num = i + (i / 2);
						previous = i;
					}
					else {
						num = i + 1;
						previous = i;
					}
				}
			}
			if ((number - previous) % num == 0) {
				isPalindromicNumber = true;
			}
		}
		if (isPalindromicNumber == false) {
			System.out.println("This is not a palindromic number.");
		}
		else if (isPalindromicNumber == true) {
			System.out.println("This is a palindromic number.");
		}
	}
	
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
		int fibnum = 0;
		for (int i = 0; i <= n; i++) {
			if (i == 0) {
				fibnum = 0;
			}
			if (i == 1) {
			    fibnum = i;
				prevnum1 = fibnum;
			}
			else if (i == 2) {
				fibnum = prevnum1;
				prevnum2 = prevnum1;
			}
			else if (i > 2) {
				fibmum = prevnum1 + prevnum2;
				prevnum2 = prevnum1;
				prevnum1 = fibnum;
			}
		}
		int number = 0;
		for (int i = 0; i < 10; i++) {
			if ((n - i) % 10 == 0) {
				number = i;
			}
		}
		if (number == 1) {
			System.out.println("The " + n + "st Fibonacci number is " + fibnum);
		}
		else if (number == 2) {
			System.out.println("The " + n + "nd Fibonacci number is " + fibnum);
		}
		else if (number == 3) {
			System.out.println("The " + n + "rd Fibonacci number is " + fibnum);
		}
		else {
			System.out.println("The " + n + "th Fibonacci number is " + fibnum);
		}
	}
	
	/**
	 * What is the sum of all multiples of @x and @y less than @limit, where @x, @y, and
	 * @limit are positive integers?
	 * 
	 * Print your solution in the following format: "The sum is X."
	 * 
	 * @param limit
	 *
	 */
	
	public void multiples(int x, int y, int limit) {	
        int countX = 0;
        int countY = 0;
        int sum;
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) { 
                if (i < limit) {
                    countX = countX + i;
                    }
                }
            }
        for (int i = 1; i <= y; i++) {
            if (y % i == 0) { 
                if (i < limit) {
                    countY = countY + i;
                    }
                }
            }
        sum = countX + countY;
        System.out.println("The sum is " + sum);
        }
    }
