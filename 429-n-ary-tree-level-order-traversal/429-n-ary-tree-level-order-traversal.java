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
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> list=new ArrayList<>();
        Queue<Node> queue=new LinkedList<>();
        if(root==null)
            return list;
        queue.offer(root);
        while(!queue.isEmpty()){
            int len=queue.size();
            List<Integer> level=new ArrayList<>();
            for(int i=0;i<len;i++){
                Node cur=queue.poll();
                for(int j=0;j<cur.children.size();j++){
                    queue.add(cur.children.get(j));
                }
                level.add(cur.val);
            }
            list.add(level);
        }
        return list;
    }
}