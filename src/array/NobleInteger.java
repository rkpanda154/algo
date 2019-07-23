package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*Given an integer array, find if an integer p exists in the array 
such that the number of integers greater than p in the array equals to p

If such an integer is found return 1 else return -1.*/

public class NobleInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a[] = new Integer[] { -1};
		System.out.println("Hi RAJESH" + solve(new ArrayList(Arrays.asList(a))));

	}

	public static int solve(ArrayList<Integer> A) {
		if (A.size() == 1 && A.get(0) == 0)
			return 1;
		if (A.size() == 1 && A.get(0) != 0)
			return -1;

		Collections.sort(A);
		int lastElement = A.get(A.size() - 1);
		if (lastElement == 0)
			return 1;

		for (int i = A.size() - 2; i >= 0; i--) {
			if (A.get(i) != lastElement && A.get(i) == A.size() - (i + 1)) {
				return 1;
			} 
			lastElement = A.get(i);

		}
		return -1;
	}
}
