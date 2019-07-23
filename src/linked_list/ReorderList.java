package linked_list;

import linked_list.ReverseLinkListII.ListNode;

public class ReorderList {

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

		head = reorderList(node1);
		System.out.println("");

		printLL(head);
	}
	public static ListNode reorderList(ListNode A) {
		if(A == null) return null;
		
		ListNode curr = A;
		ListNode next = A.next;
		while(next !=null) {
			ListNode lastNode = getLastnode(next);
			curr.next = lastNode;
			if(next != lastNode)lastNode.next = next;
			
			curr = next;
			next = curr.next;
		}
		
		return A;
    }
	
	public static ListNode getLastnode(ListNode A) {
		if(A.next == null) return A;
		
		ListNode prev = A;
		ListNode curr = A.next;
		
		while(curr.next != null) {
			prev = curr;
			curr =curr.next;
		}
		prev.next = null;
		return curr;
	}
	
//	public static ListNode reorderList(ListNode A) {
//		if(A == null) return null;
//		ListNode lastNode = getLastnode(A);
//		ListNode reorderNode = reorderList(A.next);
//		A.next=lastNode;
//		lastNode.next = reorderNode;
//		
//		return A;
//    }
//	
//	public static ListNode getLastnode(ListNode A) {
//		if(A.next == null) return A;
//		
//		ListNode prev = A;
//		ListNode curr = A.next;
//		
//		while(curr.next != null) {
//			prev = curr;
//			curr =curr.next;
//		}
//		prev.next = null;
//		return curr;
//	}

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
