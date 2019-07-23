package string;

import java.math.BigInteger;

public class CompareVersionNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi RAJESH" + compareVersion("13.0", "13.0.8"));
		System.out.println("Hi RAJESH" + compareVersion("01", "1"));

	}
	public static int compareVersion(String A, String B) {
		
		String[] arrA = A.split("\\.");
		String[] arrB = B.split("\\.");
		
		int i=0;
		int j=0;
		

		
		while(i < arrA.length && j < arrB.length) {
			BigInteger b1= new BigInteger(arrA[i]);
			BigInteger b2= new BigInteger(arrB[j]);
			int b = b1.compareTo(b2);
			
			if(b ==1) {
				return 1;
			}else if(b == -1){
				return -1;
			}
			i++;
			j++;
		}
		boolean isRestBZeros = true;
		while(j < arrB.length) {
			if(new BigInteger(arrB[j]).compareTo (BigInteger.ZERO) !=0) {
				isRestBZeros = false;
				break;
			}
			j++;
		}
		
		boolean isRestAZeros = true;
		while(i < arrA.length) {
			if(new BigInteger(arrA[i]).compareTo (BigInteger.ZERO) !=0) {
				isRestAZeros = false;
				break;
			}
			i++;
		}
		
		
		if(i == arrA.length)
			if(!isRestBZeros)
				return -1;
			else return 0;
		
		if(j == arrB.length)
			if(!isRestAZeros)
				return -1;
			else return 0;

		return 0;
	
    }
}
