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
    String str="";
    public String tree2str(TreeNode root) {
        pass(root);
        return str;
    }
    public void pass(TreeNode root){
        if(root.left==null && root.right==null){
            str+=root.val;
            return;
        }
        str+=root.val;
        if(root.left!=null){
            str+="(";
            pass(root.left);
            str+=")";
        }
        if(root.left==null && root.right!=null){
            str+="()";
        }
        if(root.right!=null){
            str+="(";
            pass(root.right);
            str+=")";
        }
    }
}