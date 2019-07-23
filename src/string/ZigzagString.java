package string;

import java.util.ArrayList;
import java.util.List;

public class ZigzagString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi RAJESH:::" + convert("PAYPALISHIRING", 1));
	}

	public static String convert(String A, int B) {
		if(B==1) return A;
		List<List<String>> ot = new ArrayList<>();
		boolean isReverse = false;
		for (int i = 0; i < B; i++) {
			ot.add(new ArrayList());
		}
		int listIndex = -1;
		for (int i = 0; i < A.length(); i++) {
			if (!isReverse)
				listIndex++;
			if (isReverse)
				listIndex--;

			ot.get(listIndex).add(A.charAt(i) + "");
			
			if (listIndex == B - 1)
				isReverse = true;
			if (listIndex == 0)
				isReverse = false;
		}
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < ot.size(); i++) {
			for (int j = 0; j < ot.get(i).size(); j++) {
				builder.append(ot.get(i).get(j));
			}
		}

		return builder.toString();
	}

}
