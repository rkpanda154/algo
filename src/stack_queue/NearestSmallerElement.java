package stack_queue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class NearestSmallerElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a[] = new Integer[] { 39, 27, 11, 4, 24, 32, 32, 1 };
		System.out.println("Hi RAJESH" + prevSmaller(new ArrayList(Arrays.asList(a))));

	}
	public static ArrayList<Integer> prevSmaller(ArrayList<Integer> A) {
		ArrayList<Integer> left_max = new ArrayList<>();

		Stack stack = new Stack<>();
		stack.push(A.get(0));

		left_max.add(-1);
		for (int i = 1; i < A.size(); i++) {
			while (!stack.isEmpty() && (int)stack.peek() >= A.get(i)) {
				int var =(int)stack.pop();
			}
			if (stack.isEmpty())
				left_max.add(-1);
			else
				left_max.add((int) stack.peek() );
			stack.push(A.get(i));
		}
		return left_max;
    }

}
