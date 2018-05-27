/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class InsertionSortList/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
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
 {
    public ListNode insertionSortList(ListNode A) {
        if(A == null || A.next == null)
            return A;
        ListNode curr = A.next;
        ListNode prev = A;
        while(curr != null){
            if(curr.val >= prev.val){
                curr = curr.next;
                prev = prev.next;
            }else {
                ListNode temp = curr.next;
                if(curr.val <= A.val){
                    curr.next = A;
                    A = curr;
                }else {
                    ListNode curr2 = A;
                    while(curr.val > curr2.next.val){
                        curr2 = curr2.next;
                    }
                    curr.next = curr2.next;
                    curr2.next = curr;
                }
                curr = temp;
            }
        }
        return A;
    }
}
