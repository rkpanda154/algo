package stack_queue;

import java.util.ArrayList;
import java.util.List;

public class MinStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinStack stack = new MinStack();

		System.out.println("Top:" + stack.top());
		System.out.println("Min:" + stack.getMin());

		stack.push(3);

		System.out.println("Top:" + stack.top());
		System.out.println("Min:" + stack.getMin());

		stack.push(9);
		stack.push(-1);

		System.out.println("Top:" + stack.top());
		System.out.println("Min:" + stack.getMin());

		stack.push(2);
		stack.push(5);

		System.out.println("Top:" + stack.top());
		System.out.println("Min:" + stack.getMin());
	}

	List<Integer> list = new ArrayList<>();
	List<Integer> minList = new ArrayList<>();

	public void push(int x) {
		list.add(x);
		if (minList.isEmpty())
			minList.add(x);
		else if (x <= minList.get(minList.size() - 1))
			minList.add(x);
	}

	public void pop() {
		if (!list.isEmpty()) {
			int top = list.get(list.size() - 1);
			list.remove(list.size() - 1);
			if(getMin() == top) minList.remove(minList.size()-1);
		}
	}

	public int top() {
		if(list.isEmpty()) return -1;
		else return list.get(list.size()-1);

	}

	public int getMin() {
		if(minList.isEmpty()) return -1;
		else return minList.get(minList.size()-1);

	}
}
