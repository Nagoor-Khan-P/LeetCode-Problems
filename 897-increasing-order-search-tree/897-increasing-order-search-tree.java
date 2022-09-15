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
    static List<Integer> list=new ArrayList<>(); 
    public TreeNode increasingBST(TreeNode root) {
        
        inOrder(root);
        System.out.println(list);
        TreeNode head=new TreeNode(list.get(0));
        TreeNode cur=head;
        int i=1;
        while(i<list.size()){
            cur.right=new TreeNode(list.get(i));
            cur=cur.right;
            i++;
        }
        list.removeAll(list);
        return head;
        
    }
    public static void inOrder(TreeNode root){
        if(root==null)
            return;
        inOrder(root.left);
        list.add(root.val);
        inOrder(root.right);
    }
}