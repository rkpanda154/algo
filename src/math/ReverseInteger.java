package math;

/*Reverse digits of an integer.

Example1:
x = 123,
return 321


Example2:
x = -123,
return -321

Return 0 if the result overflows and does not fit in a 32 bit signed integer
*/
public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Rajesh :" + reverse(582761));

	}

	public static int reverse(int A) {
		if(A > Integer.MAX_VALUE || A< Integer.MIN_VALUE) return 0;
		boolean isNegative = A<0;
		StringBuilder strBuilder = new StringBuilder(String.valueOf(Math.abs(A)));
		for(int i=0; i< strBuilder.length()/2; i++) {
			char temp = strBuilder.charAt(i);
			strBuilder.setCharAt(i, strBuilder.charAt(strBuilder.length()-i-1));
			strBuilder.setCharAt(strBuilder.length()-i-1, temp);
		}
		return isNegative ? -Integer.parseInt(strBuilder.toString()) 
				: Integer.parseInt(strBuilder.toString());
			
    }

}
