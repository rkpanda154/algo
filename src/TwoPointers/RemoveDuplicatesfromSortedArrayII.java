package TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicatesfromSortedArrayII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a[] = new Integer[] { 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3 };
		System.out.println("Hi RAJESH" + removeDuplicates(new ArrayList(Arrays.asList(a))));

	}

	public static int removeDuplicates(List<Integer> a) {

		int replace_index = 1;
		int currElement = a.get(0);
		boolean isRepeated = false;

		for (int i = 1; i < a.size(); i++) {
			if (currElement == a.get(i)) {
				if (!isRepeated) {
					a.set(replace_index, currElement);
					replace_index++;
					isRepeated = true;
				}
			} else {
				currElement = a.get(i);
				isRepeated = false;
				a.set(replace_index, currElement);
				replace_index++;
			}
		}
		a = a.subList(0, replace_index);
		return a.size();
	}
}
