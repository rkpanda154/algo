package TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;

public class ContainerWithMostWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a[] = new Integer[] { 1, 5, 4, 3 };
		System.out.println("Hi RAJESH" + maxArea(new ArrayList(Arrays.asList(a))));
	}
	public static int maxArea(ArrayList<Integer> A) {
		int max_area = 0;
		int left = 0;
		int right = A.size()-1;
		
		while(left < right) {
			int area = Math.min(A.get(left), A.get(right))* (right-left);
			if(max_area < area ) {
				max_area = area;
			}
			if(A.get(left) < A.get(right)) left++;
			else right--;
		}
	
		return max_area;
    }
}
