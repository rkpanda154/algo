package stack_queue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RainWaterTrapped {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a[] = new Integer[] { 2, 0, 2};
		System.out.println("Hi RAJESH" + trap(new ArrayList(Arrays.asList(a))));

	}

	public static int trap(final List<Integer> A) {
		int left_maxx=0;
		int right_maxx=0;
		
		int lo=0;
		int hi=A.size()-1;
		
		int trapped_water=0;
		
		while(lo < hi) {
			if(A.get(lo)< A.get(hi)) {
				if(left_maxx < A.get(lo)) {
					left_maxx = A.get(lo);
				}
				trapped_water += left_maxx-A.get(lo);
				lo++;
			}else {
				if(right_maxx < A.get(hi)) {
					right_maxx = A.get(hi);
				}
				trapped_water += right_maxx-A.get(hi);
				hi--;
			}
			
		}
		return trapped_water;
	}

}
