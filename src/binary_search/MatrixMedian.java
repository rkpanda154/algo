package binary_search;

import java.util.ArrayList;
import java.util.Collections;

/*Given a N cross M matrix in which each row is sorted, 
 * find the overall median of the matrix. Assume N*M is odd.

For example,

Matrix=
[1, 3, 5]
[2, 6, 9]
[3, 6, 9]

A = [1, 2, 3, 3, 5, 6, 6, 9, 9]

Median is 5. So, we return 5.
Note: No extra memory is allowed.*/

public class MatrixMedian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>> list = new ArrayList();

		ArrayList<Integer> row1 = new ArrayList();
		row1.add(2);
//		row1.add(3);
//		row1.add(5);

		ArrayList<Integer> row2 = new ArrayList();
		row2.add(1);
//		row2.add(6);
//		row2.add(9);

		ArrayList<Integer> row3 = new ArrayList();
		row3.add(4);
//		row3.add(6);
//		row3.add(9);

		ArrayList<Integer> row4 = new ArrayList();
		row4.add(1);
		ArrayList<Integer> row5 = new ArrayList();
		row5.add(2);
		ArrayList<Integer> row6 = new ArrayList();
		row6.add(2);
		ArrayList<Integer> row7 = new ArrayList();
		row7.add(5);

		list.add(row1);
		list.add(row2);
		list.add(row3);
		list.add(row4);
		list.add(row5);
		list.add(row6);
		list.add(row7);
		
		System.out.println("Hi RAJESH" + findMedian(list));

	}

	public static int findMedian(ArrayList<ArrayList<Integer>> A) {
		int matrix_min = Integer.MAX_VALUE;
		int matrix_max = Integer.MIN_VALUE;
		int row = A.size();
		int col = A.get(0).size();
		int no_of_element = row * col;

		for (int i = 0; i < row; i++) {
			if (A.get(i).get(0) < matrix_min)
				matrix_min = A.get(i).get(0);
			if (A.get(i).get(col - 1) > matrix_max)
				matrix_max = A.get(i).get(col - 1);
		}

		int desired = (row * col + 1) / 2; 
		while (matrix_min < matrix_max) {
			int mid = matrix_min + (matrix_max - matrix_min) / 2; 
            int place = 0; 
            int get = 0; 
              
            // Find count of elements smaller than mid 
            for(int i = 0; i < row; ++i) 
            { 
                  
                get = Collections.binarySearch(A.get(i),mid); 
                  
                if(get < 0) 
                    get = Math.abs(get) - 1; 
                  
                // If element is found in the array it returns  
                // the index(any index in case of duplicate). So we go to last 
                // index of element which will give  the number of  
                // elements smaller than the number including  
                // the searched element. 
                else
                { 
                    while(get <col && A.get(i).get(get)== mid) 
                        get += 1; 
                } 
                  
                place = place + get; 
            } 
              
            if (place < desired) 
            	matrix_min = mid + 1; 
            else
            	matrix_max = mid; 
		}
		return matrix_min;
	}

}
