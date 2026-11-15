/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {  
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
       if(subRoot == null) return true;
       if(root == null) return false;
       if(isSameTree(subRoot, root)) return true;
       return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    private boolean isSameTree(TreeNode r, TreeNode s){
        if( s == null && r == null) return true;
        if( s != null && r != null && s.val == r.val) 
          return isSameTree(s.left, r.left) && isSameTree(s.right, r.right);
        return false;
    }
}
