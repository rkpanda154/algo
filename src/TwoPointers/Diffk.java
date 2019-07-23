package TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Diffk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a[] = new Integer[] { 1,3,4,4,5 };
		System.out.println("Hi RAJESH" + diffPossible(new ArrayList(Arrays.asList(a)), 0));
	}

	public static int diffPossible(ArrayList<Integer> A, int B) {
		
		Map<Integer,Integer> holder = new HashMap<>();
		for (int i = 0; i < A.size(); i++) {
			holder.put(A.get(i), i);
		}
		
		for (int i = 0; i < A.size()-1; i++) {
			if(holder.containsKey(Math.abs(B + A.get(i))) 
					&& (!holder.get(Math.abs(B + A.get(i))).equals(i))) {
				return 1;
			}
		}
		return 0;
	}

}
