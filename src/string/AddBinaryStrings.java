package string;

public class AddBinaryStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi RAJESH" + addBinary("1001101100101110001010101011111111011110", "10101100000000001010011001011010010000011101110001011101001001111110110101101001101010010"));
	}

	public static String addBinary(String A, String B) {
		StringBuilder result = new StringBuilder();
		if (A.equals("0") && B.equals("0")) {
			return "0";
		} else if (A.equals("0") && B.equals("1")) {
			return "1";
		} else if (A.equals("1") && B.equals("0")) {
			return "1";
		} else if (A.equals("1") && B.equals("1")) {
			return "10";
		} else {
			int i = 0;
			int j = 0;

			String added = null;
			String carry = "";

			while (i < A.length() && j < B.length()) {
				added = addBinary(A.substring(A.length() - i - 1, A.length() - i),
						B.substring(B.length() - j - 1, B.length() - j));
				if (!carry.equals(""))
					added = addBinary(added, carry);
				if (added.length() > 1)
					carry = "1";
				else
					carry = "";

				result.append(added.charAt(added.length() - 1));
				i++;
				j++;
			}

			if (i != A.length()) {
				while (i < A.length()) {

					if (!carry.equals("")) {
						added = addBinary(A.substring(A.length() - i - 1, A.length() - i), carry);
						if (added.length() > 1)
							carry = "1";
						else
							carry = "";
						result.append(added.charAt(added.length() - 1));
					} else {
						result.append(A.substring(A.length() - i - 1, A.length() - i));
					}
					i++;
				}
			} else {
				while (j < B.length()) {
					if (!carry.equals("")) {
						added = addBinary(B.substring(B.length() - j - 1, B.length() - j), carry);
						if (added.length() > 1)
							carry = "1";
						else
							carry = "";
						result.append(added.charAt(added.length() - 1));
					} else {
						result.append(B.substring(B.length() - j - 1, B.length() - j));
					}
					j++;
				}
			}

			result.append(carry);
		}
		return result.reverse().toString();
	}

}
