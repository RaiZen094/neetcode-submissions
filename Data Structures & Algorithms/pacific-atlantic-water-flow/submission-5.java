class Solution {

    int row,col;
    
    public boolean isPacific(int i, int j, int[][] heights, int h, boolean[][] visited){

           
           if(i<0||j<0||i>=row||j>=col||heights[i][j]>h||visited[i][j])
                  return false;

           if((i==0||j==0))
                 return true;
            
           visited[i][j]=true;


           boolean res= isPacific(i+1,j,heights,heights[i][j],visited) ||
                        isPacific(i-1,j,heights,heights[i][j],visited) || 
                        isPacific(i,j+1,heights,heights[i][j],visited) ||
                        isPacific(i,j-1,heights,heights[i][j],visited);
           return res;

    }

    public boolean isAtlantic(int i, int j, int[][] heights, int h,boolean[][] visitedp){


          if(i<0||j<0||i>=row||j>=col||heights[i][j]>h||visitedp[i][j])
                  return false;
          
           if((i==row-1||j==col-1))
                 return true;
            
            visitedp[i][j]=true;


           boolean res= isAtlantic(i+1,j,heights,heights[i][j],visitedp) ||
                        isAtlantic(i-1,j,heights,heights[i][j],visitedp) || 
                        isAtlantic(i,j+1,heights,heights[i][j],visitedp) ||
                        isAtlantic(i,j-1,heights,heights[i][j],visitedp);
           return res;

    }



    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        row=heights.length;
        col=heights[0].length;

        List<List<Integer>> res = new ArrayList<>();

        
       

        for(int i=0;i<row;i++){

            for(int j=0;j<col;j++){

                 boolean[][] visitedp = new boolean[row][col];
                 boolean[][] visiteda = new boolean[row][col];
                if(isPacific(i,j,heights,heights[i][j],visitedp)&&
                   isAtlantic(i,j,heights,heights[i][j],visiteda)){

                          res.add(Arrays.asList(i,j));
                             
                   }
                    
            }
        }
               return res;
    }
}
