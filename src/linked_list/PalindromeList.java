package linked_list;

import linked_list.ReorderList.ListNode;

public class PalindromeList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head;

		RemoveDuplicatesFromSortedList obj = new RemoveDuplicatesFromSortedList();
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(2);
		ListNode node5 = new ListNode(1);
		// ListNode node6 = new ListNode(6);

		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = null;
		// node6.next = null;
		head = node1;

		printLL(head);

		System.out.println("is pallindrome: " + lPalin(node1));
		//head = reverse(node1);

		printLL(head);
	}

	public static int lPalin(ListNode A) {
		int size = getSize(A);

		if (size == 1)
			return 1;
		else {
			int mid = size%2==0 ? (size/2)+1 : (size/2)+2;
			
			int pos=1;
			ListNode curr = A;
			while(pos < mid) {
				curr = curr.next;
				pos++;
			}
			ListNode reversed = reverse(curr);


			ListNode firstHalf = A;
			ListNode secondHalf = reversed;
			
			while(reversed != null  && firstHalf != null) {
				if(reversed.val != firstHalf.val) return 0;
				
				reversed = reversed.next;
				firstHalf = firstHalf.next;
			}
		}

		return 1;
	}
	
	public static ListNode reverse(ListNode A) {
		ListNode prev = null;
		ListNode curr = A;
		ListNode next = A.next;
		
		if(next == null) return A;
		
		while(next != null) {
			curr.next = prev;
			prev = curr;
			curr = next;
			next = curr.next;
		}
		curr.next = prev;
		return curr;
	}

	public static int getSize(ListNode A) {
		ListNode temp = A;
		int count = 0;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}

	public static void printLL(ListNode head) {
		ListNode itr = head;

		while (itr != null) {
			System.out.print(" " + itr.val);
			itr = itr.next;
		}
	}

	static class ListNode {
		public int val;
		public ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

}
