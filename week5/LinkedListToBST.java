/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class LinkedListToBST {
    public ListNode head = null;
    public TreeNode sortedListToBST(ListNode a) {
        head = a;
    int numOfNodes = countNodes(head);
    
    return constructBST(numOfNodes);
    }
    
    private TreeNode constructBST(int num){
    
    if(num <=0) {
      return null;
    }  
  
    TreeNode left = constructBST(num/2);
    
    TreeNode root = new TreeNode(head.val);
    
    root.left = left;
    
    head = head.next;
    
    root.right = constructBST(num-num/2-1);
    
    return root;
    
  }
 
  private int countNodes(ListNode head){
    int count =0;
    ListNode cur = head;
    
    while (cur != null){
      cur = cur.next;
      count++;
    }
    return count;
    }
}
