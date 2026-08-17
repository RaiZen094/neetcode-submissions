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
    public boolean hasCycle(ListNode head) {

        ListNode it=head;
        int i=-1;

        while(it!=null){

          if(it.next==null)
                break;
          else
                it=it.next.next;
                
          head=head.next;

          if(it!=null && head.val==it.val){
            i=0;
            break;
          }

        }

      if(i==-1)
         return false;
      else 
         return true;
        
    }
}
