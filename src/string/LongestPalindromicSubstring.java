package string;

public class LongestPalindromicSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi RAJESH" + longestPalindrome(""));
	}
	public static String longestPalindrome(String A) {
		if(A.length()==0) return "";
		String subString = A.substring(0,1);
		
		for(int i=1; i<A.length();i++) {
			int low = i-1;
			int high = i;
			
			while(low >=0 && high < A.length()
					&& A.charAt(low)==A.charAt(high)) {
				if(high - low +1 > subString.length()) {
					subString = A.substring(low, high +1);
				}
				low--;
				high++;
			}
			
			
			low = i-1;
			high = i+1;
			
			while(low >=0 && high < A.length()
					&& A.charAt(low)==A.charAt(high)) {
				if(high - low +1 > subString.length()) {
					subString = A.substring(low, high +1);
				}
				low--;
				high++;
			}
		}
		
		return subString;
    }
}
