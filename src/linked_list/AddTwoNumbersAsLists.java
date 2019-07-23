package linked_list;

import linked_list.KReverseLinkedList.ListNode;

public class AddTwoNumbersAsLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head1;

		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(0);
		ListNode node5 = new ListNode(0);
		// ListNode node6 = new ListNode(6);

		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = null;
		// node6.next = null;
		head1 = node1;

		ListNode head11;

		ListNode node11 = new ListNode(1);
		ListNode node21 = new ListNode(2);
		ListNode node31 = new ListNode(3);

		node11.next = node21;
		node21.next = node31;
		node31.next = null;

		// node6.next = null;
		head11 = node11;

		printLL(head1);
		System.out.println("");
		printLL(head11);

		ListNode added = addTwoNumbers(head1, head11);

		System.out.println("Result ");
		printLL(added);
		// head = reverse(node1);
	}

	public static ListNode addTwoNumbers(ListNode A, ListNode B) {
		ListNode head =null;
		ListNode curr =head;
		int carry =0;
		
		ListNode head1 = A;
		ListNode head2 = B;
		
		while (head1 != null && head2 != null) {
			int sum = head1.val + head2.val + carry;
			int rem = sum%10;
			carry = sum /10;
			
			ListNode node = new ListNode(rem);
			if(head == null) {
				head = node;
				curr = head;
			}
			else {
				curr.next = node;
				curr= curr.next;
			}
			head1 = head1.next;
			head2 = head2.next;
		}
		
		if(head1 == null) {
			while (head2 != null) {
				int sum = head2.val + carry;
				int rem = sum%10;
				carry = sum /10;
				
				ListNode node = new ListNode(rem);
				if(head == null) {
					head = node;
					curr = head;
				}
				else {
					curr.next = node;
					curr= curr.next;
				}
				head2 = head2.next;
			}
		}
		
		if(head2 == null) {
			while (head1 != null) {
				int sum = head1.val + carry;
				int rem = sum%10;
				carry = sum /10;
				
				ListNode node = new ListNode(rem);
				if(head == null) {
					head = node;
					curr = head;
				}
				else {
					curr.next = node;
					curr= curr.next;
				}
				head1 = head1.next;
			}
		}
		
		if(carry != 0) {
			ListNode node = new ListNode(carry);
			if(head == null) {
				head = node;
				curr = head;
			}
			else {
				curr.next = node;
			}
		}
		
		curr = head;
		ListNode prev_non_zero = curr;
		while(curr != null) {
			if(curr.val != 0) {
				prev_non_zero =  curr;
			}
			curr = curr.next;
		}
		prev_non_zero.next = null;
		
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
