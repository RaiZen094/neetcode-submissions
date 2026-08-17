class Solution {
    public int search(int[] nums, int target) {

        int l=0, r=nums.length-1;

        int mid = (r-l)/2;

        int res=-1;
       

        

        while(l<=r){
 
          if(nums[mid]==target){
            return mid;
          }

          else if(nums[mid]>target){
              r=mid-1;
              mid=l+(r-l)/2;

          }
           if(nums[mid]<target){
               l=mid+1;
               mid=l+(r-l)/2;
          }
        
        
        }

        return res;
        
    }
}
