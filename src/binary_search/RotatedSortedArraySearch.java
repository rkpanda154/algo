package binary_search;
/*
Suppose a sorted array is rotated at some pivot unknown to you beforehand.

(i.e., 0 1 2 4 5 6 7  might become 4 5 6 7 0 1 2 ).

You are given a target value to search. If found in the array, return its index, otherwise return -1.

You may assume no duplicate exists in the array.

Input : [4 5 6 7 0 1 2] and target = 4
Output : 0
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotatedSortedArraySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a[] = new Integer[] { 4, 5, 6, 7, 0, 1, 2 };
		System.out.println("Hi RAJESH" + search(new ArrayList(Arrays.asList(a)), 2));

	}

	public static int search(final List<Integer> a, int b) {
		int start = 0;
		int end = a.size() - 1;

		while (start < end) {
			int mid = (start + end) / 2;
			if(a.get(mid)== b) return mid;
			if(a.get(start)==b) return start;
			if(a.get(end)==b) return end;
			if (a.get(start) < a.get(mid)) {
				if (a.get(start) < b && b < a.get(mid)) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			} else {
				if (a.get(end) > b && b > a.get(mid)) {
					start = mid + 1;
				} else {
					end = mid - 1;
				}
			}
		}
		
		return -1;
	}

}
