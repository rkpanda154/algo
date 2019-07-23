package array;

/*Find out the maximum sub-array of non negative numbers from an array.
The sub-array should be continuous. That is, a sub-array created by 
choosing the second and fourth element and skipping the third element is 
invalid.

Maximum sub-array is defined in terms of the sum of the elements in the
 sub-array. Sub-array A is greater than sub-array B if sum(A) > sum(B).

Example:

A : [1, 2, 5, -7, 2, 3]
The two sub-arrays are [1, 2, 5] [2, 3].
The answer is [1, 2, 5] as its sum is larger than [2, 3]
NOTE: If there is a tie, then compare with segment's length and return 
segment which has maximum length
NOTE 2: If there is still a tie, then return the segment with minimum
 starting index

*/

import java.util.ArrayList;
import java.util.Arrays;

public class MaxNonNegativeSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Integer b[] = new Integer []{2,3,-1,1,3,1};
		Integer b[] = new Integer []{1967513926, 1540383426, -1303455736, -521595368};
		System.out.println("Hi RAJESH"+ maxset(new ArrayList(Arrays.asList(b))));
	}
	public static ArrayList<Integer> maxset(ArrayList<Integer> A) {
		ArrayList<Integer> output = new ArrayList();
		
		int l_output=-1;
		int r_output=-1;
		int left=-1;
		int right=-1;
		long max_sum= -1;
		long sum_so_far = -1;
		
		for(int i=0; i< A.size(); i++) {
			if(A.get(i)<0) {
				left =-1;
				right =-1;
				sum_so_far =-1;
			}else {
				if(right == -1) {
					left = right = i;
					sum_so_far = A.get(i);
				}else {
					right =i;
					sum_so_far += A.get(i);
				}
				
				if((sum_so_far > max_sum) || 
						((sum_so_far == max_sum && (l_output == left || ((right-left) > (r_output - l_output)))))) {
					l_output = left;
					r_output = right;
					max_sum = sum_so_far;
				}
			}
		}
		if(r_output ==-1) return output;
		
		output.addAll(A.subList(l_output, r_output+1));
		
		return output;
    }
}
