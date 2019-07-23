package math;

import java.util.ArrayList;

/*Given a positive integer A, return an array of strings with all
 *  the integers from 1 to N. 
But for multiples of 3 the array should have “Fizz” instead of the number. 
For the multiples of 5, the array should have “Buzz” instead of the number. 
For numbers which are multiple of 3 and 5 both, the array should have 
“FizzBuzz” instead of the number.

Look at the example for more details.

Example

A = 5
Return: [1 2 Fizz 4 Buzz]*/
		
public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Rajesh :" + fizzBuzz(20));
	}
	 public static ArrayList<String> fizzBuzz(int A) {
		 ArrayList<String> output = new ArrayList<>();
		 for(int i=1; i<=A; i++) {
			 boolean d3 = i%3==0;
			 boolean d5 = i%5==0;
			 
			 if(d3 && d5) output.add("FizzBuzz");
			 else if(d3) output.add("Fizz");
			 else if(d5) output.add("Buzz");
			 else output.add(i+"");
		 }
		 return output;
	 }

}
