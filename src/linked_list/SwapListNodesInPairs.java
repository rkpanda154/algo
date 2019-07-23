package linked_list;

import linked_list.PalindromeList.ListNode;

public class SwapListNodesInPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head;

		RemoveDuplicatesFromSortedList obj = new RemoveDuplicatesFromSortedList();
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);
		 ListNode node6 = new ListNode(6);

		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		node6.next = null;
		head = node1;

		printLL(head);
		
		head = swapPairs(head);

		System.out.println("");
		//head = reverse(node1);

		printLL(head);
	}
	public static ListNode swapPairs(ListNode A) {
		ListNode prev = null;
		ListNode curr = A; 
		ListNode head = null;
		while(curr != null && curr.next != null) {
			if(head == null) head = curr.next;
			ListNode next_itr = curr.next.next;
			curr.next.next = curr;
			if(prev != null) prev.next= curr.next;
			curr.next = next_itr;
			prev = curr;
			curr = curr.next;
		}
		return head != null ? head : A;
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
