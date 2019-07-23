package stack_queue;

import java.util.Stack;

public class SimplifyDirectoryPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi RAJESH" + simplifyPath("/../"));

	}

	public static String simplifyPath(String A) {
		Stack st = new Stack();
		StringBuilder dirName = new StringBuilder();

		for (int i = 0; i < A.length(); i++) {
			if (A.charAt(i) != '/') {
				dirName.append(A.charAt(i));
			} else {
				if (dirName.toString().equals("..")) {
					if (!st.isEmpty())
						st.pop();
				} else if (dirName.toString().equals(".")) {
				} else {
					if (dirName.length() != 0)
						st.push(dirName.reverse().toString());
				}
				dirName.setLength(0);
			}
		}
		if (dirName.toString().equals("..")) {
			if (!st.isEmpty())
				st.pop();
		} else if (dirName.toString().equals(".")) {
		} else {
			if (dirName.length() != 0)
				st.push(dirName.reverse().toString());
		}
		StringBuilder builder = new StringBuilder();

		while (!st.isEmpty()) {
			builder.append(st.pop()).append("/");
		}
		builder = builder.reverse();

		return builder.length()==0 ? "/" : builder.toString();
	}

}
