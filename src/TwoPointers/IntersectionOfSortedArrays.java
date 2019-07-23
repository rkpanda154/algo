package TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a[] = new Integer[] {1,2,5};
		Integer b[] = new Integer[] { 2,5,6,7,8};
		
		ArrayList<Integer> a1 = new ArrayList(Arrays.asList(a)); 
		ArrayList<Integer> b1 = new ArrayList(Arrays.asList(b));
		ArrayList<Integer> result = intersect(a1,b1);
		
		System.out.println("Hi RAJESH" + result);

	}

	public static ArrayList<Integer> intersect(final List<Integer> A, final List<Integer> B) {
		int a_index=0;
		int b_index=0;
		ArrayList<Integer> result = new ArrayList();
		
		while(a_index < A.size() && b_index < B.size()) {
			if(A.get(a_index).equals(B.get(b_index))) {
				result.add(A.get(a_index));
				a_index++;
				b_index++;
			}else if(A.get(a_index) < B.get(b_index)){
				a_index++;
			}else {
				b_index++;
			}
		}
		return result;
	}

}
