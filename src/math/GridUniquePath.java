package math;

/*A robot is located at the top-left corner of an A x B grid
 *  (marked �Start� in the diagram below).

Path Sum: Example 1

The robot can only move either down or right at any point in time.
 The robot is trying to reach the bottom-right corner of the grid
  (marked �Finish� in the diagram below).

How many possible unique paths are there?

Note: A and B will be such that the resulting answer fits in a 32 
bit signed integer.

Example :

Input : A = 2, B = 2
Output : 2

2 possible routes : (0, 0) -> (0, 1) -> (1, 1) 
              OR  : (0, 0) -> (1, 0) -> (1, 1)
              
   */
public class GridUniquePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Rajesh :" + uniquePaths(3, 3));
	}

	public static int uniquePaths(int A, int B) {
		int[][] table = new int[A][B];
		for(int i=0; i<A; i++) table[i][0]=1;
		for(int j=0; j<B; j++) table[0][j]=1;
		for(int i=1; i<A; i++)
			for(int j=1; j<B; j++)
				table[i][j]=table[i-1][j]+table[i][j-1];
		return table[A-1][B-1];
	}

}
