class Solution {
    public int maxProduct(int[] nums) {
       int curMax=1,curMin=1;

       int res=nums[0];

       for(int i=0;i<nums.length;i++){

          int temp=curMax*nums[i];

          curMax=Math.max(Math.max(nums[i],temp),nums[i]*curMin);

          curMin=Math.min(Math.min(nums[i],temp),nums[i]*curMin);


          res=Math.max(curMax,res);


       }
       return res;
    }
}
