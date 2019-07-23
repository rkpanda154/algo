package string;

public class ImplementStrStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Rajesh :" + strStr("bbbbbbbbab", "bab"));
	}
	public static int strStr(final String A, final String B) {
		int l_t = A.length();
		int l_p = B.length();
		for(int i=0; i<= l_t-l_p; i++) {
			int j =0;
			while(j < l_p && A.charAt(i+j)==B.charAt(j)) {
				j++;
			}
			if(j == l_p) return i;
		}
		return -1;
    }

}
