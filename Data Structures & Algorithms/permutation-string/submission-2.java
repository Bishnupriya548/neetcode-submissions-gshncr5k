class Solution {
    public boolean checkInclusion(String s1, String s2) {
      int n1=s1.length();
      int n2=s2.length();
      if(n1>n2)return false;
      int[] freq=new int[26];
      for(char ch:s1.toCharArray()){
        freq[ch-'a']++;
      }  
      int l=0;
      for(int r=0;r<n2;r++){
        freq[s2.charAt(r)-'a']--;
        if(r-l+1>n1){
             freq[s2.charAt(l)-'a']++;
             l++;
        }
        if(AllZeroes(freq))return true;
      }
      return false;
    }
    boolean AllZeroes(int []nums){
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0)return false;
        }
        return true;
    }
}
