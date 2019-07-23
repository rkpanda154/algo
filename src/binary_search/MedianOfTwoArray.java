package binary_search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*here are two sorted arrays A and B of size m and n respectively.

Find the median of the two sorted arrays ( The median of the array formed by merging both the arrays ).

The overall run time complexity should be O(log (m+n)).

Sample Input

A : [1 4 5]
B : [2 3]

Sample Output

3
*/
public class MedianOfTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a[] = new Integer[] { 1, 4, 5 };
		Integer b[] = new Integer[] { 2, 3,6 };
		System.out.println(
				"Hi RAJESH" + findMedianSortedArrays(new ArrayList(Arrays.asList(a)), new ArrayList(Arrays.asList(b))));

	}

	public static double findMedianSortedArrays(final List<Integer> a, final List<Integer> b) {
		int a_size = a.size();
		int b_size = b.size();
		int i = 0;
		int j = 0;
		double m1 = -1;
		double m2 = -1;

		int total_size = a_size + b_size;
		if (total_size % 2 == 0) {
			for (int count = 0; count <= (a_size + b_size) / 2; count++) {
				if (i != a_size && j != b_size) {
					if (a.get(i) < b.get(j)) {
						m2 =m1;
						m1= a.get(i++);
					} else {
						m2 =m1;
						m1= b.get(j++);
					}
				}else if(count < a.size()) {
					m2 =m1;
					m1= a.get(i++);
				}else if(count < b.size()) {
					m2 =m1;
					m1= b.get(j++);
				}
			}
			return (m1+m2)/2;
		} else {
			for (int count = 0; count <= (a_size + b_size) / 2; count++) {
				if (i != a_size && j != b_size) {
					if (a.get(i) < b.get(j)) {
						m1= a.get(i++);
					} else {
						m1= b.get(j++);
					}
				}else if(count < a.size()) {
					m1= a.get(i++);
				}else if(count < b.size()) {
					m1= b.get(j++);
				}
			}
			return m1;
		}
	}
	
	
	/*public double findMedianSortedArrays(final List<Integer> A, final List<Integer> B) {
	    int len = A.size() + B.size();
	    if(len % 2 == 1) return findKth(A, 0, B, 0, len / 2 + 1);
	    else return (findKth(A, 0, B, 0, len / 2) + findKth(A, 0, B, 0, len / 2 + 1)) / 2.0;
	}
	
	public int findKth(List<Integer> A, int A_start, List<Integer> B, int B_start, int k){
	    if(A_start >= A.size()) return B.get(B_start + k - 1);
	    if(B_start >= B.size()) return A.get(A_start + k - 1);
	    if(k == 1) return Math.min(A.get(A_start), B.get(B_start));
	    
	    int A_key = A_start + k / 2 - 1 < A.size() ? A.get(A_start + k / 2 - 1) : Integer.MAX_VALUE;
	    int B_key = B_start + k / 2 - 1 < B.size() ? B.get(B_start + k / 2 - 1) : Integer.MAX_VALUE;
	    
	    if(A_key < B_key){
	        return findKth(A, A_start + k / 2, B, B_start, k - k / 2);
	    }
	    else
	       return findKth(A, A_start, B, B_start + k / 2, k - k / 2);
	}*/

}
