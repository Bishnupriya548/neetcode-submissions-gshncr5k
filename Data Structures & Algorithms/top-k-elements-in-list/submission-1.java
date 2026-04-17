class Solution {
    public int[] topKFrequent(int[] nums, int k) {
         Map<Integer, Integer> map = new HashMap<>();
        List<Integer>[] freq = new List[nums.length + 1];

        for (int i = 0; i < freq.length; i++) {
            freq[i] = new ArrayList<>();
        }

        for (int n : nums) {
           map.put(n, map.getOrDefault(n, 0) + 1);
    }
    for(Map.Entry<Integer,Integer> e:map.entrySet()){
        freq[e.getValue()].add(e.getKey());
    }
    int[] res=new int[k];
   int ind=0;
    for(int i=freq.length-1 ;i>0 && k>0;i--){
        for(int n:freq[i]){
            res[ind++]=n;
            k--;
            if(k==0)break;
        }
    }
    return res;
    }
}
