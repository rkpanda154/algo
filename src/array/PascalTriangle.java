package array;

import java.util.ArrayList;
import java.util.Arrays;

/*Given numRows, generate the first numRows of Pascal’s triangle.

Pascal’s triangle : To generate A[C] in row R, sum up A’[C] and A’[C-1] from previous row R - 1.

Example:

Given numRows = 5,

Return

[
     [1],
     [1,1],
     [1,2,1],
     [1,3,3,1],
     [1,4,6,4,1]
]
*/
public class PascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi RAJESH" + solve(0));

	}

	public static ArrayList<ArrayList<Integer>> solve(int A) {
		ArrayList<ArrayList<Integer>> output = new ArrayList();
		if(A==0) return output;
		for (int c = 0; c < A; c++) {
			output.add(new ArrayList());
		}
		output.get(0).add(1);
		for (int r = 1; r < A; r++) {
			for(int c=0; c<=r; c++) {
				if(c==0) output.get(r).add(output.get(r-1).get(0));
				else if(c== r) output.get(r).add(output.get(r-1).get(c-1));
				else output.get(r).add(output.get(r-1).get(c)+ output.get(r-1).get(c-1));
			}
		}
		return output;
	}
}
