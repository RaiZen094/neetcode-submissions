class Solution {

    int row,col;

    public Set<Pair<Integer,Integer>> visited = new HashSet<>();


    public boolean DFS(char[][] board, String word,int r, int c, int i){


                if(word.length()==i)
                   return true;

                if(c<0||r<0||c>=col||r>=row||board[r][c]!=word.charAt(i)|| visited.contains(new Pair<>(r,c)))
                   return false;

        visited.add(new Pair<>(r,c));

        boolean res= DFS(board,word,r+1,c,i+1)||DFS(board,word,r-1,c,i+1)||DFS(board,word,r,c+1,i+1)||DFS(board,word,r,c-1,i+1);


        visited.remove(new Pair<>(r,c));

        return res;


    }


    public boolean exist(char[][] board, String word) {
          row= board.length;
          col= board[0].length;



          for(int i=0; i<row; i++){
              for(int j=0;j<col;j++){
                  
                    if(DFS(board,word,i,j,0))
                       return true;
                  
              }

   
          }

          return false;
    }
}
