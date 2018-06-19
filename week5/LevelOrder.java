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
public class LevelOrder {
    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode A) {
        
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        if(A == null)
            return result;
        Queue<TreeNode> q = new LinkedList<>();
        int count = 1;
        int tempCount = 0;
        q.add(A);
        while(!q.isEmpty()){
            TreeNode node = q.remove();
            list.add(node.val);
            count--;
            
            if(node.left != null){
                tempCount++;
                q.add(node.left);
            }
            
            if(node.right != null){
                tempCount++;
                q.add(node.right);
            }
            
            if(count == 0){
                result.add(list);
                list = new ArrayList<>();
                count = tempCount;
                tempCount = 0;
            }
            
        }
        return result;
        
    }
}
