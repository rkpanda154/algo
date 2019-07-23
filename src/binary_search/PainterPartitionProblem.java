package binary_search;

import java.util.ArrayList;
import java.util.Arrays;

/*You have to paint N boards of length {A0, A1, A2, A3 … AN-1}. There are K painters available and you are also given how much time a painter takes to paint 1 unit of board. You have to get this job done as soon as possible under the constraints that any painter will only paint contiguous sections of board.

2 painters cannot share a board to paint. That is to say, a board
cannot be painted partially by one painter, and partially by another.
A painter will only paint contiguous boards. Which means a
configuration where painter 1 paints board 1 and 3 but not 2 is
invalid.
Return the ans % 10000003

Input :
K : Number of painters
T : Time taken by painter to paint 1 unit of board
L : A List which will represent length of each board

Output:
     return minimum time to paint all boards % 10000003
     
     *
     *
     *Example

Input : 
  K : 2
  T : 5
  L : [1, 10]
Output : 50*/
    		 
public class PainterPartitionProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer b[] = new Integer[] { 762, 798, 592, 899, 329 };
		System.out.println("Hi RAJESH" + paint(6,10,new ArrayList(Arrays.asList(b))));
	}
	
	 public static long paint(int A, int B, ArrayList<Integer> C) {
		long no_of_paints = C.size();
//		if (no_of_paints < A)
//			return -1;

		long num_paint_unit = 0;
		for (int i = 0; i < C.size(); i++)
			num_paint_unit += C.get(i);

		long start = 0;
		long end = num_paint_unit;
		long paint_result = Integer.MAX_VALUE;
		while (start <= end) {
			long mid = (start + end) / 2;
			if (isPossible(C, A, mid)) {

				paint_result = Math.min(paint_result, mid);
				end = mid - 1;

			} else {
				start = mid + 1;
			}
		}
		return ((paint_result * B)% 10000003 );
	}

	public static boolean isPossible(ArrayList<Integer> A, long B, long mid) {
		long count_painter = 1;
		long sum = 0;

		for (int i = 0; i < A.size(); i++) {
			if (A.get(i) > mid)
				return false;
			if (sum + A.get(i) > mid) {
				sum = A.get(i);
				count_painter++;
				if (count_painter > B)
					return false;
			} else {
				sum += A.get(i);
			}
		}
		return true;
	}

}
