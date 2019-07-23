package string;

public class MinimumCharactersRequiredToMakeStringPalindromic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi RAJESH" + solve("BCAC"));

	}
	
	public static int solve(String A) {
		int cnt=0;
		while(!isPallindrome(A)) {
			cnt++;
			A= A.substring(0,A.length()-1);
		}
		return cnt;
    }
	
	public static boolean isPallindrome(String A) {
		int low=0;
		int high = A.length()-1;
		while(low < high) {
			if(A.charAt(low)!=A.charAt(high)) return false;
			low++;
			high--;
		}
		return true;
	}
	

}
