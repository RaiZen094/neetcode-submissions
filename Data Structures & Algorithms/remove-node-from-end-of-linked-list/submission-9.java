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
        ListNode first=head;
        ListNode second=new ListNode(0,head);
        ListNode res=second;

        int count=0;

        while(count<n){
               first=first.next;
               count++;
                }
        

        while(first!=null){
            first=first.next;
            second=second.next;
        }
        
        
         second.next=second.next.next;
        



        return res.next;

    }
}
