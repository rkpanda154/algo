package array;

import java.util.ArrayList;

/*
Given a positive integer n and a string s consisting only of letters D or I, 
you have to find any permutation of first n positive integer that 
satisfy the given input string.

D means the next number is smaller, while I means the next number is greater.

Notes

Length of given string s will always equal to n - 1
Your solution should run in linear time and space.
Example :

Input 1:

n = 3

s = ID

Return: [1, 3, 2]*/
		
public class FindPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hi RAJESH" + findPerm("IDIDI",6));

	}

	public static ArrayList<Integer> findPerm(final String A, int B) {
//		ArrayList<Integer> output = new ArrayList<>();
//		ArrayList<Integer> input = new ArrayList<>();
//		for (int i = 1; i <= B; i++) {
//			input.add(i);
//		}
//
//		return findMatchedPattern(input, A, 0, A.length());
		
		
		
		
		int smallest =1;
        int largest = B;
        ArrayList<Integer> op = new ArrayList<Integer>();
        for(int i=0;i<A.length();i++)
        {
            if(A.charAt(i)=='D')
            {
                op.add(largest);
                largest = largest -1;
            }
            else
            {
                op.add(smallest);
                smallest = smallest+1;
            }
        }
        
        op.add(smallest);
        return op;
	}
	
	
	

	private static ArrayList<Integer> findMatchedPattern(ArrayList<Integer> input, final String A, int start, int end) {

		if (start == end) {
			int k;
			for (k = 1; k < input.size(); k++) {
				if (A.substring(k - 1, k).equals("D")) {
					if (input.get(k - 1) > input.get(k)) {
						continue;
					} else {
						break;
					}
				}
				if (A.substring(k - 1, k).equals("I")) {
					if (input.get(k - 1) < input.get(k)) {
						continue;
					} else {
						break;
					}
				}
			}

			if (k == input.size()) {
				System.out.println(input);
				return input;
			} else
				return null;
			//System.out.println(input);
		}
		for (int i = start; i <= end; i++) {
			int temp = input.get(start);
			input.set(start, input.get(i));
			input.set(i, temp);

			ArrayList<Integer> out = findMatchedPattern(input, A, start + 1, end);
			if (out != null)
				return out;

			temp = input.get(start);
			input.set(start, input.get(i));
			input.set(i, temp);
		}
		return null;
	}

}
