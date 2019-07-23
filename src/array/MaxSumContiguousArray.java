package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Find the contiguous subarray within an array (containing at least one number) 
 * which has the largest sum.

For example:

Given the array [-2,1,-3,4,-1,2,1,-5,4],

the contiguous subarray [4,-1,2,1] has the largest sum = 6.

For this problem, return the maximum sum.*/

public class MaxSumContiguousArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Integer a[] = new Integer[] { -2,1,-3,4,-1,2,1,-5,4 };
		Integer a[] = new Integer[] { -2,-1,-3 };

		System.out.println("Hi RAJESH" + maxSubArray(new ArrayList(Arrays.asList(a))));

	}
	
	public static int maxSubArray(final List<Integer> A) {
		boolean isAllNegative = true;
		int largestAmongNegative = Integer.MIN_VALUE;
		
		for(Integer i : A) {
			if(i>=0) {
				isAllNegative = false;
				break;
			}else {
				if(i > largestAmongNegative) {
					largestAmongNegative = i;
				}
			}
		}
		
		if(isAllNegative) return largestAmongNegative;
		
		int max_so_far=0;
		int sum_so_far=0;
		
		for(Integer i : A) {
			sum_so_far = sum_so_far+i;
			if(sum_so_far < 0) sum_so_far = 0;
			if(sum_so_far > max_so_far) max_so_far=sum_so_far;
		}
		return max_so_far;
    }

}
