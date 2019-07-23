package linked_list;

public class RemoveDuplicatesFromSortedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head;

		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(1);
		ListNode node3 = new ListNode(1);
		ListNode node4 = new ListNode(3);
		ListNode node5 = new ListNode(3);

		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = null;
		head = node1;

		printLL(head);

		head = deleteDuplicates(node1);
		System.out.println("");

		printLL(head);
	}

	public static ListNode deleteDuplicates(ListNode A) {
		ListNode itr = A;
		while (itr.next != null) {
			if (itr.val == itr.next.val) {
				ListNode toBeDeleted = itr.next;
				itr.next = itr.next.next;
				toBeDeleted = null;
			} else {
				itr = itr.next;
			}
		}
		return A;
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
