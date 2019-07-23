package math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*Hamming distance between two non-negative integers is defined as the 
number of positions at which the corresponding bits are different.

For example,

HammingDistance(2, 7) = 2, as only the first and the third bit differs 
in the binary representation of 2 (010) and 7 (111).

Given an array of N non-negative integers, find the sum of hamming distances 
of all pairs of integers in the array.
Return the answer modulo 1000000007.

Example

Let f(x, y) be the hamming distance defined above.

A=[2, 4, 6]

We return,
f(2, 2) + f(2, 4) + f(2, 6) + 
f(4, 2) + f(4, 4) + f(4, 6) +
f(6, 2) + f(6, 4) + f(6, 6) = 

0 + 2 + 1
2 + 0 + 1
1 + 1 + 0 = 8*/

public class SumOfPairwiseHammingDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer c[] = new Integer[] { 2, 4, 6 };
		System.out.println("Hi RAJESH" + hammingDistance(new ArrayList(Arrays.asList(c))));

	}

	static Map <String, Long> map= new HashMap();
	public static long hammingDistance(final List<Integer> A) {
		long sum=0;
		for(int i=0; i<A.size(); i++) {
			for(int j=0; j<A.size(); j++) {
				if(i==j) continue;
				sum += calculateHammingDistance(A.get(i), A.get(j));
				sum = sum % 1000000007;
			}
		}
		return sum;
	}
	
	public static long calculateHammingDistance(int x, int y) {
		if(map.containsKey(x+":"+y)) return map.get(x+":"+y);
		long z = x ^ y;
		long distance =0;
		while(z > 0) {
			distance += z & 1;
			z = z>>1;
		}
		map.put(x+":"+y, distance);
		
		return distance;
	}

}
