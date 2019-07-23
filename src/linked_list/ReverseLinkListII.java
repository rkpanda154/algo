package linked_list;

import linked_list.RotateList.ListNode;

public class ReverseLinkListII {

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

		head = reverseBetween(node1, 2,4);
		System.out.println("");

		printLL(head);
	}

	public static ListNode reverseBetween(ListNode A, int B, int C) {
		ListNode prev = null;
		ListNode next = null;
		ListNode curr = A;

		for (int i = 1; i < B; i++) {
			prev = curr;
			curr = curr.next;
		}

		ListNode r_lastnode = curr;
		curr = curr.next;
		ListNode itr_prev = r_lastnode;

		for (int i = 0; i < C - B; i++) {
			next = curr.next;
			curr.next = itr_prev;
			itr_prev = curr;
			curr = next;
		}
		if (prev != null) {
			prev.next = itr_prev;
			r_lastnode.next = curr;
			return A;
		} else {
			r_lastnode.next = curr;
			return itr_prev;
		}

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
