class Solution {
    public int coinChange(int[] coins, int amount) {

        int[] dp = new int[amount+1];

        Arrays.fill(dp,99999);

        dp[0]=0;

        for(int i=1;i<=amount;i++){

            for(int c: coins){
               
               if(c>i)
                  continue;

               dp[i]=Math.min(dp[i],dp[i-c]+1);

            }

        }
        if(dp[amount]==99999)
              return -1;

        return dp[amount];
    }
}
