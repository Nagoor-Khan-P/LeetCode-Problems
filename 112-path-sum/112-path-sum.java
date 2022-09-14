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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return isPath(root, targetSum, 0);
    }
    public static boolean isPath(TreeNode root, int targetSum, int sum){
        if(root==null)
            return false;
        if(root.left==null && root.right==null)
            return (sum+root.val)==targetSum;
        return isPath(root.left,targetSum,sum+root.val) || isPath(root.right,targetSum,sum+root.val);
    }
}