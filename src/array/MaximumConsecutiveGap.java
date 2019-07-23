package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
Given an unsorted array, find the maximum difference between the 
successive elements in its sorted form.

Try to solve it in linear time/space.

Example :

Input : [1, 10, 5]
Output : 5 
Return 0 if the array contains less than 2 elements.

You may assume that all the elements in the array are non-negative integers and fit in the 32-bit signed integer range.
You may also assume that the difference will not overflow.
*/

public class MaximumConsecutiveGap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a[] = new Integer[] { 1,10,5 };
		System.out.println("Hi RAJESH" + maximumGap(new ArrayList(Arrays.asList(a))));

	}
	
	public static int maximumGap(final List<Integer> A) {
		int gap=0;
		if(A.size() < 2) return gap;
		
		Collections.sort(A);
		
		for(int i=0; i< A.size()-1; i++) {
			gap= Math.max(gap, A.get(i+1)-A.get(i));
		}
		
		return gap;
    }

}
