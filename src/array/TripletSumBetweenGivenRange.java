package array;


/*Given an array of real numbers greater than zero in form of strings.
Find if there exists a triplet (a,b,c) such that 1 < a+b+c < 2 . 
Return 1 for true or 0 for false.

Example:

Given [0.6, 0.7, 0.8, 1.2, 0.4] ,

You should return 1

as

0.6+0.7+0.4=1.7

1<1.7<2

Hence, the output is 1.

O(n) solution is expected.
*/

import java.util.ArrayList;
import java.util.Arrays;

public class TripletSumBetweenGivenRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a[] = new String[] { "0.1","0.6","1.4","0.2","0.12" };
		System.out.println("Hi RAJESH" + solve(new ArrayList(Arrays.asList(a))));

	}
	
	public static int solve(ArrayList<String> A) {
        int n = A.size();
        double[] arr = new double[n];
        for(int i=0; i<n; i++) {
            arr[i] = Double.valueOf(A.get(i));
        }
        double a=arr[0], b=arr[1], c=arr[2];
        for(int i=3 ; i<n ; i++){
            // check if sum fall in (1, 2)
            if(a+b+c > 1 && a+b+c < 2){
                return 1;
            }
            // if not, then check is sum greater than 2
            // if so, then replece MAX(a,b,c) to new number
            else if(a+b+c > 2){
                if(a>b && a>c){
                    a = arr[i];
                }
                else if(b>a && b>c){
                    b = arr[i];
                }
                else if(c>a && c>b){
                    c = arr[i];
                }
            }
            // else then sum must be less than 1
            // then replace MIN(a,b,c) to new number
            else{
                if(a<b && a<c){
                    a = arr[i];
                }
                else if(b<a && b<c){
                    b = arr[i];
                }
                else if(c<a && c<b){
                    c = arr[i];
                }
            }
        }
        // check for last a, b, c  triplet
        if(a+b+c > 1 && a+b+c < 2){
            return 1;
        }
        else{
            return 0;
        }
    }

}
