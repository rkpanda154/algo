package TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;

public class SortByColor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a[] = new Integer[] { 0, 0, 2, 0, 2, 0, 1, 0, 2, 1, 1};
		ArrayList<Integer> b = new ArrayList(Arrays.asList(a));
		sortColors(b);
		System.out.println("Hi RAJESH" + b);

	}

	public static void sortColors(ArrayList<Integer> a) {
		int last0 = 0, last1 = 0, last2 = 0;
        for (int i = 0; i < a.size(); i++) {
            switch (a.get(i)) {
                case 0:
                    a.set(last0, 0);
                    last0++;
                case 1:
                    if (last1 >= last0)
                        a.set(last1, 1);
                    last1++;
                case 2:
                    if (last2 >= last1)
                        a.set(last2, 2);
                    last2++;
            }
        }
		
	}
}
