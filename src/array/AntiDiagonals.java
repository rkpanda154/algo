package array;

import java.util.ArrayList;

/*Give a N*N square matrix, return an array of its anti-diagonals. 
 * Look at the example for more details.

Example:

		
Input: 	

1 2 3
4 5 6
7 8 9

Return the following :

[ 
  [1],
  [2, 4],
  [3, 5, 7],
  [6, 8],
  [9]
]


Input : 
1 2
3 4

Return the following  : 

[
  [1],
  [2, 3],
  [4]
]
	*/
public class AntiDiagonals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>> list = new ArrayList();

		ArrayList<Integer> row1 = new ArrayList();
		row1.add(1);
		row1.add(2);
		row1.add(3);

		ArrayList<Integer> row2 = new ArrayList();
		row2.add(4);
		row2.add(5);
		row2.add(6);

		ArrayList<Integer> row3 = new ArrayList();
		row3.add(7);
		row3.add(8);
		row3.add(9);

		list.add(row1);
		list.add(row2);
		list.add(row3);

	
		System.out.println("Hi RAJESH" + diagonal(list));
	}

	public static ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> A) {
		ArrayList<ArrayList<Integer>> output = new ArrayList();
		int top = 0;
		int right = A.size()-1;
		
		for(int i=0; i< (2*A.size() -1); i++) {
			output.add(new ArrayList());
		}
		
		int row=0;
		int row_start=0;
		
		while(right>=0) {
			row = row_start++;
			for(int i=0; i<=right; i++) {
				output.get(row++).add(A.get(top).get(i));
			}
			top++;
			for(int i=top; i<A.size(); i++) {
				output.get(row++).add(A.get(i).get(right));
			}
			right--;
		}
		return output;
    }
}
