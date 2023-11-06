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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        if(root == null) {
            return list;
        }
        TreeNode node = root;
        st.push(node);
        while(!st.isEmpty()){
            TreeNode temp = st.pop();
            System.out.println(temp.val);
            list.add(temp.val);
            if(temp.left != null) {
                st.push(temp.left);
            }
            if(temp.right != null) {
                st.push(temp.right);
            }
        }
        Collections.reverse(list);
        return list;
    }
}