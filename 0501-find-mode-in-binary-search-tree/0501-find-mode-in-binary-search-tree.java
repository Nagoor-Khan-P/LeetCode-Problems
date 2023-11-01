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
    class Element{
        int value;
        int freq;
        Element(int value, int freq) {
            this.value = value;
            this.freq = freq;
        }
    }

    PriorityQueue<Element> pq = new PriorityQueue<>((a,b) -> b.freq-a.freq);
    Map<Integer, Integer> map = new HashMap<>();
    List<Integer> list = new ArrayList<>();
    public int[] findMode(TreeNode root) {
        trverseTree(root);

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            pq.offer(new Element(entry.getKey(), entry.getValue()));
        }

        Element modeEl = pq.poll();
        int mode = modeEl.value;
        int maxFreq = modeEl.freq;

        list.add(mode);
        //Trverse pq to find if we have any modes with same frequency
        while(!pq.isEmpty()){
            Element el = pq.poll();
            if(el.freq == maxFreq) {
                list.add(el.value);
            }
        }

        return list.stream().mapToInt(i -> i).toArray();
    }

    public void trverseTree(TreeNode root) {
        if(root == null) {
            return;
        }
        map.put(root.val, map.getOrDefault(root.val, 0)+1);
        trverseTree(root.left);
        trverseTree(root.right);
    }

}