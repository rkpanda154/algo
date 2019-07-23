package math;

/*Given a positive integer which fits in a 32 bit signed integer,
 *  find if it can be expressed as A^P where P > 1 and A > 0. 
 *  A and P both should be integers.

Example

Input : 4
Output : True  
as 2^2 = 4. */

public class PowerOfTwoIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Rajesh :" + isPower(1024000000));
	}

	// public static int isPower(int A) {
	// while(A%100 == 0) {
	// A = A/100;
	// }
	// for(int i=1; i<=Math.sqrt(A);i++) {
	// int j=2;
	// int p= (int) Math.pow(i, j);
	//
	// while(p<=A && p>0 && j<A) {
	// if(p==A) return 1;
	// j++;
	// p= (int) Math.pow(i, j);
	// }
	// }
	// return 0;
	// }
	public static int isPower(int A) {
		if (A == 1)
			return 1;
		for (int i = 2; i * i <= A; i++) {
			int p = A;
			while (p % i == 0) {
				p /= i;
			}
			if (p == 1)
				return 1;
		}
		return 0;
	}
}
