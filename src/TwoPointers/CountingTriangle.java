package TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class CountingTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a[] = new Integer[] { 4, 6, 13, 16, 20, 3, 1, 12 };
		System.out.println("Hi RAJESH" + nTriang(new ArrayList(Arrays.asList(a))));
	}

	public static int nTriang(ArrayList<Integer> A) {
		Collections.sort(A);
		Set<ArrayList<Integer>> result = new HashSet();
		int count = 0;

		for (int i = 0; i < A.size() - 2; i++) {
			int start = i + 1;
			int end = start + 1;

			while ((start <= A.size() - 1)) {
				while (end < A.size() && A.get(i) + A.get(start) > A.get(end))
					++end;

				if (end > start)
					count += end - start - 1;
				start++;
			}
		}

		return count;
	}
}
