package bit_manipulation;

public class ReverseBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi RAJESH" + reverse(3));
	}

	public static long reverse(long a) {
		long rev=0;
		int i=32;
		while(i != 0) {
			rev = rev <<1;
			if((a & 1) == 1) rev = rev ^ 1;
			a= a>>1;
			i--;
		}
		return rev;
	}
}
