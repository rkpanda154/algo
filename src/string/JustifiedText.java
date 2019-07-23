package string;

import java.util.ArrayList;
import java.util.Arrays;

public class JustifiedText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String b[] = new String[] { "This", "is", "an", "example", "of", "text", "justification." };
		String b[] = new String[] {"lkgyyrqh", "qrdqusnh", "zyu", "w", "ukzxyykeh", "zmfqafqle", "e", "ajq", "kagjss", "mihiqla", "qekf", "ipxbpz", "opsndtyu", "x", "ec", "cbd", "zz", "yzgx", "qbzaffgf", "i", "atstkrdph", "jgx", "qiy", "jeythmm", "qgqvyz", "dfagnfpwat", "sigxajhjt", "zx", "hwmcgss"};
		System.out.println("Hi RAJESH" + fullJustify(new ArrayList(Arrays.asList(b)), 178));

	}

	public static ArrayList<String> fullJustify(ArrayList<String> A, int B) {
		ArrayList<String> output = new ArrayList();
		
		if(A.size()==0) {
			output.add("");
			return output;
		}

		int count;
		ArrayList<String> temp = new ArrayList();
		count = 0;
		for (int i = 0; i < A.size(); i++) {
			if (A.get(i).length() + count > B) {
				int totalTextLength = 0;
				for (int q = 0; q < temp.size(); q++) {
					totalTextLength += temp.get(q).length();
				}
				int noOfSpace = temp.size()==1? (B - totalTextLength) : (B - totalTextLength) / (temp.size() - 1);
				int remSpace = temp.size()==1? 0: (B - totalTextLength) % (temp.size() - 1);

				StringBuilder builder = new StringBuilder();
				for (int j = 0; j < temp.size(); j++) {
					builder.append(temp.get(j));
					if(temp.size()==1) {
						for (int k = 0; k < noOfSpace; k++) {
							builder.append(" ");
						}
					}
					else if (j < temp.size() - 1) {
						for (int k = 0; k < noOfSpace; k++) {
							builder.append(" ");
						}
						if (remSpace > 0) {
							builder.append(" ");
							remSpace--;
						}
					}
					
				}
				output.add(builder.toString());
				temp = new ArrayList();
				count = 0;
			}
			temp.add(A.get(i));
			count = count + A.get(i).length() + 1;

		}
		StringBuilder builder = new StringBuilder();
		for (int j = 0; j < temp.size(); j++) {
			builder.append(temp.get(j)).append(" ");
		}
		builder.setLength(builder.length()-1);
		output.add(builder.toString());

		return output;
	}
}
