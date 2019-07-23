package string;

import java.util.ArrayList;
import java.util.Arrays;

/*Write a function to find the longest common prefix string 
 * amongst an array of strings.

Longest common prefix for a pair of strings S1 and S2 is the 
longest string S which is the prefix of both S1 and S2.

As an example, longest common prefix of "abcdefgh" and "abcefgh" is "abc".

Given the array of strings, you need to find the longest S which 
is the prefix of ALL the strings in the array.

Example:

Given the array as:

[

  "abcdefgh",

  "aefghijk",

  "abcefgh"
]
The answer would be “a”.
*/
public class LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String a[] = new String[] { "abcdefgh","aefghijk","abcefgh"};
		//String a[] = new String[] { "abcd" };
		String a[] = new String[] { "aaa", "aaaaa", "aa", "aaaaaa" };
		System.out.println("Hi RAJESH" + longestCommonPrefix(new ArrayList(Arrays.asList(a))));

	}

	public static String longestCommonPrefix(ArrayList<String> A) {
		StringBuilder lcp = new StringBuilder();
		if (A == null || A.size() == 0)
			return null;
		int char_index = 0;
		while (true) {
			if (A.get(0).length() - 1 < char_index)
				return lcp.toString();
			char ch = A.get(0).charAt(char_index);
			for (int i = 1; i < A.size(); i++) {
				if ((A.get(i).length() - 1 < char_index) || (A.get(i).charAt(char_index) != ch))
					return lcp.toString();
			}
			char_index++;
			lcp.append(ch);
		}

	}

}
