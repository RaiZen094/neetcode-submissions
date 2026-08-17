class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        profit=0

        maxP=len(prices)-1
        
        for i in range (len(prices)-2,-1,-1) :
                
                if(prices[maxP]>prices[i]):
                    temp=prices[maxP]-prices[i]
                    profit=max(profit,temp)
                else:
                    profit=max(0,profit)
                    maxP=i

        return profit


       

