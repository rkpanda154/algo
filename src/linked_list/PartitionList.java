package linked_list;

import linked_list.PalindromeList.ListNode;

public class PartitionList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head;

		RemoveDuplicatesFromSortedList obj = new RemoveDuplicatesFromSortedList();
		ListNode node1 = new ListNode(18);
		ListNode node2 = new ListNode(200);
		ListNode node3 = new ListNode(300);
		ListNode node4 = new ListNode(7);
		ListNode node5 = new ListNode(500);
		ListNode node6 = new ListNode(12);

		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		node6.next = null;
		head = node1;

		printLL(head);
		head = partition(node1, 34);

		System.out.println("");
		// head = reverse(node1);

		printLL(head);
	}

	public static ListNode partition(ListNode A, int B) {
		ListNode curr_small = null;
		ListNode curr = A;
		ListNode prev = null;
		ListNode head = null;

		while (curr != null) {
			if (curr.val < B) {
				// no need to swap the pointer in below case
				if(curr_small != null && curr_small.next ==  curr) {
					curr_small.next = curr;
					curr_small = curr;
					curr = curr.next;
					continue;
				}
				if (prev != null) {
					prev.next = curr.next;

					if (curr_small != null) {
						curr.next = curr_small.next;
						curr_small.next = curr;
						curr_small = curr;
					} else {
						curr_small = curr;
						head = curr_small;
						curr_small.next = A;
					}

				} else {
					head = curr;
					prev = curr;
					curr_small = curr;
				}
				curr = prev.next;
			} else {
				prev = curr;
				curr = curr.next;
			}
		}
		return head== null ? A : head;
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
