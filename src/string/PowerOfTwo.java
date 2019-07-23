package string;

/*Find if Given number is power of 2 or not. 
More specifically, find if given number can be expressed as 2^k where k >= 1.

Input:

number length can be more than 64, which mean number can be greater than 2 ^ 64 (out of long long range)
Output:

return 1 if the number is a power of 2 else return 0

Example:

Input : 128
Output : 1
*/
public class PowerOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
public int power(String A) {
        
        int n = A.length();
        if(n == 1 && A.charAt(0) == '1') return 0;
        
        while((!A.equals("1")) && A.charAt(A.length()-1)%2==0) {
            A = divide(A);
        }
        
        if(A.equals("1")) {
            return 1;
        }
        
        return 0;
        
    }
    
    private String divide(String s) {
        String carry = "";
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++) {
            int curr = Integer.parseInt(carry+Character.toString(s.charAt(i)));
            int result = curr / 2;
            carry = Integer.toString(curr % 2);
            if(i!=0 || result != 0)
            sb.append(Integer.toString(result));
            //System.out.println(sb.toString());   
        }
        return sb.toString();
    }

}
