package TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ThreeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a[] = new Integer[] { -10, -10, -10 };
		System.out.println("Hi RAJESH" + threeSumClosest(new ArrayList(Arrays.asList(a)), -5));
	}

	public static int threeSumClosest(ArrayList<Integer> A, int B) {
		Collections.sort(A);
		int closestSum = Integer.MAX_VALUE;
		int diff=Integer.MAX_VALUE;


		for (int i = 0; i < A.size() - 2; i++) {
			int start =i+1;
			int end = A.size()-1;
			

			while (start < end) {
				int sum = A.get(i) + A.get(start) + A.get(end);
				int dif = Math.abs(sum - B);
					if (dif < diff) {
						closestSum = sum;
						diff = dif;
					}
					if (sum <= B) {
						start++;
					} else {
						end--;
					}
				} 
			}
		return closestSum;
}

}
