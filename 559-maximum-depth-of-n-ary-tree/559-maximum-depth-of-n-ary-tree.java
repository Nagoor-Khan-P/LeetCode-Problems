/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public int maxDepth(Node root) {
        Queue<Node> queue=new LinkedList<>();
        if(root == null){
            return 0;
        }
        queue.offer(root);
        int depth=0;
        while(!queue.isEmpty()){
            int len=queue.size();
            for(int i=0;i<len;i++){
                Node cur=queue.poll();
                for(Node child : cur.children){
                    queue.offer(child);
                }
            }
            depth++;
        }
        return depth;
    }
}