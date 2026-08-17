class Solution {
    HashSet<Integer> visited = new HashSet<>();
    List<List<Integer>> graph = new ArrayList<>();
    public int countComponents(int n, int[][] edges) {

        int count=0;

        for(int i=0;i<n;i++){

          graph.add(new ArrayList<>());

       }

        for(int[] edge : edges){

         graph.get(edge[0]).add(edge[1]);
         graph.get(edge[1]).add(edge[0]);


        }
      
       for(int i=0;i<n;i++){

           if(visited.contains(i))
               continue;
           else{
           dfs(i);
           count++;
           }

       }

        return count;
        

    }

    void dfs(int i){
 
         if(visited.contains(i))
              return;
         visited.add(i);

         for(int j: graph.get(i)){

            dfs(j);
         }

           return;

    }
}
