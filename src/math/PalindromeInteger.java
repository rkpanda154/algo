package math;


/*Determine whether an integer is a palindrome. Do this without extra space.

A palindrome integer is an integer x for which reverse(x) = x where reverse(x) is x with its digit reversed.
Negative numbers are not palindromic.

Example :

Input : 12121
Output : True

Input : 123
Output : False*/

public class PalindromeInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Rajesh :" + isPalindrome(121));
	}
	
	public static int isPalindrome(int A) {
		if(A <0 ) return 0;
		String originalString = String.valueOf(Math.abs(A));
		StringBuilder strBuilder = new StringBuilder(String.valueOf(Math.abs(A)));
		for(int i=0; i< strBuilder.length()/2; i++) {
			char temp = strBuilder.charAt(i);
			strBuilder.setCharAt(i, strBuilder.charAt(strBuilder.length()-i-1));
			strBuilder.setCharAt(strBuilder.length()-i-1, temp);
		}
		if(strBuilder.toString().equals(originalString)) return 1;
		else return 0;
    }

}
