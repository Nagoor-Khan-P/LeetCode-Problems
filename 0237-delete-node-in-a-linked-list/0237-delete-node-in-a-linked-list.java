/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        ListNode cur=node;
        ListNode prev=null;
        while(cur.next!=null){
            cur.val=cur.next.val;
            prev=cur;
            cur=cur.next;
        }
        prev.next=null;
    }
}