package math;

/*Given a positive integer, return its corresponding column 
 * title as appear in an Excel sheet.

For example:

    1 -> A
    2 -> B
    3 -> C
    ...
    26 -> Z
    27 -> AA
    28 -> AB 
    */
public class FindColumnTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Rajesh :" + convertToTitle(943566));
	}

	public static String convertToTitle(int A) {
		StringBuilder word = new StringBuilder();
		while (A != 0) {
			int remain = A % 26;
			if (remain == 0) {
				word.insert(0, 'Z');
				A = (A / 26)-1;
			} else {
				char let = (char) (('A' + remain) - 1);
				word.insert(0, let);
				A = A / 26;
			}
		}
		return word.toString();
	}

}
