/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class DetectCycle {
	public ListNode detectCycle(ListNode a) {
	    ListNode curr1 = a;
	    ListNode curr2 = a;
	    while(curr2 != null && curr2.next != null){
	        curr1 = curr1.next;
	        curr2 = curr2.next.next;
	        if(curr1 == curr2)
	            break;
	    }
	    if(curr2 == null || curr2.next == null){
	        return null;
	    }
	    curr2 = a;
	    while(curr1 != curr2){
	        curr1 = curr1.next;
	        curr2 = curr2.next;
	    }
	    return curr1;
	}
}