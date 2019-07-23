package binary_search;

/*Implement int sqrt(int x).

Compute and return the square root of x.

If x is not a perfect square, return floor(sqrt(x))

Example :

Input : 11
Output : 3
*/
public class SquareRootOfInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Rajesh :" + sqrt(2147483647));

	}
	public static int sqrt(int a) {
//		long sq_result=1;
//		int value=1;
//		
//		if(a ==0 || a==1) return a;
//		
//		while(sq_result <= a) {
//			value++;
//			sq_result = value * value;
//		}
//		
//		return value-1;
		
		if (a == 0 || a == 1) 
            return a; 
  
        int start = 1, end = a, ans=0; 
        while (start <= end) 
        { 
            int mid = (start + end) / 2; 
  
            if (mid*mid == a) 
                return mid; 
            if (mid*mid < a) 
            { 
                start = mid + 1; 
                ans = mid; 
            } 
            else
                end = mid-1; 
        } 
        return ans; 
    }
}
