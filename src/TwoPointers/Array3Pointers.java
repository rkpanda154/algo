package TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array3Pointers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a[] = new Integer[] { 1, 4, 10};
		Integer b[] = new Integer[] { 2, 15, 20 };
		Integer c[] = new Integer[] { 10, 12 };

		System.out.println("Hi RAJESH" + minimize(new ArrayList(Arrays.asList(a)), new ArrayList(Arrays.asList(b)),
				new ArrayList(Arrays.asList(c))));
	}

	public static int minimize(final List<Integer> A, final List<Integer> B, final List<Integer> C) {
		int a_ptr = 0;
		int b_ptr = 0;
		int c_ptr = 0;

		int min = Integer.MAX_VALUE;

		while (a_ptr != A.size() && b_ptr != B.size() && c_ptr != C.size()) {
			int max1 = Math.max(Math.abs(A.get(a_ptr) -B.get(b_ptr)), Math.abs(B.get(b_ptr) - C.get(c_ptr)));
			max1 = Math.max(max1, Math.abs(C.get(c_ptr) - A.get(a_ptr)));

			min = Math.min(min, max1);
			
			if(A.get(a_ptr) <= B.get(b_ptr)) {
				if(A.get(a_ptr) <= C.get(c_ptr)) {
					a_ptr++;
				}else {
					c_ptr++;
				}
			}else if(B.get(b_ptr) <= C.get(c_ptr)){
				b_ptr++;
			}else {
				c_ptr++;
			}
		}
		return min;
	}
}
