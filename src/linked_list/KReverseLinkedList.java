package linked_list;

import linked_list.SwapListNodesInPairs.ListNode;

public class KReverseLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head;

		RemoveDuplicatesFromSortedList obj = new RemoveDuplicatesFromSortedList();
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);
		//ListNode node6 = new ListNode(6);

		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = null;
		//node6.next = null;
		head = node1;

		printLL(head);

		head = reverseList(head, 3);

		System.out.println("");
		// head = reverse(node1);

		printLL(head);
	}

	public static ListNode reverseList(ListNode A, int B) {
		int size = getSize(A);
		int start =1;
		int end =Math.min(start+B-1, size);
		ListNode head = null;
		ListNode curr = A;
		ListNode prev = null;
		int count =0;
		
		
		
		while (curr != null) {
			count = count+B;
			if(count <= size) end = start+B-1;
			else {
				end = size - count;
			}
			ListNode temp = reverseBetween(curr, 1,end);
			if(head == null) head= temp;
			if(prev != null) prev.next = temp;
			prev = curr;
			curr = curr.next;
		}
		
		
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
