package TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveDuplicatesfromSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a[] = new Integer[] { 1000, 1000, 1000 };
		System.out.println("Hi RAJESH" + removeDuplicates(new ArrayList(Arrays.asList(a))));
	}

	public static int removeDuplicates(List<Integer> a) {
		//USING TWO POINTERS
		
		int replace_index=0;
		
		for(int i=0; i<a.size(); i++) {
			if(i != replace_index && !a.get(i).equals(a.get(replace_index)) ) {
				replace_index++;
				a.set(replace_index, a.get(i));
			}
		}
		a= a.subList(0, replace_index+1);
		return a.size();
		
		// USING JAVA API
//		Iterator<Integer> itr = a.iterator();
//		int prev=0;
//		if(itr.hasNext()) { 
//			prev = itr.next();
//		}else {
//			return 0;
//		}
//		 
//		while(itr.hasNext()) {
//			int curr = itr.next();
//			if(curr == prev) itr.remove();
//			else prev = curr;
//		}
//		return a.size();
	}

}
