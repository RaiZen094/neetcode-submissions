class Solution:
    def coinChange(self, coins: List[int], amount: int) -> int:

        dp=[9999999]*(amount+1)

        dp[0] = 0

        
        for t in range(1,amount+1):
            for c in coins:
                if c>t:
                    continue
                dp[t]=min(1+dp[t-c],dp[t])

        return -1 if dp[amount]==9999999 else dp[amount]




        
        