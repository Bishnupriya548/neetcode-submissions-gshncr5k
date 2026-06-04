class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq=new int[26];
        int maxFreq=0;
        for(char c:tasks){
            freq[c-'A']++;
            
        }
        for(int cnt:freq){
            maxFreq=Math.max(maxFreq,cnt);
        }
        int maxCnt=0;
        for(int cnt:freq){
            if(cnt==maxFreq)maxCnt++;
        }
        int interval=(maxFreq-1)*(n+1)+maxCnt;
        return Math.max(interval,tasks.length);

    }
}
