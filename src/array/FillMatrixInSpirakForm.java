package array;


/*Given an integer n, generate a square matrix filled with 
 * elements from 1 to n2 in spiral order.

Example:

Given n = 3,

You should return the following matrix:

[
  [ 1, 2, 3 ],
  [ 8, 9, 4 ],
  [ 7, 6, 5 ]
]
*/
		
		
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FillMatrixInSpirakForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println("Hi RAJESH"+ generateMatrix(0));
		
		ArrayList<ArrayList<Integer>> matreix = generateMatrix(3);
		for(List<Integer> innerList : matreix) {
		    for(Integer number : innerList) {
		        System.out.print(number);
		    }
		    System.out.println("");
		}
	}

	public static ArrayList<ArrayList<Integer>> generateMatrix(int A) {
		
		ArrayList<ArrayList<Integer>> matrix= new ArrayList(A);
		for(int k=0; k<A; k++) {
			ArrayList<Integer> innerList =new ArrayList<Integer>(Collections.nCopies(A, 0));
			matrix.add(k, innerList);
		}
		
		
		int size = A * A;
		int l =0;
		int r =A-1;
		int t =0;
		int b =A-1;
				
		for(int num=1; num<= size;) {
			for(int p=l; p <= r; p++) {
				matrix.get(t).set(p,num++);
			}
			t++;
			
			for(int q=t; q <= b; q++) {
				matrix.get(q).set(r,num++);
			}
			r--;
			
			for(int x=r; x>=l; x--) {
				matrix.get(b).set(x, num++);
			}
			b--;
			
			for(int y=b; y>=t; y--) {
				matrix.get(y).set(l, num++);
			}
			l++;
			
		}

		
		return matrix;
    }
}
