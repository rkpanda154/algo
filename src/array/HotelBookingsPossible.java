package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/*A hotel manager has to process N advance bookings of rooms for the next season. 
 * His hotel has K rooms.
 *  Bookings contain an arrival date and a departure date. He wants to find out
 *   whether there are enough rooms
 *  
 *   in the hotel to satisfy the demand. Write a program that solves this problem 
 *   in time O(N log N) .


Input:


First list for arrival time of booking.
Second list for departure time of booking.
Third is K which denotes count of rooms.

Output:

A boolean which tells whether its possible to make a booking. 
Return 0/1 for C programs.
O -> No there are not enough rooms for N booking.
1 -> Yes there are enough rooms for N booking.
Example :

Input : 
        Arrivals :   [1 3 5]
        Departures : [2 6 8]
        K : 1

Return : False / 0 

At day = 5, there are 2 guests in the hotel. But I have only one room. 
*/

public class HotelBookingsPossible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Integer a[] = new Integer[] { 1,2,3,4 };
//		Integer b[] = new Integer[] {10,2,6,4 };
		
		Integer a[] = new Integer[] { 40,18 };
		Integer b[] = new Integer[] {40,63 };
		System.out.println("Hi RAJESH" + hotel(new ArrayList(Arrays.asList(a)), new ArrayList(Arrays.asList(b)), 1));

	}

	public static boolean hotel(ArrayList<Integer> arrive, ArrayList<Integer> depart, int K) {

		class PairX implements Comparable<PairX>  {
			int time;
			int value;
			int seq;

			PairX(int time, int value, int seq) {
				this.time = time;
				this.value = value;
				this.seq = seq;
			}

			@Override
			public int compareTo(PairX arg1) {
				// TODO Auto-generated method stub
				return time >  arg1.time ? 1 : time ==  arg1.time && seq > arg1.seq ? 1:-1;
			}
		}

		ArrayList<PairX> allTime = new ArrayList<>();

		int seq=0;
		for (int i = 0; i < arrive.size(); i++) {
			allTime.add(new PairX(arrive.get(i), 1, seq++));
			allTime.add(new PairX(depart.get(i), -1, seq++));
		}
		
		Collections.sort(allTime);
		
		int sum = 0;

		for (int i = 0; i < allTime.size(); i++) {
			sum = sum + allTime.get(i).value;
			if (sum > K)
				return false;
		}

		return true;
	}

}
