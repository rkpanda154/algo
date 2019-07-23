package TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxContinuousSeriesof1s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a[] = new Integer[] { 1, 1, 0, 1, 1, 0, 0, 1, 1, 1};
		System.out.println("Hi RAJESH" + maxone(new ArrayList(Arrays.asList(a)),1));
	}
	public static ArrayList<Integer> maxone(ArrayList<Integer> A, int B) {
		int wl=0;
		int wr=0;
		int zero_count =0;
		int bestwindow=0;
		int wl_output=0;
		int wr_output=0;
		while(wr < A.size()) {
			if(zero_count <= B) {
				if(A.get(wr)==0) zero_count++;
				wr++;
			}
			
			if(zero_count >B) {
				if(A.get(wl)==0) zero_count--;
				wl++;
			}
			
			if(wr -wl > bestwindow) {
				wl_output =wl;
				wr_output = wr;
				bestwindow= wr -wl;
			}
		}
		ArrayList<Integer> output = new ArrayList();

		for(int i=wl_output; i<wr_output; i++) {
			output.add(i);
		}
		return output;
    }
}
