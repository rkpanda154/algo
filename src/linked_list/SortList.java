package linked_list;

import linked_list.MergeTwoSortedLists.ListNode;

public class SortList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public ListNode sortList(ListNode A) {
        if (A == null || A.next == null) return A; 
  
        ListNode middle = getMiddle(A); 
        ListNode nextofmiddle = middle.next; 
  
        middle.next = null; 
  
        ListNode left = sortList(A); 
        ListNode right = sortList(nextofmiddle); 
  
        ListNode sortedlist = sortedMerge(left, right); 
        return sortedlist; 
    }
	public static ListNode getMiddle(ListNode h)  
    { 
        if (h == null) 
            return h; 
        ListNode fastptr = h.next; 
        ListNode slowptr = h; 

        while (fastptr != null) 
        { 
            fastptr = fastptr.next; 
            if(fastptr!=null) 
            { 
                slowptr = slowptr.next; 
                fastptr=fastptr.next; 
            } 
        } 
        return slowptr; 
    } 
	
	public static ListNode sortedMerge(ListNode A, ListNode B)  
    { 
		ListNode head;
		ListNode curr;
		
		if(A == null) return B;
		if(B == null ) return A;
		
		if(A.val >= B.val) {
			head = B;
			B = B.next;
		}else {
			head = A;
			A = A.next;
		}
		curr = head;
		
		while(A!= null && B!= null) {
			if(A.val >= B.val) {
				curr.next = B;
				B = B.next;
			}else {
				curr.next = A;
				A = A.next;
			}
			curr = curr.next;
		}
		
		if(A == null) curr.next = B;
		if(B == null) curr.next = A;
		
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
