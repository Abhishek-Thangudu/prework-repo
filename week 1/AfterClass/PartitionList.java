/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class PartitionList {
    public ListNode partition(ListNode A, int B) {
        ListNode smallHead = new ListNode(-1);
        ListNode bigHead = new ListNode(-1);
        ListNode small = smallHead;
        ListNode big = bigHead;
        ListNode curr = A;
        while(curr != null){
            if(curr.val < B){
                small.next = curr;
                small = small.next;
            }else {
                big.next = curr;
                big = big.next;
            }
            curr = curr.next;
        }
        small.next = bigHead.next;
        big.next = null;
        return smallHead.next;
    }
}
