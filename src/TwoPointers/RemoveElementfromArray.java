package TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveElementfromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a[] = new Integer[] { 1,1,1};
		System.out.println("Hi RAJESH" + removeElement(new ArrayList(Arrays.asList(a)),1));
	
	}
	public static int removeElement(List<Integer> a, int b) {
		int replace_index=-1;
		
		for(int i=0; i<a.size(); i++) {
			if(a.get(i) != b) {
				replace_index++;
				a.set(replace_index, a.get(i));
			}
		}
		a = a.subList(0, replace_index+1);
		return a.size();
    }
}
