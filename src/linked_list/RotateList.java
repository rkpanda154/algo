package linked_list;

import linked_list.RemoveNthNodeFromListEnd.ListNode;

public class RotateList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head;

		RemoveDuplicatesFromSortedList obj = new RemoveDuplicatesFromSortedList();
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);

		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = null;
		head = node1;

		printLL(head);

		head = rotateRight(node1, 2);
		System.out.println("");

		printLL(head);
	}

	public static ListNode rotateRight(ListNode A, int B) {
		B = B % getSize(A);
		ListNode fwd = A;
		ListNode bwd =A;
		
		for(int i=0; i< B; i++) {
			fwd = fwd.next;
		}
		while(fwd.next != null) {
			fwd = fwd.next;
			bwd = bwd.next;
		}
		
		fwd.next = A;
		ListNode head = bwd.next;
		bwd.next = null;
		
		
		return head;
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
