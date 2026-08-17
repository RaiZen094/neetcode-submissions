class Solution {

       HashMap<Integer,List<Integer>> graph= new HashMap<>();
       HashSet<Integer> visiting = new HashSet<>();
    public boolean canFinish(int numCourses, int[][] prerequisites) {

       for(int i=0;i<numCourses;i++){

              graph.put(i,new ArrayList<>());
       }


       for(int[] c: prerequisites ){

              graph.get(c[0]).add(c[1]);
       }
      
      for(int i=0;i<numCourses;i++){

       if(cycle(i))
           return false;
      }
      

          return true;
             

        
    }

    boolean cycle(int i){

       if(visiting.contains(i))
               return true;
       
       if(graph.get(i).isEmpty())
                return false;
       visiting.add(i);

       for(int j: graph.get(i)){

              if(cycle(j))
                  return true;
       }
       
       visiting.remove(i);
       graph.put(i,new ArrayList<>());

       return false;



    }
}
