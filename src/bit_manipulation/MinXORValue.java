package bit_manipulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MinXORValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a[] = new Integer[] { 0, 4, 7, 9  };
		System.out.println("Hi RAJESH" + findMinXor(new ArrayList(Arrays.asList(a))));

	}
	public static int findMinXor(ArrayList<Integer> A) {
		Collections.sort(A);
		int result=Integer.MAX_VALUE;
		for(int i=1; i<A.size(); i++) {
			result = Math.min(result, A.get(i) ^ A.get(i-1));
		}
		return result;
    }
}
