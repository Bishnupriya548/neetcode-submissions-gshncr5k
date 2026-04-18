class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int n:nums)set.add(n);
        int max=0;
        for(int num:nums){
            if(!set.contains(num-1)){
                int curr=num;
                int cnt=1;
                while(set.contains(curr)){
                    curr++;
                    cnt++;
                }
                max=Math.max(cnt-1,max);

            }
        }
        return max;
    }
}
