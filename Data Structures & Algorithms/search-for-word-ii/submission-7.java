class Solution {

    int row ;
    int col ;
    Set<Pair<Integer,Integer>> visited = new HashSet<>();



    boolean dfs(char[][] board, String word,int i, int j,int index){

            if(word.length()==index)
                return true;
            if(i>=row||j>=col||i<0||j<0|| word.charAt(index)!= board[i][j])

                    return false;

            
            board[i][j]='#';
    
            boolean res= dfs(board,word,i+1,j,index+1)||dfs(board,word,i-1,j,index+1)||
                    dfs(board,word,i,j+1,index+1)||dfs(board,word,i,j-1,index+1);
 
            board[i][j]=word.charAt(index);


            return res;
             


    }

    public List<String> findWords(char[][] board, String[] words) {
        

        List<String> result = new ArrayList<>();

         row= board.length;
         col =board[0].length;


         for(String s:words){
            boolean flag= false;

            for(int i=0;i<row && !flag;i++){
 
                 for(int j=0;j<col;j++){

                     if(s.charAt(0)!=board[i][j])
                          continue;

                     if(dfs(board,s,i,j,0)){
                        result.add(s);
                        flag=true;
                        break;

                     } 

                 }


            }

        }
        
       return result;

    }
}
