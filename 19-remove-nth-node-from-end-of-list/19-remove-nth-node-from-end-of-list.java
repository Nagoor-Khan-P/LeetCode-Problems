/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //donw without using extra space
        if(head == null)
            return null;
        int count=0;
        ListNode cur=head;
        while(cur!=null){
            count++;
            cur=cur.next;
        }
        System.out.println(count);
        int rem=count-n;
        if(rem==0)
            return head.next;
        cur=head;
        ListNode prev=null;
        while(rem>0){
            prev=cur;
            cur=cur.next;
            rem--;
        }
        prev.next=cur.next;
        return head;
    }
}