class Solution {
    int end;
    public int lengthOfLIS(int[] nums) {

        end=nums.length;


        return dfs(nums,0,-1);
        
    }

    public int dfs(int[] nums,int i,int j){

       int L1,L2=0;
       if(i==end)
           return 0;

       L1=dfs(nums,i+1,j);

       if(j==-1||nums[j]<nums[i])
            L2=1+dfs(nums,i+1,i);
 
        return Math.max(L1,L2);

    }
}
