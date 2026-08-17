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
    public void reorderList(ListNode head) {
        ListNode l1=head;
        ListNode l2= head.next;
        ListNode prev=null;

        while(l2!=null && l2.next!=null){
            l1=l1.next;
            l2=l2.next.next;
            
        }
        ListNode curr=l1.next;
        l1.next=prev;
        while(curr != null){     
            ListNode temp= curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }

        curr=head;
        l1=prev;

        while(l1!=null){
        
        ListNode temp1=curr.next;
        ListNode temp2=l1.next;
        curr.next=l1;
        l1.next=temp1;
        curr=temp1;
        l1=temp2;
        }

        
    }
}
