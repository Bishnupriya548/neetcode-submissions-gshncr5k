class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        solve(ans,nums,new ArrayList<>());
        return ans;
    }
    void solve(List<List<Integer>> ans,int[] nums,List<Integer> list){
        if(list.size()==nums.length){
            ans.add(new ArrayList<>(list));
        }
        else {
            for(int n:nums){
             if(list.contains(n))continue;
             list.add(n);
             solve(ans,nums,list);
             list.remove(list.size()-1);
            }
        }
    }
}