package array;

import java.util.ArrayList;
import java.util.Arrays;

/*Given an m x n matrix of 0s and 1s, if an element is 0, set 
 * its entire row and column to 0.

Do it in place.

Example

Given array A as

1 0 1
1 1 1 
1 1 1
On returning, the array A should be :

0 0 0
1 0 1
1 0 1
*/

public class SetMatrixZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>> list = new ArrayList();

		ArrayList<Integer> row1 = new ArrayList();
		row1.add(1);
		row1.add(1);
		row1.add(1);

		ArrayList<Integer> row2 = new ArrayList();
		row2.add(1);
		row2.add(1);
		row2.add(1);

		ArrayList<Integer> row3 = new ArrayList();
		row3.add(1);
		row3.add(0);
		row3.add(1);

		list.add(row1);
		list.add(row2);
		list.add(row3);

		setZeroes(list);
		System.out.println("Hi RAJESH" + list);

	}

	public static void setZeroes(ArrayList<ArrayList<Integer>> a) {
		boolean isAllFirstRowZero = false;
		boolean isAllFirstColumnZero = false;

		int rowSize = a.size();
		int colSize = a.get(0).size();

		for (int i = 0; i < rowSize; i++) {
			if (a.get(i).get(0) == 0) {
				isAllFirstColumnZero = true;
				break;
			}
		}
		
		for (int i = 0; i < colSize; i++) {
			if (a.get(0).get(i) == 0) {
				isAllFirstRowZero = true;
				break;
			}
		}

		for (int i = 0; i < rowSize; i++) {
			for (int j = 0; j < colSize; j++) {

				if (a.get(i).get(j) == 0 && i != 0 && j != 0) {
					a.get(0).set(j, 0);
					a.get(i).set(0, 0);
				}
			}
		}

		for (int k = rowSize - 1; k > 0; k--) {
			if (a.get(k).get(0) == 0) {
				for (int l = 1; l < colSize; l++) {
					a.get(k).set(l, 0);
				}
			}
		}

		for (int k = colSize - 1; k > 0; k--) {
			if (a.get(0).get(k) == 0) {
				for (int l = 1; l < rowSize; l++) {
					a.get(l).set(k, 0);
				}
			}
		}

		if (isAllFirstRowZero) {
			for (int l = 0; l < colSize; l++) {
				a.get(0).set(l, 0);
			}
		}

		if (isAllFirstColumnZero) {
			for (int l = 0; l < rowSize; l++) {
				a.get(l).set(0, 0);
			}
		}
	}

}
