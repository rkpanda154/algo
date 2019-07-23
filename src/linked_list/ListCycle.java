package linked_list;

import linked_list.AddTwoNumbersAsLists.ListNode;

public class ListCycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head1;

		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);
		// ListNode node6 = new ListNode(6);

		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node3;
		// node6.next = null;
		head1 = node1;

		ListNode start_cycle = detectCycle(head1);

		System.out.println("" + start_cycle.val);

	}

	public static ListNode detectCycle(ListNode a) {
		if(a== null) return null;
		ListNode slow_ptr= a.next;
		ListNode fast_ptr= a.next.next;
		
		while(fast_ptr != null && fast_ptr.next != null && fast_ptr != slow_ptr) {
			fast_ptr = fast_ptr.next.next;
			slow_ptr = slow_ptr.next;
		}
		if(fast_ptr == null || fast_ptr.next == null) return null;
		else {
			slow_ptr = a;
			
			while(slow_ptr != fast_ptr) {
				fast_ptr = fast_ptr.next;
				slow_ptr = slow_ptr.next;
			}
			return slow_ptr;
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
