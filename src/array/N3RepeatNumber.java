package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/*You’re given a read only array of n integers. 
 * Find out if any integer occurs more than n/3 times in the array in linear
 * time and constant additional space.

If so, return the integer. If not, return -1.

If there are multiple solutions, return any one.

Example :

Input : [1 2 3 1 1]
Output : 1 
1 occurs 3 times which is more than 5/3 times. 
*/
public class N3RepeatNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a[] = new Integer[] { 1000662, 1000975, 1000662, 1000306, 1000662, 1000488, 1000662, 1000732, 1000397, 1000769, 1000662, 1000731, 1000454};
		System.out.println("Hi RAJESH" + repeatedNumber(new ArrayList(Arrays.asList(a))));

	}
	public static int repeatedNumber(final List<Integer> a) {
		int candidate_1 = Integer.MAX_VALUE;
		int candidate_2 = Integer.MAX_VALUE;
		
		int count_1=0;
		int count_2=0;
		
		for(int i=0; i<a.size(); i++) {
			if(a.get(i)==candidate_1) {
				count_1++;
			}else if(a.get(i)==candidate_2){
				count_2++;
			}
			else if(count_1==0) {
				candidate_1=a.get(i);
				count_1++;
			}
			else if(count_2==0) {
				candidate_2=a.get(i);
				count_2++;
			}else {
				count_1--;
				count_2--;
			}
		}
		
		count_1=0;
		count_2=0;
		
		for(int i=0; i<a.size(); i++) {
			if(a.get(i)==candidate_1) count_1++;
			else if(a.get(i)==candidate_2) count_2++;
		}
		
		if(count_1 > a.size()/3) return candidate_1;
		if(count_2 > a.size()/3) return candidate_2;
		
		return -1;
    }
	

}
