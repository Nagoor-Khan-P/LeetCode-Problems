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
    public int maxDepth(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        if(root==null)
            return 0;
        queue.add(root);
        int ans=1;
        while(!queue.isEmpty()){
            int qsize=queue.size();
            for(int i=0;i<qsize;i++){
                TreeNode cur = queue.poll();
                if(cur.left!=null){
                    queue.add(cur.left);
                }
                if(cur.right!=null){
                    queue.add(cur.right);
                }
            }
            if (queue.size() == 0) {
                return ans;
            }
            ans++;
        }
        return ans;
    }
}