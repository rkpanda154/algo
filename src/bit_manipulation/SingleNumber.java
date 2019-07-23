package bit_manipulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SingleNumber {

	public static void main(String[] args) {
		Integer a[] = new Integer[] { 1,2,2,3,1 };
		System.out.println("Hi RAJESH" + singleNumber(new ArrayList(Arrays.asList(a))));

	}
	public static int singleNumber(final List<Integer> A) {
		int result=0;
		for(int i=0; i<A.size(); i++) {
			result = result ^ A.get(i);
		}
		return result;
    }
}
