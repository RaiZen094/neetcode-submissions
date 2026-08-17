class Solution:
    def maxProfit(self, prices: List[int]) -> int:

        profit = 0
        
        right = 1
        left = 0


        while right<len(prices):

            if prices[left]>prices[right]:
                left=right
                right+=1

            else:
                profit=max(profit,prices[right]-prices[left])
                right+=1

        
        return profit

        


        