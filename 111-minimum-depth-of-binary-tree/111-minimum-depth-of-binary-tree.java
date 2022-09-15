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
    public int minDepth(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        if(root==null)
            return 0;
        queue.offer(root);
        int ans=1;
        while(!queue.isEmpty()){
            int len=queue.size();
            for(int i=0;i<len;i++){
                TreeNode cur=queue.poll();
                if(cur.left==null && cur.right==null)
                    return ans;
                if(cur.left!=null){
                    queue.offer(cur.left);
                }
                if(cur.right!=null){
                    queue.offer(cur.right);
                }
            }
            ans++;
        }
        return ans;
    }
}