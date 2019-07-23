package math;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*Given a string, find the rank of the string amongst its permutations sorted lexicographically. 
Assume that no characters are repeated.

Example :

Input : 'acb'
Output : 2

The order permutations with letters 'a', 'c', and 'b' : 
abc
acb
bac
bca
cab
cba
The answer might not fit in an integer, so return your answer % 1000003*/
		
public class SortedPermutationRank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Rajesh :" + findRank("ZCSFLVHXRYJQKWABGT"));

	}
	
	public static long findRank(String A) {
		 long rank=1;
		 long fact = fact(A.length());
		 for(int i=0; i<A.length(); i++) {
			 fact = fact/(A.length()-i);
			 long smalChar =  noOfSmallerChar(A, i);
			 rank += smalChar*fact;
		 }
		 return rank % 1000003;
	 }
	 
	 public static long noOfSmallerChar(String A, int start) {
		 long result =0;
		 char let= A.charAt(start);
		 
		 for(int i=start+1; i<A.length(); i++) {
			 if(let > A.charAt(i)) result++;
		 }
		 return result;
	 }
	 
	 
	 public static long fact(int num) {
		 if(num <=1) return 1;
		 return num * fact(num-1);
	 }

}
