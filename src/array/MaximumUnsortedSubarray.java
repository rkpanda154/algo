package array;

import java.util.ArrayList;
import java.util.Arrays;

/*You are given an array (zero indexed) of N non-negative integers,
 *  A0, A1 ,…, AN-1.
Find the minimum sub array Al, Al+1 ,…, Ar so if we sort(in ascending order)
 that sub array, then the whole array should get sorted.
If A is already sorted, output -1.

Example :

Input 1:

A = [1, 3, 2, 4, 5]

Return: [1, 2]

Input 2:

A = [1, 2, 3, 4, 5]

Return: [-1]
*/

public class MaximumUnsortedSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a[] = new Integer[] { 1, 2, 3, 5, 6, 13, 15, 16, 17, 13, 13, 15, 17, 17, 17, 17, 17, 19, 19 };
		System.out.println("Hi RAJESH" + subUnsort(new ArrayList(Arrays.asList(a))));

	}

	public static ArrayList<Integer> subUnsort(ArrayList<Integer> A) {
		ArrayList<Integer> output = new ArrayList();
		
		if (A.size() <= 1) {
			output.add(-1);
			return output;
		}

		int l_index = 0;
		while (l_index < A.size()-1 && A.get(l_index) <= A.get(l_index+1)) {
			l_index++;
		}

		int r_index = A.size() - 1;
		while (r_index > 0 && A.get(r_index - 1) <= A.get(r_index)) {
			r_index--;
		}

		
		
		int min= Integer.MAX_VALUE;
		int max= Integer.MIN_VALUE;
		
		for(int i=l_index; i<=r_index; i++) {
			min= Math.min(min, A.get(i));
			max= Math.max(max, A.get(i));
		}
		
		while(l_index >0) {
			if(A.get(l_index-1) <= min) break;
			else l_index--;
		}
		
		while(r_index < A.size()-1) {
			if(A.get(r_index+1) >= max) break;
			else r_index++;
		}
		
		if (l_index >= r_index) {
			output.add(-1);
			return output;
		}

		output.add(l_index);
		output.add(r_index);
		return output;
	}
}
