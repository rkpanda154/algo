package math;

/*Given an integer n, return the number of trailing zeroes in n!.

Note: Your solution should be in logarithmic time complexity.

Example :

n = 5
n! = 120 
Number of trailing zeros = 1
So, return 1*/

public class TrailingZerosInFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Rajesh :" + trailingZeroes(20));
	}

	public static int trailingZeroes(int A) {
		int count = 0;
		for (int i = 5; i >= 1; i *= 5) {
			count += A/i;
		}
		return count;
	}

}
