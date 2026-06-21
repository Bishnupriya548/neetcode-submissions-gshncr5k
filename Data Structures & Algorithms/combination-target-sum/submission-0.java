class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        res=new ArrayList<>();
        solve(nums,target,0,new ArrayList<>());
        return res;
    }
    void solve(int[] nums,int t,int i,List<Integer> list){
       
            if(t==0){
                res.add(new ArrayList<>(list));
            return;
            }
            if(t<0 || i>=nums.length)return ;
        
        list.add(nums[i]);
        solve(nums,t-nums[i],i,list);
      list.remove(list.size()-1);
        solve(nums,t,i+1,list);
    }
}
