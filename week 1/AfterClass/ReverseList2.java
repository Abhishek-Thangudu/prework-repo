/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class ReverseList2 {
    public ListNode reverseBetween(ListNode A, int B, int C) {
        if(A == null || A.next == null || B == C)
            return A;
        
        if(B == 1){
            return reverseList(A, C - B);
        }
        int count = B;
        ListNode curr = A;
        while(count > 2){
            curr = curr.next;
            count--;
        }
        curr.next = reverseList(curr.next, C - B);
        return A;
    }
    
    private ListNode reverseList(ListNode head, int diff){
        ListNode prev = null;
        ListNode temp = null;
        ListNode curr = head;
        while(curr != null && diff >= 0){
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
            diff--;
        }
        head.next = temp;
        return prev;
    }
}
