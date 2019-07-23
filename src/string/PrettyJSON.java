package string;

import java.util.ArrayList;

public class PrettyJSON {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //ArrayList<String> ot =prettyJSON("{A:\"B\",C:{D:\"E\",F:{G:\"H\",I:\"J\"}}}");
		ArrayList<String> ot =prettyJSON("{\"attributes\":[{\"nm\":\"ACCOUNT\",\"lv\":[{\"v\":{\"Id\":null,\"State\":null},\"vt\":\"java.util.Map\",\"cn\":1}],\"vt\":\"java.util.Map\",\"status\":\"SUCCESS\",\"lmd\":13585},{\"nm\":\"PROFILE\",\"lv\":[{\"v\":{\"Party\":null,\"Ads\":null},\"vt\":\"java.util.Map\",\"cn\":2}],\"vt\":\"java.util.Map\",\"status\":\"SUCCESS\",\"lmd\":41962}]}");
		 for(int i=0; i< ot.size(); i++) {
			 System.out.println(ot.get(i));
		 }
		
	}

	public static ArrayList<String> prettyJSON(String A) {
		ArrayList<String> output = new ArrayList();
		formatJSON(output, 0, 0, A);
		return output;
	}

	public static void formatJSON(ArrayList<String> output, int noOfTab, int start, String A) {
		if (start == A.length())
			return;
		if (A.charAt(start) == '{' || A.charAt(start) == '[') {
			StringBuilder builder = new StringBuilder();
			for (int i = 0; i < noOfTab; i++)
				builder.append("\t");
			builder.append(A.charAt(start) + "");
			output.add(builder.toString());
			formatJSON(output, noOfTab + 1, start + 1, A);
		} else if (A.charAt(start) == '}' || A.charAt(start) == ']') {
			StringBuilder builder = new StringBuilder();
			for (int i = 0; i < noOfTab - 1; i++)
				builder.append("\t");
			builder.append(A.charAt(start) + "");
			if (start + 1 < A.length() && A.charAt(start + 1) == ',') {
				builder.append(A.charAt(start + 1) + "");
				start++;
			}
			start++;
			output.add(builder.toString());
			formatJSON(output, noOfTab-1, start, A);
		} else {
			StringBuilder builder = new StringBuilder();
			for (int i = 0; i < noOfTab; i++)
				builder.append("\t");
			
			while (A.charAt(start) != ',' && A.charAt(start) != '}' && A.charAt(start) != ']'
					&& A.charAt(start) != '{' && A.charAt(start) != '[') {
				builder.append(A.charAt(start));
				start++;
			}
			if (A.charAt(start) == ',') {
				builder.append(A.charAt(start));
				start++;
			}
			output.add(builder.toString());
			formatJSON(output, noOfTab, start, A);
		}
	}
}
