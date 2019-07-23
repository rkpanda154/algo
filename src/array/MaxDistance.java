package array;


/*Given an array A of integers, find the maximum of j - i subjected to the
 *  constraint of A[i] <= A[j].

If there is no solution possible, return -1.

Example :

A : [3 5 4 2]

Output : 2 
for the pair (3, 4)

*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer b[] = new Integer[] { 20,4,5};
		System.out.println("Hi RAJESH" + maximumGap(new ArrayList(Arrays.asList(b))));
	}

	public static int maximumGap(final List<Integer> A) {
		List<Integer> l_min = new ArrayList(A.size());
		List<Integer> r_max = new ArrayList(Collections.nCopies(A.size(), 0));

		int min =Integer.MAX_VALUE;
		for (int i = 0; i < A.size(); i++) {
			min = Math.min(min, A.get(i));
			l_min.add(min);
		}

		int max =Integer.MIN_VALUE;
		for (int j = A.size()-1; j >=0; j--) {
			max = Math.max(max, A.get(j));
			r_max.set(j, max);
		}
		int max_diff =-1;
		int p=0;
		int q=0;
		
		while(p<r_max.size() && q<r_max.size()) {
			if(l_min.get(p) <= r_max.get(q)) {
				max_diff = Math.max(q-p, max_diff);
				q++;
			}else {
				p++;
			}
		}
		return max_diff;
	}
}
