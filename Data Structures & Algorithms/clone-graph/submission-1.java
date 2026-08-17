/*
Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {

   
    HashMap<Node,Node> visited = new HashMap<>();

    public Node cloneGraph(Node node) {


        if(node == null)
           return null;
      
        return dfs(node);
    }


    Node dfs(Node node){
 

        
        if(visited.containsKey(node)){
            return visited.get(node);
        }
        Node n_Node= new Node(node.val);

        
        visited.put(node,n_Node);

        for(Node n:node.neighbors){
 
              Node nei_Node= dfs(n);
              n_Node.neighbors.add(nei_Node);
              
        }
        


        return n_Node;



    }
}