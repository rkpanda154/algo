package string;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*Given an input string, reverse the string word by word.

Example:

Given s = "the sky is blue",

return "blue is sky the".

A sequence of non-space characters constitutes a word.
Your reversed string should not contain leading or trailing spaces, 
even if it is present in the input string.
If there are multiple spaces between words, reduce them to a single
 space in the reversed string.
*/
public class ReverseSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Rajesh :" + reverseWords("race a car"));

	}

	public static String reverseWords(String a) {
		List<String> arr = Arrays.asList(a.split(" "));
		Collections.reverse(arr);
		StringBuilder builder= new StringBuilder();
		for(String str : arr) {
			builder.append(str.trim()).append(" ");
		}
		builder.setLength(builder.length()-1);
		return builder.toString();
	}

}
