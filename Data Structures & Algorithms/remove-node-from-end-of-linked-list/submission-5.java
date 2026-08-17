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


        ListNode prev=null;
        ListNode curr=head;
        int count=1;
        int length=0;

        while(head!=null){
 
                ListNode next= head.next;
                head.next=prev;
                prev=head;
                head=next;
                length++;
        }

        head=prev;
        
        if(head==null)
                 return null;
        if(n==1){
             head=head.next;

              prev=null;

         while(head!=null){
                ListNode next= head.next;
                head.next=prev;
                prev=head;
                head=next;
             }

    
         return prev;
        }

        curr=head;

        while(count<n-1 && curr.next!=null){
           curr=curr.next;    
           count++;
        }



         if(curr.next!=null)
              curr.next=curr.next.next;
         
         prev=null;

         while(head!=null){
                ListNode next= head.next;
                head.next=prev;
                prev=head;
                head=next;
             }

    
         return prev;
      

    }
}
