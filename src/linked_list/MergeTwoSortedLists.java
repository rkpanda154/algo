package linked_list;

import linked_list.RemoveDuplicatesFromSortedList.ListNode;

public class MergeTwoSortedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head1;
		ListNode head2;
		
		ListNode node1 = new ListNode(5);
		ListNode node2 = new ListNode(8);
		ListNode node3 = new ListNode(20);
		
		ListNode node4 = new ListNode(5);
		ListNode node5 = new ListNode(11);
		ListNode node6 = new ListNode(15);

		node1.next = node2;
		node2.next = node3;
		node3.next = null;
		head1 = node1;
		printLL(head1);
		System.out.println("");
		
		node4.next = node5;
		node5.next = node6;
		node6.next = null;
		head2 = node4;
		printLL(head2);
		System.out.println("");
		

		ListNode head = mergeTwoLists(head1, head2);
		System.out.println("");

		printLL(head);
	}

	public static ListNode mergeTwoLists(ListNode A, ListNode B) {
		
		
/*		iterative approach*/
		
		
		ListNode head;
		ListNode curr;
		
		if(A == null) return B;
		if(B == null ) return A;
		
		if(A.val >= B.val) {
			head = B;
			B = B.next;
		}else {
			head = A;
			A = A.next;
		}
		curr = head;
		
		while(A!= null && B!= null) {
			if(A.val >= B.val) {
				curr.next = B;
				B = B.next;
			}else {
				curr.next = A;
				A = A.next;
			}
			curr = curr.next;
		}
		
		if(A == null) curr.next = B;
		if(B == null) curr.next = A;
		
		
		
/*	recuresive approach	*/
		
		
//		if(A.val > B.val) {
//			head = B;
//			head.next = (mergeTwoLists(A, B.next));
//		}else {
//			head = A;
//			head.next = (mergeTwoLists(A.next, B));
//		}
		
		return head;
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
