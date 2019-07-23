package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*Given a list of non negative integers, arrange them such that 
 * they form the largest number.

For example:

Given [3, 30, 34, 5, 9], the largest formed number is 9534330.

Note: The result may be very large, so you need to return a string 
instead of an integer.
	*/
public class FormLargestNumberFromArrayOfIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a[] = new Integer[] { 0, 0, 0 };

		System.out.println("Hi RAJESH" + largestNumber(new ArrayList(Arrays.asList(a))));

	}

	public static String largestNumber(final List<Integer> A) {
		boolean allAreZero = !A.stream().filter(i -> i > 0).findAny().isPresent();

		if (allAreZero)
			return "0";

		Collections.sort(A, new Comparator<Integer>() {

			@Override
			public int compare(Integer arg0, Integer arg1) {
				// TODO Auto-generated method stub
				String one = "" + arg0 + arg1;
				String two = "" + arg1 + arg0;

				return one.compareTo(two) > 0 ? -1 : 1;
			}
		});
		StringBuilder builder = new StringBuilder();
		for (Integer i : A)
			builder.append(i);
		return builder.toString();
	}

}
