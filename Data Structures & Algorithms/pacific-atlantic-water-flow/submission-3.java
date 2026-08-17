class Solution {

       int row,col;

       int[][] direction={ {-1,0},{1,0},
                        {0,-1},{0,1}
       };
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        
               row=heights.length;
               col=heights[0].length;

               HashSet<Pair<Integer,Integer>> pacific= new HashSet<>();
               HashSet<Pair<Integer,Integer>> atlantic= new HashSet<>();
               List<List<Integer>> res =new ArrayList<>();
               for(int i=0;i<row;i++){
                  for(int j=0;j<col;j++){

                     if(i==0||j==0){

                            dfs(i,j,heights,pacific);
                     }
                     if(i==row-1||j==col-1){
                            
                            dfs(i,j,heights,atlantic);

                     }
                  }
               }

              for(int i=0;i<row;i++){
                     for(int j=0;j<col;j++){

                     if(pacific.contains(new Pair<>(i,j)) 
                     && atlantic.contains(new Pair<>(i,j)))
                      res.add(Arrays.asList(i,j));


                     }

              }
         return res;

    }


    void dfs(int i,int j,int[][] heights,HashSet<Pair<Integer,Integer>> ocean){

                 ocean.add(new Pair<>(i,j));

             for(int[] d:direction){

                   int nr=i+d[0];
                   int nc=j+d[1];

               if(nr>=0 && nr<row && nc>=0 && nc < col 
               && !ocean.contains(new Pair<>(nr,nc)) 
               && heights[nr][nc]>= heights[i][j]){
                     dfs(nr,nc,heights,ocean);
               }



             }



    }
}
