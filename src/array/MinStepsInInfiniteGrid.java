package array;

import java.util.ArrayList;
import java.util.Arrays;


/*Given an infinite grid, initial cell position (x, y) and a sequence of 
 * other cell position which needs to be covered in the given order.
 *  The task is to find the minimum number of steps needed to travel to all 
 *  those cells.
Note: Movement can be done in any of the eight possible directions from a given 
cell
 i.e from cell (x, y) you can move to any of the following eight positions:
 (x-1, y+1), (x-1, y), (x-1, y-1), (x, y-1), (x+1, y-1), (x+1, y), (x+1, y+1),
  (x, y+1)
  is possible.

Examples:

Input: points[] = [(0, 0), (1, 1), (1, 2)]
Output: 2
Move from (0, 0) to (1, 1) in 1 step(diagonal) and
then from (1, 1) to (1, 2) in 1 step (rightwards)

Input: points[] = [{4, 6}, {1, 2}, {4, 5}, {10, 12}]
Output: 14
Move from (4, 6) -> (3, 5) -> (2, 4) -> (1, 3) ->
(1, 2) -> (2, 3) -> (3, 4) ->
(4, 5) -> (5, 6) -> (6, 7) ->
(7, 8) -> (8, 9) -> (9, 10) -> (10, 11) -> (10, 12)*/

public class MinStepsInInfiniteGrid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a[] = new Integer[] { 4,1,4,10 };
		Integer b[] = new Integer[] { 6,2,5,12 };
		System.out.println("Hi RAJESH" + coverPoints(new ArrayList(Arrays.asList(a)), new ArrayList(Arrays.asList(b))));

	}

	public static int coverPoints(ArrayList<Integer> A, ArrayList<Integer> B) {

		int size = A.size();
		int steps_required = 0;

		for (int i = 0; i < size - 1; i++) {
			int source_X = A.get(i);
			int source_Y = B.get(i);

			int dest_X = A.get(i + 1);
			int dest_Y = B.get(i + 1);
			
			steps_required = steps_required + Math.max(Math.abs(dest_X-source_X), Math.abs(dest_Y-source_Y));
		}
		return steps_required;
	}

}
