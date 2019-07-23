package string;

/*Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

If the last word does not exist, return 0.

Note: A word is defined as a character sequence consists of non-space characters only.

Example:

Given s = "Hello World",

return 5 as length("World") = 5.*/

public class LengthOfLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Rajesh :" + lengthOfLastWord("race a car"));
	}
	public static long lengthOfLastWord(final String A) {
		long count =0;
		String str = A.trim();
		for(int i=str.length()-1; i>=0; i-- ) {
			if(str.charAt(i)==' ') break;
			else count++;
		}
		return count;
    }

}
