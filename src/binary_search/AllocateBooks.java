package binary_search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*N number of books are given. 
The ith book has Pi number of pages. 
You have to allocate books to M number of students so that maximum number 
of pages alloted to a student is minimum. A book will be allocated 
to exactly one student. 
Each student has to be allocated at least one book. Allotment should be 
in contiguous order, for example: A student cannot be allocated
 book 1 and book 3, skipping book 2.

NOTE: Return -1 if a valid assignment is not possible

Input:

List of Books
M number of students
Your function should return an integer corresponding to the minimum number.

Example:

P : [12, 34, 67, 90]
M : 2

Output : 113

There are 2 number of students. Books can be distributed in following fashion : 
  1) [12] and [34, 67, 90]
      Max number of pages is allocated to student 2 with 34 + 67 + 90 = 191 pages
  2) [12, 34] and [67, 90]
      Max number of pages is allocated to student 2 with 67 + 90 = 157 pages 
  3) [12, 34, 67] and [90]
      Max number of pages is allocated to student 1 with 12 + 34 + 67 = 113 pages

Of the 3 cases, Option 3 has the minimum pages = 113. 
*/

public class AllocateBooks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer b[] = new Integer[] { 12, 34, 66, 90 };
		System.out.println("Hi RAJESH" + books(new ArrayList(Arrays.asList(b)), 2));

	}

	public static int books(ArrayList<Integer> A, int B) {
		long no_of_books = A.size();
		if (no_of_books < B)
			return -1;

		long num_pages = 0;
		for (int i = 0; i < A.size(); i++)
			num_pages += A.get(i);

		long start = 0;
		long end = num_pages;
		long page_result = Integer.MAX_VALUE;
		while (start <= end) {
			long mid = (start + end) / 2;
			if (isPossible(A, B, mid)) {

				page_result = Math.min(page_result, mid);
				end = mid - 1;

			} else {
				start = mid + 1;
			}
		}
		return (int)page_result;
	}

	public static boolean isPossible(ArrayList<Integer> A, long B, long mid) {
		long count_stu = 1;
		long sum = 0;

		for (int i = 0; i < A.size(); i++) {
			if (A.get(i) > mid)
				return false;
			if (sum + A.get(i) > mid) {
				sum = A.get(i);
				count_stu++;
				if (count_stu > B)
					return false;
			} else {
				sum += A.get(i);
			}
		}
		return true;
	}

}
