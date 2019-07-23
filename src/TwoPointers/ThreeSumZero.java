package TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ThreeSumZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a[] = new Integer[] {-1, 0, 1, 2, -1, -4 };
		System.out.println("Hi RAJESH" + threeSum(new ArrayList(Arrays.asList(a))));
	}

	public static ArrayList<ArrayList<Integer>> threeSum(ArrayList<Integer> A) {
		Collections.sort(A);
		Set<ArrayList<Integer>> result = new HashSet();
		int diff = Integer.MAX_VALUE;

		for (int i = 0; i < A.size() - 2; i++) {
			int start = i + 1;
			int end = A.size() - 1;

			while (start < end) {
				int sum = A.get(i) + A.get(start) + A.get(end);
				if (sum == 0) {
					ArrayList<Integer> temp = new ArrayList();
					temp.add(A.get(i));
					temp.add(A.get(start));
					temp.add(A.get(end));
					
					result.add(temp);
				}
				if (sum < 0) {
					start++;
				} else {
					end--;
				}
			}
		}
		ArrayList<ArrayList<Integer>> output = new ArrayList();
		output.addAll(result);
		return output;
	}
}
