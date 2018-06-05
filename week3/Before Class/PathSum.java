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
public class PathSum {
    public int hasPathSum(TreeNode A, int B) {
        if(A == null)
            return 0;
        boolean flag = checkSum(A, B);
        if(flag)
            return 1;
        else
            return 0;
    }
    
    private boolean checkSum(TreeNode A, int B){
        if(A == null || A.val > B)
            return false;
        if(A.val == B && A.left == null && A.right == null)
            return true;
        boolean left = checkSum(A.left, B - A.val);
        boolean right = checkSum(A.right, B - A.val);
        return left || right;
    }
}
