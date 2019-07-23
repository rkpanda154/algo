package array;

/*
You are given an n x n 2D matrix representing an image.

Rotate the image by 90 degrees (clockwise).

You need to do this in place.

Note that if you end up using an additional array, you will only receive partial score.

Example:

If the array is

[
    [1, 2],
    [3, 4]
]
Then the rotated array becomes:

[
    [3, 1],
    [4, 2]
]
		
	*/	
import java.util.ArrayList;
import java.util.Arrays;

public class RotateMatrixBy90Degee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>> arr = new ArrayList();
		arr.add(new ArrayList(Arrays.asList(new Integer[] { 1,2,3 })));
		arr.add(new ArrayList(Arrays.asList(new Integer[] { 4,5,6 })));
		arr.add(new ArrayList(Arrays.asList(new Integer[] { 7,8,9 })));

		rotate(arr);
		System.out.println("Hi RAJESH" + arr);
	}
	
	public static void rotate(ArrayList<ArrayList<Integer>> a) {
		for(int i =0; i< a.size(); i++) {
			for(int j=i; j<a.size(); j++) {
				int temp= a.get(i).get(j);
				a.get(i).set(j, a.get(j).get(i));
				a.get(j).set(i, temp);
			}
		}
		
		for(int i =0; i< a.size(); i++) {
			ArrayList<Integer> temp= a.get(i);
			int j = 0;
			int k = temp.size()-1;;
			while(j<k) {
				int te= temp.get(j);
				temp.set(j, temp.get(k));
				temp.set(k, te);
				j++;
				k--;
			}
		}
    }

}
