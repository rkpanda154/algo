package array;


/*Given an array of integers, sort the array into a wave 
 * like array and return it, 
In other words, arrange the elements into a sequence such 
that a1 >= a2 <= a3 >= a4 <= a5.....

Example

Given [1, 2, 3, 4]

One possible answer : [2, 1, 4, 3]
Another possible answer : [4, 1, 3, 2]
*/		
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortAnArrayInWaveForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a[] = new Integer[] { 5,1,3,2,4 };
		System.out.println("Hi RAJESH" + wave(new ArrayList(Arrays.asList(a))));

	}
	
	public static ArrayList<Integer> wave(ArrayList<Integer> A) {
//		ArrayList<Integer> output = new ArrayList();
//		int i =0;
//		int n= A.size();
//		
//		if(n==0 || n==1) return A;
//		
//		while (i< n) {
//			if(i > 0 && A.get(i) < A.get(i-1)) {
//				int temp= A.get(i);
//				A.set(i, A.get(i-1));
//				A.set(i-1, temp);
//			}
//			
//			if(i < n-1 && A.get(i) < A.get(i+1)) {
//				int temp= A.get(i);
//				A.set(i, A.get(i+1));
//				A.set(i+1, temp);
//			}
//			i=i+2;
//		}
//		return A;
		
		Collections.sort(A);
		int n = A.size();
		
		for (int i=0; i< n-1; i=i+2) {
			int temp= A.get(i);
			A.set(i, A.get(i+1));
			A.set(i+1, temp);
		}
		
		return A;
    }

}
