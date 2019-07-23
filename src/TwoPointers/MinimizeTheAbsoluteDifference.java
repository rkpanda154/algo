package TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;

public class MinimizeTheAbsoluteDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a[] = new Integer[] { 1, 4, 5, 8, 10 };
		Integer b[] = new Integer[] { 6, 9, 15 };
		Integer c[] = new Integer[] { 2, 3, 6, 6 };

		System.out.println("Hi RAJESH" + solve(new ArrayList(Arrays.asList(a)), new ArrayList(Arrays.asList(b)),
				new ArrayList(Arrays.asList(c))));
	}

	public static int solve(ArrayList<Integer> A, ArrayList<Integer> B, ArrayList<Integer> C) {
		int a_ptr=0;
		int b_ptr=0;
		int c_ptr=0;
		
		int curr_diff=Integer.MAX_VALUE;
		
		while(a_ptr != A.size() && b_ptr != B.size() && c_ptr !=C.size()) {
			curr_diff= Math.min(curr_diff, Math.max(A.get(a_ptr), Math.max(B.get(b_ptr), C.get(c_ptr)))
					- Math.min(A.get(a_ptr), Math.min(B.get(b_ptr), C.get(c_ptr))));
			
			int min = Math.min(A.get(a_ptr), Math.min(B.get(b_ptr), C.get(c_ptr)));
			if(min == A.get(a_ptr)) {
				a_ptr++;
			}else if(min == B.get(b_ptr)) {
				b_ptr++;
			}else {
				c_ptr++;
			}
			
		}
		return curr_diff;
	}
}
