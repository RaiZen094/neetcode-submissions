class Solution {

    HashMap<Integer,List<Integer>> graph = new HashMap<>();
    HashSet<Integer> visited= new HashSet<>();
    public boolean validTree(int n, int[][] edges) {

        if(n-1!=edges.length)
              return false;

        for(int i=0;i<n;i++){

            graph.put(i,new ArrayList<>());

        }

        for(int[] edge: edges){

            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);

        }

        dfs(0);

        if(visited.size()==n)
             return true;
        else
             return false;
      

         
    }

    void dfs(int i){

          
           if(visited.contains(i))
                    return;

           visited.add(i);

           if(graph.get(i).isEmpty())
                    return;
         

           for(int j:graph.get(i)){
 
                  dfs(j);
           }

           return;

    }


}
