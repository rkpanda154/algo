package stack_queue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class EvaluateExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a[] = new String[] { "2", "1", "+", "3", "*"};
		System.out.println("Hi RAJESH" + evalRPN(new ArrayList(Arrays.asList(a))));

	}

	public static int evalRPN(ArrayList<String> A) {
		Stack<Integer> stack = new Stack();
		for (int i = 0; i < A.size(); i++) {
			if (checkNumber(A.get(i))) {
				stack.push(Integer.parseInt(A.get(i)));
			} else {
				int op2;
				int op1;
				switch (A.get(i)) {
				case "+":
					op2 = stack.pop();
					op1 = stack.pop();
					stack.push(op1 + op2);
					break;
				case "-":
					op2 = stack.pop();
					op1 = stack.pop();
					stack.push(op1 - op2);
					break;
				case "*":
					op2 = stack.pop();
					op1 = stack.pop();
					stack.push(op1 * op2);
					break;
				case "/":
					op2 = stack.pop();
					op1 = stack.pop();
					stack.push(op1 / op2);
					break;
				}

			}
		}

		return stack.pop();
	}

	public static boolean checkNumber(String str) {
		try {
			Integer.parseInt(str);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
