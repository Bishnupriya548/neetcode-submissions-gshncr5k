class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        maxp=0
        buy=prices[0]
        for sell in prices:
            maxp=max(sell-buy,maxp)
            if(sell<buy):
                buy=sell
        return maxp