package array;

/*Given a non-negative number represented as an array of digits,

add 1 to the number ( increment the number represented by the digits ).

The digits are stored such that the most significant digit is at the head
 of the list.

Example:

If the vector has [1, 2, 3]

the returned vector should be [1, 2, 4]

as 123 + 1 = 124.*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class AddOneToNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a[] = new Integer[] { 0,0,9, 9, 9, 9 };
		//Integer a[] = new Integer[] { 1,2,3 };
		System.out.println("Hi RAJESH" + plusOne(new ArrayList(Arrays.asList(a))));
		System.out.println("Hi RAJESH_STREAM" + plusOne_stream(new ArrayList(Arrays.asList(a))));


	}

	public static ArrayList<Integer> plusOne(ArrayList<Integer> A) {
		Stack<Integer> stack = new Stack();
		int q = 1;
		int r = 0;
		for (int i = A.size() - 1; i >= 0; i--) {
			if (q != 0) {
				int temp = A.get(i) + q;
				q = temp / 10;
				r = temp % 10;
				stack.push(r);
			}else {
				stack.push(A.get(i));
			}
		}
		if(q!=0) stack.push(q);
		
		while(stack.peek()==0) {
			stack.pop();
		}
		
		ArrayList<Integer> output = new ArrayList();
		while(!stack.isEmpty()) output.add(stack.pop());
		
		return output;
	}
	static int carry =1;
	public static ArrayList<Integer> plusOne_stream(ArrayList<Integer> A) {
		Collections.reverse(A);
		
		ArrayList<Integer> output = (ArrayList<Integer>) A.stream().map(i -> {
			int temp = i + carry;
			int value = temp % 10;
			carry = temp / 10;
			return value;
		}).collect(Collectors.toList());
		
		Collections.reverse(output);
		
		return output;
	}
}
