class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        ans=0
        sum=0
        for n in nums:
            sum=sum+n
        n=len(nums)
        expsum=n*(n+1)//2
        ans=expsum-sum
        return ans

        