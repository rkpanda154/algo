package string;
/*
Another question which belongs to the category of questions which are intentionally stated vaguely. 
Expectation is that you will ask for correct clarification or you will state your assumptions before you start coding.

Given an integer, convert it to a roman numeral, and return a string corresponding to its roman numeral version

Input is guaranteed to be within the range from 1 to 3999.

Example :

Input : 5
Return : "V"

Input : 14
Return : "XIV"
*/	
public class IntegerToRoman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi RAJESH" + intToRoman(563));

	}
	
	public static String intToRoman(int A) {
        String o[]={"","I","II","III","IV","V","VI","VII","VIII","IX"}; 
       String t[]={"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
       String c[]={"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"}; 
       String m[]={"","M","MM","MMM"}; 
       return m[A/1000]+c[(A%1000)/100]+t[(A%100)/10]+o[A%10];
   }

}
