package math;

import java.util.ArrayList;
import java.util.Arrays;

/*Rearrange a given array so that Arr[i] becomes Arr[Arr[i]] with O(1)
 *  extra space.

Example:

Input : [1, 0]
Return : [0, 1]
 Lets say N = size of the array. Then, following holds true :
All elements in the array are in the range [0, N-1]
N * N does not overflow for a signed integer*/

public class RearrangeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer c[] = new Integer[] { 4, 0, 2, 1, 3 };
		ArrayList<Integer> a = new ArrayList(Arrays.asList(c));
		arrange(a);
		System.out.println("Hi RAJESH" + a);
	}
	public static void arrange(ArrayList<Integer> a) {
		// First step: Increase all values by (arr[arr[i]]%n)*n 
		int  n = a.size();
        for (int i = 0; i < n; i++) 
            a.set(i, a.get(i)+((a.get(a.get(i)) % n) *  n)); 
  
        // Second Step: Divide all values by n 
        for (int i = 0; i < n; i++) 
        	a.set(i, a.get(i)/n);
    }

}
