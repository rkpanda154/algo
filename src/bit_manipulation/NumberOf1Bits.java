package bit_manipulation;

public class NumberOf1Bits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi RAJESH" + numSetBits(11));
	}

	public static int numSetBits(long a) {
		int count=0;
		while(a != 0) {
			if((a&1) == 1) {
				count++;
			}
			a= a>>1;
		}
		return count;
	}

}
