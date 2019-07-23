package stack_queue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class RedundantBraces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi RAJESH" + braces("(a+(b)/c)"));
	}

	public static int braces(String A) {
		Stack st = new Stack<>();
		
		for(int i=0; i<A.length(); i++) {
			char ch = A.charAt(i);
			if(ch == ')') {
				boolean isExpressionFound =false;
				while(!st.isEmpty() && (char)st.peek() != '(') {
					char ch1= (char)st.pop();
					if(ch1 == '+' || ch1 == '-' || ch1 == '*' || ch1 == '/') {
						isExpressionFound = true;
					}
				}
				if(!st.isEmpty()) st.pop();
				
				if(!isExpressionFound) return 1;
			}else {
				st.push(ch);
			}
		}
		return 0;
	    }
}
