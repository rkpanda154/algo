package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeMap;

/*The count-and-say sequence is the sequence of integers beginning as follows:

1, 11, 21, 1211, 111221, ...
1 is read off as one 1 or 11.
11 is read off as two 1s or 21.

21 is read off as one 2, then one 1 or 1211.

Given an integer n, generate the nth sequence.

Note: The sequence of integers will be represented as a string.

Example:

if n = 2,
the sequence is 11.
*/
public class CountAndSay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi RAJESH" + countAndSay(4));

	}
	public static String countAndSay(int A) {
		StringBuilder builder = new StringBuilder("1");
		for(int i=1; i<A; i++) {
			char curr_char ;
			char prev_char = ' ';
			int count =0;
			StringBuilder temp =new StringBuilder();
			for(int j=0; j<builder.length();j++) {
				curr_char = builder.charAt(j);
				if(prev_char == ' ' || prev_char == curr_char) {
					prev_char = curr_char;
					count++;
				}else {
					temp.append(count).append(prev_char);
					prev_char = curr_char;
					count=1;
				}
			}
			temp.append(count).append(prev_char);
			builder = temp;
		}
		return builder.toString();
    }

}
