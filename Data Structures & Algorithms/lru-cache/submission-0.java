class Node{

    int key;
    int val;
    Node prev;
    Node next;
    public Node(int key, int val){
      this.key=key;
      this.val=val;
      this.prev=null;
      this.next=null;
    }

}



class LRUCache {
    

    HashMap<Integer,Node> cache;
    int cap;
    Node right;
    Node left;

    
    public LRUCache(int capacity) {
          this.cache = new HashMap<>();
          this.cap = capacity;
          this.right = new Node(0,0);
          this.left = new Node(0,0);
          this.right.prev=this.left;
          this.left.next=this.right;
    }
    private void remove(Node r){

         Node p = r.prev;
         Node n = r.next;

         p.next = n;
         n.prev = p;


    }

    private void insert(Node r){

       Node p = this.right.prev;
       p.next=r;
       r.prev=p;
       r.next=this.right;
       this.right.prev=r;

    }
    public int get(int key) {

      if(cache.containsKey(key)){

        Node n = cache.get(key);
        remove(n);
        insert(n);
        return n.val;

      }

      return -1;
        
    }
    
    public void put(int key, int value) {


        if(cache.containsKey(key)){
    
          remove(cache.get(key));
         
        }
        Node node = new Node(key,value);

        cache.put(key,node);

        insert(node);

        if(cache.size()>cap){

           Node lru = this.left.next;
           remove(lru);
           cache.remove(lru.key);

        }
    }
}
