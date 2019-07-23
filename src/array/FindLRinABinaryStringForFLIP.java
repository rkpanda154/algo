package array;

import java.util.ArrayList;
import java.util.Arrays;

/*You are given a binary string(i.e. with characters 0 and 1) S 
 * consisting of characters S1, S2, …, SN. In a single operation, 
 * you can choose two indices L and R such that 1 ≤ L ≤ R ≤ N and flip 
 * the characters SL, SL+1, …, SR. By flipping, we mean change character 0 to 1
 *  and vice-versa.

Your aim is to perform ATMOST one operation such that in final string number
 of 1s is maximised. If you don’t want to perform the operation, return an 
 empty array. Else, return an array consisting of two elements denoting L and R.
  If there are multiple solutions, return the lexicographically smallest pair
   of L and R.

Notes:

Pair (a, b) is lexicographically smaller than pair (c, d) if a < c or, 
if a == c and b < d.
For example,

S = 010

Pair of [L, R] | Final string
_______________|_____________
[1 1]          | 110
[1 2]          | 100
[1 3]          | 101
[2 2]          | 000
[2 3]          | 001

We see that two pairs [1, 1] and [1, 3] give same number of 1s in final string. So, we return [1, 1].
Another example,

If S = 111

No operation can give us more than three 1s in final string. 
So, we return empty array [].*/

public class FindLRinABinaryStringForFLIP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a[] = new Integer[] { -2, -1, -3 };
		System.out.println("Hi RAJESH" + flip("000111100"));
	}

	public static ArrayList<Integer> flip(String A) {
		ArrayList<Integer> output = new ArrayList();

		boolean isAllOne = true;
		for (int i = 0; i < A.length(); i++) {
			if (A.charAt(i) != '1') {
				isAllOne = false;
				break;
			}
		}
		if (isAllOne)
			return output;

		int max_zero_so_far = 0;
		int effective_zero_so_far = 0;

		int l_index = -1;
		int r_index = -1;

		int l_output_index = -1;
		int r_output_index = -1;

		for (int i = 0; i < A.length(); i++) {
			effective_zero_so_far = effective_zero_so_far + (A.charAt(i) == '0' ? 1 : -1);

			if (effective_zero_so_far < 0) {
				effective_zero_so_far = 0;
				l_index = r_index = -1;
			} else {
				if (r_index == -1) {
					l_index = r_index = i;
				}
			}

			if (effective_zero_so_far > max_zero_so_far) {
				if (r_output_index == -1) {
					r_output_index = l_output_index = i;
				} else
					r_index = i;

				max_zero_so_far = effective_zero_so_far;
				r_output_index = r_index;
				l_output_index = l_index;
			}

		}

		output.add(l_output_index + 1);
		output.add(r_output_index + 1);

		return output;
	}
}
