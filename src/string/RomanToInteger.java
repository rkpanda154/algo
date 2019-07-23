package string;

/*Given a roman numeral, convert it to an integer.

Input is guaranteed to be within the range from 1 to 3999.

Read more details about roman numerals at Roman Numeric System

Example :

Input : "XIV"
Return : 14
Input : "XX"
Output : 20
*/
public class RomanToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hi RAJESH" + romanToInt("XX"));
		System.out.println("Hi RAJESH" + romanToInt("XIV"));
	}
	
	public static int romanToInt(String A) {
		int res =0;
		
		for(int i=0; i<A.length(); i++) {
			int val1 = value (A.charAt(i));
			
			if(i+1 < A.length()) {
				int val2 = value (A.charAt(i+1));
				if(val1 >= val2) {
					res += val1;
				}else {
					res = res + (val2-val1);
					i++;
				}
			}else {
				res += val1;
			}
		}
		return res;
    }
	public static int  value(char r) 
    { 
        if (r == 'I') 
            return 1; 
        if (r == 'V') 
            return 5; 
        if (r == 'X') 
            return 10; 
        if (r == 'L') 
            return 50; 
        if (r == 'C') 
            return 100; 
        if (r == 'D') 
            return 500; 
        if (r == 'M') 
            return 1000; 
        return -1; 
    }

}
