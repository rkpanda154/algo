package string;

public class ATOI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi RAJESH" + atoi("-54332872018247709407"));

	}

	public static int atoi(final String A) {
		String B = A.trim();
		if ( B == null || B.length() == 0)
			return 0;
		

		boolean isNegative = B.charAt(0) == '-';
		long result = 0;
		for (int i = isNegative || B.charAt(0) == '+'  ? 1 : 0; i < B.length(); i++) {
			if (('0' <= B.charAt(i) && B.charAt(i) <= '9') || (i==0 && B.charAt(i) == ' ' && result == 0)) {
				result = result * 10 + B.charAt(i) - '0';
				if(result > Integer.MAX_VALUE) break;
			} else
				break;
		}

		if (!isNegative) {
			if (result < Integer.MAX_VALUE)
				return (int) result;
			else
				return Integer.MAX_VALUE;
		} else {
			result = -result;
			if (result > Integer.MIN_VALUE) {
				return (int) result;
			} else
				return Integer.MIN_VALUE;
		}
	}

}
