/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {

        Node tmp = head;

        HashMap<Node,Node> nMap = new HashMap<>();


        while(head!= null){
         nMap.putIfAbsent(head,new Node(head.val));
         head=head.next;

        }

        head=tmp;

        while(head!=null){

          nMap.get(head).next=(nMap.get(head.next));
          nMap.get(head).random=(nMap.get(head.random));

          head=head.next;

        }


        return nMap.get(tmp);


        
        
    }
}
