package bit_manipulation;

import java.util.ArrayList;
import java.util.Arrays;

public class DifferentBitSumPairwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a[] = new Integer[] { 1, 3, 5  };
		System.out.println("Hi RAJESH" + cntBits(new ArrayList(Arrays.asList(a))));

	}
	public static int cntBits(ArrayList<Integer> A) {
		int result=0;
//		for(int i=0; i<A.size(); i++) {
//			for(int j=i+1; j<A.size(); j++) {
//				int xored = A.get(i) ^ A.get(j);
//				int cunt =0;
//				while(xored !=0) {
//					if((xored & 1) ==1) {
//						cunt++;
//					}
//					xored = xored >>1;
//				}
//				result = result + 2*cunt;
//			}
//			
//		}
		
		
		for (int i = 0; i < 32; i++) { 
            int count = 0; 
              
            for (int j = 0; j < A.size(); j++) 
                if ((A.get(j) & (1 << i)) == 0) 
                    count++; 
            result += (count * (A.size() - count) * 2); 
        }
		return result;
    }
}
