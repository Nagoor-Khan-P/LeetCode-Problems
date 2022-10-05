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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0)
            return null;
        ListNode head=lists[0];
        for(int i=1;i<lists.length;i++){
            head=mergeTwoSortedLists(head,lists[i]);
        }
        return head;
    }
    public static ListNode mergeTwoSortedLists(ListNode head1, ListNode head2){
        ListNode head=new ListNode();//dummy Node
        ListNode cur=head;
        while(head1!=null && head2!=null){
            if(head1.val<head2.val){
                cur.next=head1;
                head1=head1.next;
                cur=cur.next;
            }
            else{
                cur.next=head2;
                head2=head2.next;
                cur=cur.next;
            }
        }
        //add remaining elements
        while(head1!=null){
            cur.next=head1;
            head1=head1.next;
            cur=cur.next;
        }//add remaining elements from list 2
        while(head2!=null){
            cur.next=head2;
            head2=head2.next;
            cur=cur.next;
        }
        return head.next;
    }
}