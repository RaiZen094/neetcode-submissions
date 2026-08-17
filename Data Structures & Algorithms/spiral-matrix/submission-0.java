class Solution {
        //HashSet<Pair<Integer>> visited= new HashSet<>();
       


    public List<Integer> spiralOrder(int[][] matrix) {

        int r=matrix[0].length,l=0,u=0,d=matrix.length;
        List<Integer> res = new ArrayList<>();
        while(l<r && u<d){

        for(int i=l;i<r;i++){

            res.add(matrix[u][i]);
        }

        u++;

        for(int i=u;i<d;i++){

            res.add(matrix[i][r-1]);
        }
        r--;

        if(!(l<r && u<d))
           break;

        for(int i=r-1;i>=l;i--){

            res.add(matrix[d-1][i]);

    
        }
        d--;

        for(int i=d-1;i>=u;i--){

             res.add(matrix[i][l]);
        }
        l++;


        }
         
         return res;
        
    }

}
