package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


/*Implement the next permutation, which rearranges numbers into 
 * the numerically next greater permutation of numbers.

If such arrangement is not possible, it must be rearranged as the lowest
 possible order ie, sorted in an ascending order.

The replacement must be in-place, do not allocate extra memory.

Examples:

1,2,3 → 1,3,2

3,2,1 → 1,2,3

1,1,5 → 1,5,1

20, 50, 113 → 20, 113, 50
*/

public class NextPermutation {

	public static void main(String[] args) {
		Integer a[] = new Integer[] { 319, 695, 52 };
		ArrayList<Integer> input = new ArrayList(Arrays.asList(a));
		nextPermutation(input);
		System.out.println("Hi RAJESH" + input);

	}

	public static void nextPermutation(ArrayList<Integer> a) {
		int i;
		int min_index = a.size() - 1;
		for (i = a.size() - 1; i > 0; i--) {
			if (a.get(i - 1) < a.get(i)) {
				break;
			}
		}

		if (i == 0) {
			Collections.reverse(a);
		} else {
			int swap_num= i;
			for (int j = i+1; j<=a.size()-1; j++) {
				if (a.get(i - 1) < a.get(j) && a.get(j) < a.get(swap_num)) {
					swap_num = j;
				}
			}
			
			int temp1= a.get(i-1);
			a.set(i-1, a.get(swap_num));
			a.set(swap_num, temp1);
			
			Collections.sort(a.subList(i, a.size()));
		}

	}
}
