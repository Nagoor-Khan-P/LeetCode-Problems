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
    int sum = 0;
    int n = 0;
    int count = 0;
    public int averageOfSubtree(TreeNode root) {
        if(root == null) {
            return 0;
        }
        
        List<Integer> list = new ArrayList<>();
        sum=0;
        n=0;
        int avg = findAverage(root);
        System.out.println(avg + " " + root.val);
        if(avg == root.val) {
            count++;
        }
        averageOfSubtree(root.left);
        averageOfSubtree(root.right);
        //System.out.println(list);
        return count;
    }

    public int findAverage(TreeNode root) {
        
        if(root == null) {
            return 0;
        }
        sum += root.val;
        n++;
        //System.out.println(sum + " " + n);
        findAverage(root.left);
        findAverage(root.right);
        
        return sum/n;

    }

}