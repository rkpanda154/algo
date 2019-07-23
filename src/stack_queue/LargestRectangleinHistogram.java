package stack_queue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class LargestRectangleinHistogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a[] = new Integer[] { 1,3,2,1,1,4 };
		System.out.println("Hi RAJESH" + largestRectangleArea(new ArrayList(Arrays.asList(a))));
	}

	public static int largestRectangleArea(ArrayList<Integer> A) {
		Stack st = new Stack<>();
		int max_area=0;
		
		for(int i=0; i<A.size(); ) {
			if(st.isEmpty() || A.get((int)st.peek()) < A.get(i)) {
				st.push(i);
				i++;
			}
			else {
				int top = (int)st.pop();
				max_area = Math.max(max_area, A.get(top)*(st.isEmpty() ? i : i-(int)st.peek()-1));
			}
		}
		
		while(!st.isEmpty()) {
			int top = (int)st.pop();
			max_area = Math.max(max_area, A.get(top)*(st.isEmpty() ? A.size() : A.size()-(int)st.peek()-1));
		}
		return max_area;
	}
}
