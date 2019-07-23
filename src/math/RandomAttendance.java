package math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*Input:
A = 12, B = [2, 5]

Output:
ans = [10, 2]

Sorted list S: ["1", "10", "11", "12", "2", "3", "4", "5", ...., "9"]
ans = [2nd number, 5th number] = [10, 2]
*/		
public class RandomAttendance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a[] = new Integer[] { 2, 5};
		System.out.print("Rajesh :" + solve(12,new ArrayList(Arrays.asList(a))));
	}
	public static ArrayList<Integer> solve(int A, ArrayList<Integer> B) {
		ArrayList<Integer> output = new ArrayList();
		ArrayList<Integer> temp = new ArrayList();
		for(int i=1; i<=A; i++) temp.add(i);
		
		List<Integer> list = temp.stream()
		.map(i -> Integer.toString(i))
		.sorted()
		.map(Integer::valueOf)
		.collect(Collectors.toList());
		
		for(int i=0; i<B.size(); i++) output.add(list.get(B.get(i)-1));
		
		return output;
    }

}
