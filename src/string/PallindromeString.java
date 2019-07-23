package string;

/*Given a string, determine if it is a palindrome, 
 * considering only alphanumeric characters and ignoring cases.

Example:

"A man, a plan, a canal: Panama" is a palindrome.

"race a car" is not a palindrome.

Return 0 / 1 ( 0 for false, 1 for true ) for this problem
*/
public class PallindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Rajesh :" + isPalindrome("A man, a plan, a canal: Panama"));
		System.out.println("Rajesh :" + isPalindrome("race a car"));

	}

	public static int isPalindrome(String A) {
		int start=0;
		int end = A.length()-1;
		
		while(start < end) {
			if(! isAlphaNumeric(A.charAt(start))) {
				start++;
				continue;
			}
			if(! isAlphaNumeric(A.charAt(end))) {
				end--;
				continue;
			}
			if(A.substring(start, start+1).equalsIgnoreCase(A.substring(end, end+1))) {
				start++;
				end--;
				continue;
			}else {
				return 0;
			}
		}
		
		return 1;
	}

	public static boolean isAlphaNumeric(char cha) {
		return ('A' <= cha && cha <= 'Z') || ('a' <= cha && cha <= 'z') || ('0' <= cha && cha <= '9');
	}
}
