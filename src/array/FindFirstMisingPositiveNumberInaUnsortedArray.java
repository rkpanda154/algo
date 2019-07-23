package array;

/*Given an unsorted integer array, find the first missing positive 
 * integer.

Example:

Given [1,2,0] return 3,

[3,4,-1,1] return 2,

[-8, -7, -6] returns 1

Your algorithm should run in O(n) time and use constant space*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindFirstMisingPositiveNumberInaUnsortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a[] = new Integer[] { 3, 2 };
		System.out.println("Hi RAJESH" + firstMissingPositive(new ArrayList(Arrays.asList(a))));

		Integer b[] = new Integer[] { 3, 2, 1 };
		System.out.println("Hi RAJESH" + firstMissingPositive(new ArrayList(Arrays.asList(b))));

		Integer c[] = new Integer[] { -3, -2, -1 };
		System.out.println("Hi RAJESH" + firstMissingPositive(new ArrayList(Arrays.asList(c))));

	}

	public static int firstMissingPositive(ArrayList<Integer> A) {
		if (null == A)
			return 1;

		int size = A.size();
		int result = 1;

		List<Integer> temp = new ArrayList<>(size + 1);

		for (int i = 0; i < size + 1; i++) {
			temp.add(i, 0);
		}

		for (int i = 0; i < size; i++) {
			if (A.get(i) <= 0 || A.get(i) > size)
				continue;

			else {
				int index = A.get(i) - 1;
				int value = temp.get(index) + 1;
				temp.set(index, value);
			}

		}

		for (int i = 0; i < size + 1; i++) {
			if (temp.get(i) == 0)
				return i + 1;
		}

		return result;
	}

}
