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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        if(root==null)
            return list;
        queue.offer(root);
        //Basic level order traversal of a binary tree take a queue insert root and iteratr till queue is empty 
        //add the children of the every element in the queue
        //that means every time queue contains the one level of elements so every time we poll the that level elements and add next level elements
        
        while(!queue.isEmpty()){
            int len=queue.size();
            List<Double> level=new ArrayList<>();
            for(int i=0;i<len;i++){
                if(queue.peek().left!=null){
                    queue.offer(queue.peek().left);
                }
                if(queue.peek().right!=null){
                    queue.offer(queue.peek().right);
                }
                level.add(Double.valueOf(queue.poll().val));
            }
            double sum=0.0D;
            int l=level.size();
            for(double d: level){
                sum+=d;
            }
            list.add(sum/l);
        }
        return list;
    }
}