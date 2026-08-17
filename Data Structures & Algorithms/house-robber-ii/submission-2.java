class Solution {
    public int rob(int[] nums) {
        if(nums.length==1)
             return nums[0];

        int[] n1= Arrays.copyOfRange(nums,0,nums.length-1);

        int[] n2= Arrays.copyOfRange(nums,1,nums.length);

        return Math.max(rob_helper(n1),rob_helper(n2));     
        
    }

    int rob_helper(int[] n_Arr){

      int[] dp=new int[n_Arr.length];

      if(n_Arr.length==1)
          return n_Arr[0];

      dp[0]=n_Arr[0];
      dp[1]=Math.max(n_Arr[0],n_Arr[1]);

      for(int i=2;i<n_Arr.length;i++){
        dp[i]=Math.max(n_Arr[i]+dp[i-2],dp[i-1]);
      }
        return dp[n_Arr.length-1];
    }
}

