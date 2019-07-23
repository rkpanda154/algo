package math;

/*Given a column title as appears in an Excel sheet, return its corresponding column number.

Example:

    A -> 1
    
    B -> 2
    
    C -> 3
    
    ...
    
    Z -> 26
    
    AA -> 27
    
    AB -> 28 
 */   
public class FindExcelColumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Rajesh :" + titleToNumber("AAA"));
	}
	
	public static int titleToNumber(String A) {
		int result=0;
		for(int i=0; i<A.length(); i++)
			result += ((A.charAt(A.length()-i-1)-'A')+1) * Math.pow(26, i);
		return result;
    }

}
