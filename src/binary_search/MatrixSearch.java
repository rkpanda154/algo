package binary_search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Write an efficient algorithm that searches for a value in an m x n matrix.

This matrix has the following properties:

Integers in each row are sorted from left to right.
The first integer of each row is greater than or equal to the last
integer of the previous row.
Example:

Consider the following matrix:

[
  [1,   3,  5,  7],
  [10, 11, 16, 20],
  [23, 30, 34, 50]
]
Given target = 3, return 1 ( 1 corresponds to true )

Return 0 / 1 ( 0 if the element is not present, 1 if the element is present ) 
for this problem*/


public class MatrixSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>> arr = new ArrayList();
		arr.add(new ArrayList(Arrays.asList(new Integer[] {1, 1, 2, 2, 5, 6, 6, 6, 7})));
		arr.add(new ArrayList(Arrays.asList(new Integer[] {9, 10, 10, 12, 12, 13, 14, 21, 21})));
		arr.add(new ArrayList(Arrays.asList(new Integer[] {23, 26, 26, 29, 29, 31, 32, 35, 37})));
		arr.add(new ArrayList(Arrays.asList(new Integer[] {38, 39, 39, 39, 41, 41, 42, 42, 43})));
		arr.add(new ArrayList(Arrays.asList(new Integer[] {45, 45, 46, 46, 46, 47, 48, 48, 51})));
		arr.add(new ArrayList(Arrays.asList(new Integer[] {51, 51, 54, 54, 54, 54, 56, 58, 59 })));
		arr.add(new ArrayList(Arrays.asList(new Integer[] { 60, 61, 61, 62, 63, 64, 65, 66, 67 })));
		arr.add(new ArrayList(Arrays.asList(new Integer[] { 67, 67, 70, 70, 71, 73, 73, 73, 74 })));
		arr.add(new ArrayList(Arrays.asList(new Integer[] { 74, 79, 79, 80, 82, 84, 84, 84, 87 })));
		arr.add(new ArrayList(Arrays.asList(new Integer[] { 89, 93, 94, 94, 97, 98, 98, 98, 98 })));


		System.out.println("Hi RAJESH" + searchMatrix(arr,64));
	}
	
	public static int searchMatrix(ArrayList<ArrayList<Integer>> a, int b) {
		if(a.size()==0) return 0;
		int row = a.size()-1;
		int col = a.get(0).size()-1;
		if(b > a.get(row).get(col)) return 0;
		int row_index = searchRow(a,b, row, col);
		if(row_index ==-1) return 0;
		int col_index = searchColumn(a.get(row_index), b);
		return col_index== -1 ? 0 : col_index;
    }
	
	public static int searchRow(final ArrayList<ArrayList<Integer>> a, int b, int row, int col) {
		int start =0;
		int end = a.size()-1;
		
		while(start <= end) {
			int mid = (start + end) / 2;
			if((a.get(mid).get(col)==b)) return mid;
			if((mid ==start && a.get(mid).get(col)> b) ) return start;
			if((mid ==start && a.get(mid).get(col)< b) ) return end;
			if(a.get(mid-1).get(col) < b && a.get(mid).get(col) >b) return mid;
			
			if(a.get(mid).get(col) >= b) end = mid-1;
			else start = mid+1;
		}
		return -1;
	}
	
	public static int searchColumn(final ArrayList<Integer> a, int b) {
		int start =0;
		int end = a.size()-1;
		
		while(start <= end) {
			int mid = (start + end) / 2;
			if(a.get(mid)==b ) return 1;
			
			if(a.get(mid) >= b) end = mid-1;
			else start = mid+1;
		}
		return -1;
	}

}
