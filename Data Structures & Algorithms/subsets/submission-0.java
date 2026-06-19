class Solution {
    List<List<Integer>> list ;
    public List<List<Integer>> subsets(int[] nums) {
    list =new ArrayList<>();
    solve(nums,0,new ArrayList<>());
return list;
    }
    public void solve(int[] nums,int ind,List<Integer> temp){
        if(ind>=nums.length){
            list.add(new ArrayList<>(temp));
            return ;
        }
        temp.add(nums[ind]);
        solve(nums,ind+1,temp);
        temp.remove(temp.size()-1);
        solve(nums,ind+1,temp);
    }
}
