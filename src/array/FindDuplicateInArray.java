package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Given a read only array of n + 1 integers between 1 and n, 
 * find one number that repeats 
 * in linear time using less than O(n) space and traversing the 
 * stream sequentially O(1) times.

Sample Input:

[3 4 1 4 1]
Sample Output:

1
If there are multiple possible answers ( like in the sample case above ), 
output any one.*/

public class FindDuplicateInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a[] = new Integer []{3,4,1,4,1};
		System.out.println("Hi RAJESH"+ repeatedNumber(new ArrayList(Arrays.asList(a))));
		
		Integer b[] = new Integer []{2,3,2,1};
		System.out.println("Hi RAJESH"+ repeatedNumber(new ArrayList(Arrays.asList(b))));
	}

	public static int repeatedNumber(final List<Integer> a) {

		int size = a.size();

		List<Integer> temp = new ArrayList<>(size);

		for (int i = 0; i < size; i++) {
			temp.add(i, 0);
		}

		for (int i = 0; i < size; i++) {
			int index = a.get(i) - 1;
			int value = temp.get(index) + 1;
			temp.set(index, value);
		}

		for (int i = 0; i < size + 1; i++) {
			if (temp.get(i) >1)
				return i + 1;
		}

		return -1;
	}
}
