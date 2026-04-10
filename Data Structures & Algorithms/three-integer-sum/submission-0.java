class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans= new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            for(int j=i+1;j<nums.length;j++){
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
                int rem= 0-(nums[i] + nums[j]);
                int low = j + 1, high = nums.length - 1;
                while (low <= high) {
                    int mid = low + (high - low) / 2;
                    if (nums[mid] == rem) {
                        ans.add(new ArrayList<>(Arrays.asList(nums[i],nums[j],rem)));
                        break;
                    } else if (nums[mid] < rem) low = mid + 1;
                    else high = mid - 1;
                }
            }
        }
        return ans;
    }
}