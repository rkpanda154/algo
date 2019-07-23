package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*Given a collection of intervals, merge all overlapping intervals.

For example:

Given [1,3],[2,6],[8,10],[15,18],

return [1,6],[8,10],[15,18].

Make sure the returned intervals are sorted.

*/

public class MergeOverlappingIntervals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interval int1 = new Interval(1, 3);
		Interval int2 = new Interval(4, 7);
		Interval int21 = new Interval(2, 9);
		Interval int22 = new Interval(10, 11);

		Interval int3 = new Interval(2, 12);

		ArrayList<Interval> list = new ArrayList();
		list.add(int1);
		list.add(int2);
		list.add(int21);
		list.add(int22);

		System.out.println("Hi RAJESH" + merge(list));
	}
	public static ArrayList<Interval> merge(ArrayList<Interval> intervals) {
		ArrayList<Interval> output = new ArrayList();

		Collections.sort(intervals,new Comparator<Interval>() {

			@Override
			public int compare(Interval arg0, Interval arg1) {
				// TODO Auto-generated method stub
				return arg0.start > arg1.start ? 1 :-1;
			}
		});
		int start = -1;
		int end = -1;

		for (int i = 0; i < intervals.size(); i++) {
			if (start == -1) {
				start = intervals.get(i).start;
				end = intervals.get(i).end;
			}
			if (i == intervals.size() - 1)
				output.add(new Interval(start, end));
			else if (end >= intervals.get(i + 1).start) {
				end = Math.max(end, intervals.get(i+1).end);
				continue;
			}
			else {
				output.add(new Interval(start, end));
				start = -1;
				end = -1;
			}
		}

		return output;
    }

}
