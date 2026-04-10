class Solution:
    def findMin(self, nums: List[int]) -> int:
        minm=nums[0]
        l,r=0,len(nums)-1
        while l<=r:
            if nums[l]<nums[r]:
                minm=min(nums[l],minm)
                return minm
            mid=(l+r)//2
            minm=min(minm,nums[mid])
            if nums[l]>nums[mid]:
                r=mid-1
            else:
                l=mid+1
        return minm
        
        