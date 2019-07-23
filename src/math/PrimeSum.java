package math;

import java.util.ArrayList;

/*Given an even number ( greater than 2 ), return two prime numbers 
 * whose sum will be equal to given number.

NOTE A solution will always exist. read Goldbach’s conjecture

Example:


Input : 4
Output: 2 + 2 = 4

If there are more than one solutions possible, return the
 lexicographically smaller solution.

If [a, b] is one solution with a <= b,
and [c,d] is another solution with c <= d, then

[a, b] < [c, d] 

If a < c OR a==c AND b < d. 

*/
public class PrimeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Rajesh :" + primesum(16777214));
	}

//	public static ArrayList<Integer> primesum(int A) {
//		ArrayList<Integer> output = new ArrayList();
//		ArrayList<Boolean> isPrimeList = new ArrayList();
//
//		for (int i = 0; i <= A; i++) {
//			isPrimeList.add(true);
//		}
//		isPrimeList.set(0, false);
//		isPrimeList.set(1, false);
//		for (int i = 2; i < isPrimeList.size(); i++) {
//			if (isPrimeList.get(i) == true) {
//				for (int p=2*i; p<=A; p+=i) {
//					isPrimeList.set(p, false);
//				}
//			}
//		}
//		
//		for (int i = 2; i < isPrimeList.size(); i++) {
//			if(isPrimeList.get(i)==true && isPrimeList.get(A-i)== true) {
//				output.add(i);
//				output.add(A-i);
//				return output;
//			}
//		}
//		
//		return null;
//	}
	
	public static ArrayList<Integer> primesum(int A) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 2; i < A; i++) {
            if (isPrime(i) && isPrime(A - i)) {
                arr.add(i);
                arr.add(A - i);
                return arr;
            }
        }
        return arr;
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
