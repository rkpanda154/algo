package bit_manipulation;

public class DivideIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi RAJESH" + divide(-2147483648L, -1));
	}
	public static long divide(long A, long B) {
		long result;
		 long sign = ((A < 0) ^ (B < 0)) ? -1 : 1; 
		  
		  // Update both divisor and 
		  // dividend positive 
		 long dividend = Math.abs(A); 
		 long divisor = Math.abs(B); 
		 
		 if(divisor == 1L) {
			  result =  dividend * sign;
			 return result >= Integer.MAX_VALUE ?  Integer.MAX_VALUE : result;
		 }
		  
		  // Initialize the quotient 
		  int quotient = 0; 
		  while (dividend >= divisor) { 
		    dividend -= divisor; 
		    ++quotient; 
		  } 
		  
		  result =  quotient * sign;
		  return result >= Integer.MAX_VALUE ?  Integer.MAX_VALUE : result;
    }
}
