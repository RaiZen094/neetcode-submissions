class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row= matrix.length, col = matrix[0].length;


        int l=0,r=row-1;
        int mid=0;
        

        while(l<=r){
         mid= r+l/2;
        
        if(target>matrix[mid][col-1]){
            l=mid+1;
            mid=(r+l)/2;
        }
        else if(target<matrix[mid][0]){
            r=mid-1;
            mid=(r+l)/2;
        }
        else{
            break;
        }

        }


        if(!(l<=r))
           return false;

        l=0;
        r=col-1;

        while(l<=r){

           int mid1=l+(r-l)/2;

           if(target>matrix[mid][mid1]){
            l=mid1+1;
           }

            else if(target<matrix[mid][mid1]){
            r=mid1-1;
           }

           else{
            return true;
           }


        }


        return false;
        
    }
}
