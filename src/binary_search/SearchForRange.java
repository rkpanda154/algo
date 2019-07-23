package binary_search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Given a sorted array of integers, find the starting and ending position
 *  of a given target value.

Your algorithm’s runtime complexity must be in the order of O(log n).

If the target is not found in the array, return [-1, -1].

Example:

Given [5, 7, 7, 8, 8, 10]

and target value 8,

return [3, 4].
		*/
public class SearchForRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a[] = new Integer[] { 5, 7, 7, 8, 8, 10 };
		System.out.println("Hi RAJESH" + searchRange(new ArrayList(Arrays.asList(a)),8));
		
	}
	
	public static ArrayList<Integer> searchRange(final List<Integer> a, int b) {
		ArrayList<Integer> output = new ArrayList();
		
		output.add(getFirstOccurence(a,b));
		output.add(getLastOccurence(a,b));
		
		return output;
		
    }
	
	public static int getFirstOccurence(final List<Integer> a, int b) {
		int start =0;
		int end = a.size()-1;
		
		while(start <= end) {
			int mid = (start + end) / 2;
			if(a.get(mid)==b && (mid==start || a.get(mid-1) < b)) return mid;
			
			if(a.get(mid) >= b) end = mid-1;
			else start = mid+1;
		}
		return -1;
	}
	
	public static int getLastOccurence(final List<Integer> a, int b) {
		int start =0;
		int end = a.size()-1;
		
		while(start <= end) {
			int mid = (start + end) / 2;
			if(a.get(mid)==b && (mid==end || a.get(mid+1) > b)) return mid;
			
			if(a.get(mid) > b) end = mid-1;
			else start = mid+1;
		}
		return -1;
	}

}
