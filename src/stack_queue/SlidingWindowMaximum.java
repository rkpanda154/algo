package stack_queue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class SlidingWindowMaximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a[] = new Integer[] { 648, 614, 490, 138, 657, 544, 745, 582, 738, 229, 775, 665, 876, 448, 4, 81, 807, 578, 712, 951, 867, 328, 308, 440, 542, 178, 637, 446, 882 };
		System.out.println("Hi RAJESH" + slidingMaximum(new ArrayList(Arrays.asList(a)), 9));

	}

	public static ArrayList<Integer> slidingMaximum(final List<Integer> A, int B) {
		List<Integer> window = new ArrayList(B);
		ArrayList<Integer> output = new ArrayList(A.size()-B+1);
		
		if(B >= A.size()) {
			int max =  Integer.MIN_VALUE;
			for(int i=0; i<A.size(); i++) {
				max = Math.max(max, A.get(i));
			}
			output.add(max);
			return output;
		}else {
			for(int i=0; i<B; i++) {
				 while(!window.isEmpty() && A.get(window.get(window.size()-1)) < A.get(i)) {
					 window.remove(window.size()-1);
				 }
				 window.add(i);
			}
			
			for(int i=B; i< A.size(); i++) {
				output.add(A.get(window.get(0)));
				
				if(window.get(0) < i-B+1) window.remove(0);
				
				while(!window.isEmpty() && A.get(window.get(window.size()-1)) < A.get(i)) {
					 window.remove(window.size()-1);
				 }
				 window.add(i);
			}
			output.add(A.get(window.get(0)));
		}
		return output;
	}
}
