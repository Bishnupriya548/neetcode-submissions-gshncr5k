class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(candidates);
        findSum(0,candidates,target,ans,new ArrayList<>());
        return ans;
    }
    public void findSum(int ind,int[] arr,int k,List<List<Integer>> ans,List<Integer> list){
        if (k == 0 ) {
            ans.add(new ArrayList<>(list));
            return;
        }

        for (int i = ind; i < arr.length; i++) {
           if (i > ind && arr[i] == arr[i - 1]) continue;  
        if (arr[i] > k) break; 

            list.add(arr[i]);
            findSum(i + 1, arr, k - arr[i], ans, list);  
            list.remove(list.size() - 1);
        }
    
    }
}