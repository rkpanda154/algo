package math;

/*You are given two positive numbers A and B. You need to find the maximum valued integer X such that:

X divides A i.e. A % X = 0
X and B are co-prime i.e. gcd(X, B) = 1
For example,

A = 30
B = 12
We return
X = 5*/


public class LargestCoprimeDivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Rajesh :" + cpFact(20,32));
	}
	public static int cpFact(int A, int B) {
		while(gcd(A,B) !=1) {
			A= A/gcd(A,B);
		}
		return A;
    }
	public static int gcd(int A, int B) {
		if(A==0) return B;
		if(B==0) return A;
		if(A==B) return A;
		if(A<B) return gcd(A, B-A);
		else return gcd(A-B, B);
    }
}
