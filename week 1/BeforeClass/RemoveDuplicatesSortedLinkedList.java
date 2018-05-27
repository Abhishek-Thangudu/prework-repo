public class RemoveDuplicatesSortedLinkedList {
    public ListNode deleteDuplicates(ListNode A) {
        if(A == null || A.next == null)
            return A;
        ListNode curr = A.next;
        ListNode prev  = A;
        while(curr != null){
            if(curr.val == prev.val){
                prev.next = curr.next;
            }else {
                prev = prev.next;
            }
            curr = prev.next;
        }
        return A;
    }
}