class Solution {
    public String minWindow(String s, String t) {
        if(t.isEmpty() || s.length()<t.length())return "";
        int n=s.length();
        int m=t.length();
        int[] res={-1,-1};
        int resLen=Integer.MAX_VALUE;
        HashMap<Character,Integer> mapT=new HashMap<>();
        for(char c:t.toCharArray()){
            mapT.put(c,mapT.getOrDefault(c,0)+1);
        }
        for(int i=0;i<n;i++){
            HashMap<Character,Integer> mapS=new HashMap<>();
            for(int j=i;j<n;j++){
                char c=s.charAt(j);
                  mapS.put(c,mapS.getOrDefault(c,0)+1);
                  boolean flag=true;
                  for(char ch:mapT.keySet()){
                    if(mapS.getOrDefault(ch,0)<mapT.get(ch)){
                        flag=false;
                        break;
                    }
                  }
                  if(flag  && j-i+1<resLen){
                    res[0]=i;
                    res[1]=j;
                    resLen=j-i+1;
                  }
            }
        }
        return resLen==Integer.MAX_VALUE ? "":s.substring(res[0],res[1]+1);

    }
}
