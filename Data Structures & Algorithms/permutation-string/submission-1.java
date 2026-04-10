class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1=s1.length();
        int n2=s2.length();
        s1=sort(s1);
        for(int i=0;i<=n2-n1;i++){
            if(s1.equals(sort(s2.substring(i,i+n1))))return true;
        }
        return false;
    }
    String sort(String s){
        char[] arr=s.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}
