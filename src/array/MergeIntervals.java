package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;



/*Given a set of non-overlapping intervals, insert a new interval 
 * into the intervals (merge if necessary).

You may assume that the intervals were initially sorted according to 
their start times.

Example 1:

Given intervals [1,3],[6,9] insert and merge [2,5] would result in [1,5],[6,9].

Example 2:

Given [1,2],[3,5],[6,7],[8,10],[12,16], insert and merge [4,9] would 
result in [1,2],[3,10],[12,16].

This is because the new interval [4,9] overlaps with [3,5],[6,7],[8,10].

Make sure the returned intervals are also sorted.
*/

public class MergeIntervals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interval int1 = new Interval(1, 3);
		Interval int2 = new Interval(4, 7);
		Interval int21 = new Interval(7, 9);
		Interval int22 = new Interval(10, 11);

		Interval int3 = new Interval(2, 12);

		ArrayList<Interval> list = new ArrayList();
		list.add(int1);
		list.add(int2);
		list.add(int21);
		list.add(int22);

		System.out.println("Hi RAJESH" + insert(list, int3));

	}

	public static ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
		ArrayList<Interval> output = new ArrayList();

		if(intervals.size()==0) {
			output.add(newInterval);
			return output;
		}
		if (newInterval.start <= intervals.get(0).start) {
			intervals.add(0, newInterval);
		} else if (newInterval.start > intervals.get(intervals.size() - 1).start
				&& !(newInterval.end <= intervals.get(intervals.size() - 1).end)) {
			intervals.add(intervals.size(), newInterval);
		} else {
			for (int i = 0; i < intervals.size(); i++) {
				if (newInterval.start >= intervals.get(i).start && !(newInterval.end <= intervals.get(i).end)) {
					if (i + 1 == intervals.size()) {
						intervals.add(i + 1, newInterval);
						break;
					} else if (newInterval.start < intervals.get(i + 1).start) {
						intervals.add(i + 1, newInterval);
						break;
					}
				}
			}
		}


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

class Interval {
	int start;
	int end;

	Interval() {
		start = 0;
		end = 0;
	}

	Interval(int s, int e) {
		start = s;
		end = e;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[" + start + "," + end + "]";
	}
}
