package linked_list;

import linked_list.RemoveDuplicatesFromSortedList.ListNode;

public class RemoveNthNodeFromListEnd {

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

		head = removeNthFromEnd(node1,4);
		System.out.println("");

		printLL(head);
	}

	public static ListNode removeNthFromEnd(ListNode A, int B) {
		ListNode temp = A;
		if(B<=0) return A;
		
		int size = getSize(A);
		
		if(B >= size) {
			return A.next;
		}else {
			ListNode node1 = A;
			
			int index =1;
			while(index < size-B) {
				node1 = node1.next;
				index++;
			}

			node1.next = node1.next.next;
		}
		
		return A;
	}
	
	public static int getSize(ListNode A) {
		ListNode temp = A;
		int count =0;
		while(temp != null) {
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
