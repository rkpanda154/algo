package math;

/*Given 2 non negative integers m and n, find gcd(m, n)

GCD of 2 integers m and n is defined as the greatest integer g 
such that g is a divisor of both m and n.
Both m and n fit in a 32 bit signed integer.

Example

m : 6
n : 9

GCD(m, n) : 3 */

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Rajesh :" + gcd(20,32));
	}
	public static int gcd(int A, int B) {
		if(A==0) return B;
		if(B==0) return A;
		if(A==B) return A;
		if(A<B) return gcd(A, B-A);
		else return gcd(A-B, B);
    }

}
