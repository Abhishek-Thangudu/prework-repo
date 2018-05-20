public class AddTwoNumbersLists {
    public ListNode addTwoNumbers(ListNode A, ListNode B) {
        ListNode result  = new ListNode(-1);
        ListNode curr = result;
        int carry = 0;
        while(A != null && B != null){
            int sum = A.val + B.val + carry;
            curr.next = new ListNode(sum % 10);
            carry = sum / 10;
            A = A.next;
            B = B.next;
            curr = curr.next;
        }
        while(A != null){
            int sum = A.val + carry;
            curr.next = new ListNode(sum % 10);
            carry = sum / 10;
            A = A.next;
            curr = curr.next;
        }
        while(B != null){
            int sum = B.val + carry;
            curr.next = new ListNode(sum % 10);
            carry = sum / 10;
            B = B.next;
            curr = curr.next;
        }
        return result.next;
    }
}