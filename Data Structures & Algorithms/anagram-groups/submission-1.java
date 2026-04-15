class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map =new HashMap<>();
        for(String str:strs){
           int[] freq=new int[26];
           for(char ch:str.toCharArray()){
            freq[ch-'a']++;
           }
           StringBuilder sb=new StringBuilder();
           for(int f:freq)sb.append(f).append("*");
           String s=new String(sb);
            if(!map.containsKey(s)){
               map.put(s,new ArrayList<>());

            }
           map.get(s).add(str);
        }
      return new ArrayList<>(map.values()); 
    }
}
