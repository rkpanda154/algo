package binary_search;

import java.util.ArrayList;
import java.util.Arrays;

/*Given a sorted array and a target value, 
 * return the index if the target is found. 
 * If not, return the index where it would be if it were inserted in order.

You may assume no duplicates in the array.

Here are few examples.

[1,3,5,6], 5 → 2
[1,3,5,6], 2 → 1
[1,3,5,6], 7 → 4
[1,3,5,6], 0 → 0*/

public class SortedInsertPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a[] = new Integer[] { 1,3,5,6 };
		System.out.println("Hi RAJESH" + searchInsert(new ArrayList(Arrays.asList(a)),5));
		System.out.println("Hi RAJESH" + searchInsert(new ArrayList(Arrays.asList(a)),2));
		System.out.println("Hi RAJESH" + searchInsert(new ArrayList(Arrays.asList(a)),7));
		System.out.println("Hi RAJESH" + searchInsert(new ArrayList(Arrays.asList(a)),0));

	}
	
	public static int searchInsert(ArrayList<Integer> a, int b) {
//		int i;
//		for(i= a.size()-1; i>=0; i--) {
//			if(b == a.get(i)) return i;
//			if( b > a.get(i)) return i+1;
//		}
//		return i+1;
		
		
		int low =0,high = a.size()-1;
        if(a.get(low)>b) return low;
        if(a.get(high)<b) return high+1;
        while(low<=high){
            int mid = low +(high-low)/2;
            if(a.get(mid)== b) return mid;
            if(a.get(mid)<b) low = mid+1;
            else high = mid-1;
        }
        return low;
    }

}
