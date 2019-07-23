package math;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
/*
Given a string, find the rank of the string amongst its permutations 
sorted lexicographically. 
Note that the characters might be repeated. If the characters are repeated,
we need to look at the rank in unique permutations. 
Look at the example for more details.

Example :

Input : 'aba'
Output : 2

The order permutations with letters 'a', 'a', and 'b' : 
aab
aba
baa
The answer might not fit in an integer, so return your answer % 1000003*/
		
public class SortedPermutationRankWithRepeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Rajesh :" + findRank("sadasdsasassasas"));
	}
	
	 public static long findRank(String A) {
		 long rank=1;
		 long fact = fact(A.length());
		 for(int i=0; i<A.length(); i++) {
			 fact = fact/(A.length()-i);
			 long smalChar =  noOfSmallerChar(A, i);
			 long repeMul = factOfRepetitiveChar(noOfRepetativeChar(A, i));
			 rank += smalChar*fact/repeMul;
		 }
		 return rank % 1000003;
	 }
	 
	 public static long factOfRepetitiveChar(List<Integer> values) {
		 long result =1;
		 for(int i=0; i<values.size(); i++) {
			 result *= fact(values.get(i));
		 }
		 return result;
	 }
	 
	 public static long noOfSmallerChar(String A, int start) {
		 long result =0;
		 char let= A.charAt(start);
		 
		 for(int i=start+1; i<A.length(); i++) {
			 if(let > A.charAt(i)) result++;
		 }
		 return result;
	 }
	 
	 public static List<Integer> noOfRepetativeChar(String A, int start) {
		 Map<Character, Integer> map= new HashMap<>();
		 char let= A.charAt(start);
		 
		 for(int i=start; i<A.length(); i++) {
			 Character ch= A.charAt(i);
			 if(map.containsKey(ch)) map.put(ch, (map.get(ch))+1);
			 else map.put(ch,  1);
		 }
		 List<Integer> values = (List<Integer>) map.values()
				 .stream()
				 .filter(v -> v>1)
				 .collect(Collectors.toList());
		 
		 
		 return values;
	 }
	 
	 public static long fact(long num) {
		 if(num <=1) return 1;
		 return num * fact(num-1);
	 }

}
