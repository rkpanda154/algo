package array;

import java.util.ArrayList;

/*Given an index k, return the kth row of the Pascal’s triangle.

Pascal’s triangle : To generate A[C] in row R, sum up A’[C] and A’[C-1] from previous row R - 1.

Example:

Input : k = 3

Return : [1,3,3,1]*/
		
public class KthRowofPascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi RAJESH" + getRow(2));
	}
	
	public static ArrayList<Integer> getRow(int A) {
		ArrayList<Integer> output = new ArrayList();
		ArrayList<Integer> prevRow = new ArrayList();

		output.add(1);
		if(A==0) return output;

		for (int r = 1; r < A+1; r++) {
			prevRow.clear();
			prevRow.addAll(output);
			output.clear();
			for(int c=0; c<=r; c++) {
				if(c==0) output.add(prevRow.get(0));
				else if(c== r) output.add(prevRow.get(c-1));
				else output.add(prevRow.get(c)+ prevRow.get(c-1));
			}
		}
		return output;

    }

}
