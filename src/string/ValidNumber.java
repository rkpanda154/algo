package string;

/*Please think of all the corner cases and clarifications yourself.

Validate if a given string is numeric.

Examples:

"0" => true
" 0.1 " => true
"abc" => false
"1 a" => false
"2e10" => true
Return 0 / 1 ( 0 for false, 1 for true ) for this problem

Clarify the question using �See Expected Output�

Is 1u ( which may be a representation for unsigned integers valid?
For this problem, no.
Is 0.1e10 valid?
Yes
-01.1e-10?
Yes
Hexadecimal numbers like 0xFF?
Not for the purpose of this problem
3. (. not followed by a digit)?
No
Can exponent have decimal numbers? 3e0.1?
Not for this problem.
Is 1f ( floating point number with f as prefix ) valid?
Not for this problem.
How about 1000LL or 1000L ( C++ representation for long and long long numbers )?
Not for this problem.
How about integers preceded by 00 or 0? like 008?
Yes for this problem
*/
public class ValidNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hi RAJESH" + isNumber("35e5"));
		//System.out.println("Hi RAJESH" + isNumber("-01.1e-10"));
		System.out.println("Hi RAJESH" + isNumber("1.e1"));
	}
	public static int isNumber(final String A) {
		String B = A.trim();
		if(B.length()==0) return 0;
		
		if(B.contains(".") && (B.contains("e")||B.contains("E"))
				&& (B.indexOf(".") > B.indexOf("e") || B.indexOf(".") == B.indexOf("e")-1)){
			return 0;
		}
		boolean isDisitThere = false;
		for(int i=0; i<B.length(); i++) {
			if((B.charAt(i) >= '0' && B.charAt(i) <= '9')) {
				isDisitThere = true;
				continue;
			}else if((B.charAt(i)=='e' || B.charAt(i)=='E') 
					&& i >0 && i<B.length()-1){
				continue;
			}else if((B.charAt(i)=='.') 
					&& i<B.length()-1) {
				continue;
			}else if(B.charAt(i)=='-' 
					&& (i==0 || B.contains("e") && B.indexOf("e")+1 ==i)) {
				continue;
			}
			else if(B.charAt(i)=='+' && i==0) {
				continue;
			} 
			else {
				return 0;
			}
					
		}
		return isDisitThere ? 1 : 0;
    }
}
