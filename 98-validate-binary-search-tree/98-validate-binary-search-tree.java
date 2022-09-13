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
    static ArrayList<Integer> list=new ArrayList<>();
    public boolean isValidBST(TreeNode root) {
        return isValid(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    public static boolean isValid(TreeNode root, long startRange, long endRange){
        if(root == null)
            return true;
        if(root.val<=startRange || root.val>=endRange){
            return false;
        }
        
        return isValid(root.left,startRange,root.val) && isValid(root.right,root.val,endRange);
    }
}