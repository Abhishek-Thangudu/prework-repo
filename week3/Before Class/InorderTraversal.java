/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class InorderTraversal {
    
    public ArrayList<Integer> inorderTraversal(TreeNode A) {
        ArrayList<Integer> list = new ArrayList<>();
        if(A == null){
            return list;   
        }
        inorderTraversalImpl(A, list);
        return list;
    }
    
    private void inorderTraversalImpl(TreeNode A, ArrayList<Integer> list){
        if(A == null)
            return;
        inorderTraversalImpl(A.left, list);
        list.add(A.val);
        inorderTraversalImpl(A.right, list);
    }
}
