package string;

import java.util.ArrayList;
import java.util.List;

/*Given two numbers represented as strings, return multiplication of 
 * the numbers as a string.

		 Note: The numbers can be arbitrarily large and are non-negative.
		Note2: Your answer should not have leading zeroes. 
		For example, 00 is not a valid answer. 
		For example, 
		given strings "12", "10", your answer should be “120”.

		NOTE : DO NOT USE BIG INTEGER LIBRARIES ( WHICH ARE AVAILABLE IN JAVA 
		/ PYTHON ). 
		We will retroactively disqualify such submissions and 
		the submissions will incur penalties.
	*/	
public class MultiplyString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi RAJESH" + multiply("123","0"));
	}
	
	public  static String multiply(String A, String B) {
		List<Integer> intList =  new ArrayList();
		for(int i=0; i< A.length() + B.length() ; i++) {
			intList.add(0);
		}
		for(int i=0; i<A.length(); i++) {
			for(int j=0; j< B.length(); j++) {
				intList.set(i+j, intList.get(i+j)
						+ ((A.charAt(A.length()-i-1 ) - '0') * (B.charAt(B.length()-j-1 )- '0')));
			}
		}
		StringBuilder builder = new StringBuilder();
		int carry =0;
		for(int i=0; i< intList.size() ; i++) {
			int mul = intList.get(i) +  carry;
			int mod = mul %10;
			carry = mul / 10;
			builder.append(mod);
		}
		
		builder = builder.reverse();
		
		int i=0;
		while(builder.length() !=0 && builder.charAt(0) == '0') {
			builder.deleteCharAt(0);
		}
		
		return builder.length() == 0 ? "0" : builder.toString();
    }

}
