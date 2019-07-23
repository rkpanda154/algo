package linked_list;

import linked_list.PalindromeList.ListNode;

public class InsertionSortList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head;

		RemoveDuplicatesFromSortedList obj = new RemoveDuplicatesFromSortedList();
		ListNode node1 = new ListNode(3);
		ListNode node2 = new ListNode(4);
		ListNode node3 = new ListNode(5);
		ListNode node4 = new ListNode(6);
		ListNode node5 = new ListNode(7);
		// ListNode node6 = new ListNode(6);

		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = null;
		// node6.next = null;
		head = node1;

		printLL(head);
		head = insertionSortList(head);
		System.out.println("");
		// head = reverse(node1);

		printLL(head);
	}

	public static ListNode insertionSortList(ListNode A) {
		ListNode curr = A.next;
		ListNode prev = A;
		ListNode head = A;

		while (curr != null) {
			if (curr.val >= prev.val) {
				prev = curr;
				curr = curr.next;
				continue;
			} else {
				ListNode start = head;
				if (curr.val < start.val) {
					prev.next = curr.next;
					curr.next = start;
					head = curr;
					curr = prev.next;
				} else {
					while (start.next.val <= curr.val) {
						start = start.next;
						continue;
					}
					prev.next = curr.next;
					curr.next = start.next;
					start.next = curr;
					curr = prev.next;
				}
			}
		}
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
