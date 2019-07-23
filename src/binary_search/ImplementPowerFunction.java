package binary_search;

/*Implement pow(x, n) % d.

In other words, given x, n and d,

find (x ^n % d)

Note that remainders on division cannot be negative. 
In other words, make sure the answer you return is non negative.

Input : x = 2, n = 3, d = 3
Output : 2

2^3 % 3 = 8 % 3 = 2.
*/
public class ImplementPowerFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Rajesh :" + pow(-1,1,20));
	}


	public static int pow(int x, int n, int d) {
		int rem = (int)power(x, n) % d;
		if(rem < 0) rem = rem+d;
		return rem;
	}
	
	public static long power(int x, int n) {
		if(n ==0) return 1;
		long temp = power(x, n/2);
		if(n % 2 ==0) return temp * temp;
		else return x* temp * temp;
	}

}
