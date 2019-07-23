package linked_list;

import java.util.TreeSet;

import linked_list.RemoveDuplicatesFromSortedList.ListNode;

public class RemoveDuplicatesFromSortedListII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head;

		ListNode node1 = new ListNode(0);
		ListNode node2 = new ListNode(0);
		ListNode node3 = new ListNode(0);
		ListNode node4 = new ListNode(0);
		ListNode node5 = new ListNode(0);
		ListNode node6 = new ListNode(0);
		ListNode node7 = new ListNode(0);
		ListNode node8 = new ListNode(0);

		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		node6.next = node7;
		node7.next = node8;
		node8.next = null;
		head = node1;

		printLL(head);

		head = deleteDuplicates(node1);
		System.out.println("");

		printLL(head);
	}

	public static ListNode deleteDuplicates(ListNode A) {
		ListNode curr = A;
		ListNode prev = null;
		ListNode head = null;
		while (curr != null) {
			if (curr.next != null && curr.val == curr.next.val) {
				while (curr.next != null && curr.val == curr.next.val) {
					ListNode toBeDeleted = curr.next;
					curr.next = curr.next.next;
					toBeDeleted = null;
				}
			} else {
				if (prev == null) {
					prev = curr;
					head = prev;
				} else {
					prev.next = curr;
					prev = curr;
				}
			}
			curr = curr.next;
		}
		
		if(prev != null) prev.next = null;
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
