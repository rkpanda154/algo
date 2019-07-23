package TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeTwoSortedListsII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a[] = new Integer[] { 4, 5, 8 };
		Integer b[] = new Integer[] { 10, 12 };
		
		ArrayList<Integer> a1 = new ArrayList(Arrays.asList(a)); 
		ArrayList<Integer> b1 = new ArrayList(Arrays.asList(b));
		merge(a1,b1);
		System.out.println("Hi RAJESH" + a1);

	}

	public static void merge(ArrayList<Integer> a, ArrayList<Integer> b) {
		int a_index =0;
		for(int b_index=0; b_index<b.size();) {
			while((a_index < a.size()) && (b.get(b_index) < a.get(a_index))) {
				a.add(a_index, b.get(b_index));
				b_index ++;
				break;
			}
			a_index ++;
			
			if(a_index >= a.size()) {
				while(b_index < b.size()) {
					a.add(a_index, b.get(b_index));
					b_index ++;
					a_index ++;
				}
			}
			
		}
	}
}
